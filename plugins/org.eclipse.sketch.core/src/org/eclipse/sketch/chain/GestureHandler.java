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
package org.eclipse.sketch.chain;

import org.eclipse.gef.EditPart;
import org.eclipse.sketch.Sketch;

public class GestureHandler extends SketchChainHandler {

	private SketchChainHandler successor;

	@Override
	public  SketchChainHandler perform(Sketch sketch) {
		
		if(sketch.getDna().length()<3){
			EditPart e = manager.getEditor().getDiagramEditPart().getViewer().findObjectAt(sketch.getPoints().get(0));
			
			System.out.println("GESTURE CHAIN: it is a gesture");
			if(e!=null){
				manager.getEditor().getDiagramGraphicalViewer().select(e);	
			}
			return this;
		}
		
		System.out.println("GESTURE CHAIN: not a gesture");
		
		return successor.perform(sketch);
	}

			
	@Override
	public void setSuccessor(SketchChainHandler s) {
		this.successor = s;
	}

}
