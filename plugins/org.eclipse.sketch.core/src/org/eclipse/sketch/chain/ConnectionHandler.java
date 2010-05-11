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
package org.eclipse.sketch.chain;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredCreateConnectionViewAndElementCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.sketch.Sketch;

public class ConnectionHandler extends SketchChainHandler {
 
	 
	private SketchChainHandler successor;
	
	
	/**
	 *@see SketchChainHandler#setSuccessor(SketchChainHandler)
	 */	
	public void setSuccessor(SketchChainHandler s) {
		this.successor = s;
	}

	@Override
	public SketchChainHandler perform(Sketch sketch) {
		
		ArrayList<Point> points = sketch.getQuantizedPoints();
		
		Point first = points.get(1);
		//Point second = points.get(1);
		
		Point last = points.get(points.size()-3);
		//Point beforelast = points.get(points.size()-2);
		
		
		
		EditPart source = getElementContainingPoint(first);
		EditPart target = getElementContainingPoint(last);
		//System.out.println(first +" to "+last);
		
		if(source!=target){
		
		if(source!=null && target!=null){
			//its a connection
			
			String dna = sketch.getDna();
			int zeroes = 0;
			for(int i=0;i<dna.length();i++){
				if(dna.charAt(i)=='0')
					zeroes++;
			}
			
		
			
			
			if(zeroes>3){
				System.out.println("CONNECTION CHAIN: \n \t-its a DASHED connection");
				connect(source,target,manager.getTypeForDashedConnection());
			}else{
				System.out.println("CONNECTION CHAIN: \n \t-its a connection");			
				connect(source,target,manager.getTypeForConnection());
			}
			
			return this;
		}
		}
		
		System.out.println("CONNECTION CHAIN: not a connection");
		return successor.perform(sketch);
	}
	 
	
	
	
	/**
	 * Retrieves the NodeEditPart containing a given point
	 * @param p
	 * @return
	 */
	private NodeEditPart getElementContainingPoint(Point p){			
		List l = manager.getEditor().getDiagramEditPart().getChildren();
		for(int i=0;i<l.size();i++){
			NodeEditPart object = (NodeEditPart) l.get(i);
			Rectangle r = object.getFigure().getBounds();
			if(r.contains(p))
				return object;			
		}
		

		return null;
	}
	/**
	 * TODO: move somewhere else
	 * @param um
	 * @param dois
	 * @param type
	 */
	private void connect(EditPart um, EditPart dois, IElementType type) {
		try {

			DiagramEditPart container = (DiagramEditPart) manager.getEditor().getDiagramEditPart();
			CreateConnectionViewAndElementRequest c = new CreateConnectionViewAndElementRequest(type,((IHintedType) type).getSemanticHint(),container.getDiagramPreferencesHint());
			

			ICommand createConnCmd = new DeferredCreateConnectionViewAndElementCommand(c, (ShapeNodeEditPart)um, (ShapeNodeEditPart)dois, container.getViewer());

			CompoundCommand cc = new CompoundCommand();
			cc.add(new ICommandProxy(createConnCmd));
		
			Command selectNewelement = new Command(){
			
				public void execute() {
				
					ConnectionEditPart p = (ConnectionEditPart) manager.getEditor().getDiagramEditPart().getConnections().get(manager.getEditor().getDiagramEditPart().getConnections().size()-1);
					
					manager.getEditor().getDiagramGraphicalViewer().select(p);
	
					p.enableEditMode();
				}
			
			};
			
			cc.add(selectNewelement);
			
			manager.getEditor().getDiagramEditDomain().getDiagramCommandStack().execute(cc);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	 
}
 
