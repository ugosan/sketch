/*******************************************************************************
 * Copyright (c) 2010 Ugo Sangiorgi and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Ugo Sangiorgi <ugo.sangiorgi@gmail.com> - Initial contribution
 *******************************************************************************/
package org.eclipse.sketch;

import java.util.ArrayList;

import org.eclipse.sketch.agentobserver.ISketchManagerObserver;
import org.eclipse.sketch.chain.ConnectionHandler;
import org.eclipse.sketch.chain.GestureHandler;
import org.eclipse.sketch.chain.LevenshteinHandler;
import org.eclipse.sketch.chain.SketchChainHandler;
import org.eclipse.swt.widgets.Display;

/**
 * Agent that processes new sketches from the manager 
 * @author  Ugo Sangiorgi
 */
public class SketchRecognizer extends Thread implements ISketchManagerObserver {
	
	Display d = Display.getCurrent();

	public boolean done = false;
	private ArrayList<Sketch> sketches = new ArrayList<Sketch>();

	private SketchManager manager;

	private Object element;

	private SketchChainHandler getChain() {

		GestureHandler gesture = new GestureHandler();
		gesture.setManager(manager);

		ConnectionHandler first = new ConnectionHandler();
		first.setManager(manager);
		LevenshteinHandler second = new LevenshteinHandler();
		second.setManager(manager);

		gesture.setSuccessor(first);
		first.setSuccessor(second);

		return gesture;

	}

	public void run() {

		while (true) {
			if (!d.isDisposed()) {
				d.asyncExec(new Runnable() {
					public void run() {
						// System.out.println("waiting for sketches...");
						if (!sketches.isEmpty()) {
							
							for(int i=0;i<sketches.size();i++){
								Sketch sketch = sketches.get(i);
								sketches.remove(sketch);
								String debug = "-------------------------------------------------------------------------------------\n";
								debug += "RECAGENT sees a new sketch\n";
								debug += sketch;
							
								System.out.println(debug);

								SketchChainHandler result = getChain().perform(sketch);
								
								if(result instanceof ConnectionHandler){
									//TODO: bring all the code that resides inside the handler to here, for creation
								}else if(result instanceof GestureHandler){
									manager.notifyNewGesture(sketch);
								}else if(result instanceof LevenshteinHandler){
									manager.notifyNewSketch(sketch);									
								}
							
								SketchBank.getInstance().dump();
							}
						}

					}
				});

				/*
				 * do normalize, post-processing here
				 */

				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					//it will be interrupted eventually
					//e.printStackTrace();
				}
			}

		}

	}


	//manager says "I have a new sketch, deal with it"
	@Override
	public void update(Sketch s) {		
		sketches.add(s);		
	}

	public void setManager(SketchManager sketchManager) {
		this.manager = sketchManager;
	}

	public void setElement(Object element) {
		this.element = element;
	}

	public Object getElement() {
		return element;
	}


}
