/*******************************************************************************
 * Copyright (c) 2010 The Eclipse Foundation and others.
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
import java.util.Iterator;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.sketch.agentobserver.ISketchManagerObserver;
import org.eclipse.sketch.agentobserver.ISubject;
import org.eclipse.sketch.clientobserver.ISketchListener;
import org.eclipse.sketch.clientobserver.ISketchProducer;

/**
 * The SketchManager is observed by many SketchElementRecognizers
 * SketchManager is also observed by many SketchClients
 */
public class SketchManager implements ISubject, ISketchProducer{


	private DiagramEditor editor;
	
	private Sketch sketch;


	private ArrayList<ISketchManagerObserver> observers = new ArrayList<ISketchManagerObserver>();
	private ArrayList<ISketchListener> clientObservers = new ArrayList<ISketchListener>();
	
	
	private IElementType conn_type;
	private IElementType dashed_conn_type;
	
	
	public SketchManager(){
		
		SketchRecognizer agent = new SketchRecognizer();			
		agent.setManager(this);
		agent.start();		
		attach(agent);
		
	}
	
	public void setTypeForConnection(IElementType type){
		conn_type = type;
	}
	
	public IElementType getTypeForConnection(){
		return conn_type;
	}
	
	public void setTypeForDashedConnection(IElementType type){
		dashed_conn_type = type;
	}
	
	public IElementType getTypeForDashedConnection(){
		return dashed_conn_type;
	}
	
	public void setEditor(DiagramEditor editor) {
		this.editor = editor;
	}
	
	public DiagramEditor getEditor() {
		return editor;
	}	
	
	public GraphicalViewer getViewer() {
		return (GraphicalViewer) getEditor().getAdapter(GraphicalViewer.class);
	}
	
	public void newSketch(Sketch s) {
		this.sketch = s;
		notifyAgents();
	}


	
	public void drawElement(IElementType element, Point location, Dimension size){
		CreateViewRequest createRequest = CreateViewRequestFactory.getCreateShapeRequest(element,editor.getDiagramEditPart().getDiagramPreferencesHint());

		createRequest.setLocation(location);
		createRequest.setSize(size);
		
		Command command = editor.getDiagramEditPart().getCommand(createRequest);
		
		command.execute();		
	}
	
	public void drawElement(Command c){
		
		c.execute();

	}
	
	
	/**
	 * Retrieves the NodeEditPart containing a given point
	 * 
	 * @param p
	 * @return
	 */
	public NodeEditPart isInsideSomePart(Point p){		
		Iterator i = editor.getDiagramEditPart().getChildren().iterator();
		while (i.hasNext()) {
			NodeEditPart object = (NodeEditPart) i.next();
			Rectangle r = object.getFigure().getBounds();
			if(r.contains(p))
				return object;
			
		}		
		return null;
	}

	
	@Override
	public void attach(ISketchManagerObserver ob) {
		observers.add(ob);				
	}
	
	@Override
	public void detach(ISketchManagerObserver ob) {
		observers.remove(ob);		
	}
	
	@Override
	public void notifyAgents() {
		for (int i = 0; i < observers.size(); i++) {
			ISketchManagerObserver ob = observers.get(i);

			ob.update(sketch);
		}		
	}

	@Override
	public void attach(ISketchListener ob) {
		clientObservers.add(ob);
	}

	@Override
	public void detach(ISketchListener ob) {
		clientObservers.remove(ob);
	}

	@Override
	public void notifyNewSketch(Sketch s) {
		for (int i = 0; i < clientObservers.size(); i++) {
			ISketchListener ob = clientObservers.get(i);

			ob.receiveNewProcessedSketch(s);
		}	
	}

	@Override
	public void notifyNewGesture(Sketch s) {
		for (int i = 0; i < clientObservers.size(); i++) {
			ISketchListener ob = clientObservers.get(i);

			ob.receiveNewProcessedGesture(s);
		}	
	}

	
	
}
