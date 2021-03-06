/**
 * Copyright (c) 2010 Ugo Sangiorgi and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *  Ugo Sangiorgi <ugo.sangiorgi@gmail.com> - Initial contribution
 *  
 *
 * $Id$
 */ 
 package org.eclipse.sketch.examples.shapes.diagram;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.sketch.Sketch;
import org.eclipse.sketch.clientobserver.ISketchListener;
import org.eclipse.sketch.examples.shapes.Diagram;
import org.eclipse.sketch.examples.shapes.ShapesPackage;
import org.eclipse.sketch.examples.shapes.diagram.part.ShapesDiagramUpdateCommand;
import org.eclipse.ui.PlatformUI;


/**
 * This class is responsible for receiving new and processed sketches
 * @author ugo
 *
 */
public class MyLazySketchClient implements ISketchListener{

	/**
	 * Receives a Sketch object filled with results, every time a new sketch is processed
	 */
	@Override
	public void receiveNewProcessedSketch(final Sketch s) {	
		
		
		final DiagramEditor editor = (DiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		
		final DiagramImpl d = (DiagramImpl) editor.getDiagramEditPart().getModel();

		
		AbstractEMFOperation emfOp = new AbstractEMFOperation(editor.getEditingDomain(), "Insert sketch") {

			@Override
			protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				
				final Sketch rootSketch = ((Diagram)d.getElement()).getRootSketch();

				if(rootSketch==null){
					DiagramImpl n = (DiagramImpl)editor.getDiagramEditPart().getModel();
					Diagram d = (Diagram) n.basicGetElement();
					d.eSet(ShapesPackage.DIAGRAM__ROOT_SKETCH, s);
					
					d.setRootSketch(s);
				}else{
					
					s.getPointlist().addAll(rootSketch.getPointlist());
					s.setWord(s.getWord().concat(rootSketch.getWord()));
					
					DiagramImpl n = (DiagramImpl)editor.getDiagramEditPart().getModel();
					Diagram d = (Diagram) n.basicGetElement();
					
					d.eSet(ShapesPackage.DIAGRAM__ROOT_SKETCH, s);
					
				}
				
				return Status.OK_STATUS;
			}
		};

		

		try {
			emfOp.execute(new NullProgressMonitor(), null);
			
			ShapesDiagramUpdateCommand co = new ShapesDiagramUpdateCommand();
			co.execute(null);
			editor.getDiagramEditPart().performRequest(new Request(RequestConstants.REQ_REFRESH));
			
			editor.getDiagramEditPart().getFigure().repaint(editor.getDiagramEditPart().getFigure().getBounds());

		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
	
	}
	
	

	@Override
	public void receiveNewProcessedGesture(Sketch s) {
		
		
	}
	

}
