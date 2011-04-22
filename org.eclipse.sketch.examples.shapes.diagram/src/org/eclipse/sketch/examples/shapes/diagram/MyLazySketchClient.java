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

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.UpdateManager;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.SetPropertyCommand;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.render.editparts.RenderedDiagramRootEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.ChangePropertyValueRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.sketch.Sketch;
import org.eclipse.sketch.SketchPackage;
import org.eclipse.sketch.clientobserver.ISketchListener;
import org.eclipse.sketch.examples.shapes.Diagram;
import org.eclipse.sketch.examples.shapes.ShapesFactory;
import org.eclipse.sketch.examples.shapes.ShapesPackage;
import org.eclipse.sketch.examples.shapes.Triangle;
import org.eclipse.sketch.examples.shapes.diagram.edit.policies.DiagramCanonicalEditPolicy;
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

		Command selectNewelement = new Command(){
			
			public void execute() {
				GraphicalViewer viewer = (GraphicalViewer) editor.getAdapter(GraphicalViewer.class);
			    
				
				viewer.getControl().redraw();
				editor.getDiagramGraphicalViewer().getControl().redraw();
				
				viewer.getControl().setFocus();

				viewer.select(editor.getDiagramEditPart());
				//editor.getDiagramEditPart().refresh();
				 editor.getDiagramEditPart().getFigure().repaint(0, 0, 1000, 1000);
			}
		
		};
		
		

		try {
			emfOp.execute(new NullProgressMonitor(), null);
			//OperationHistoryFactory.getOperationHistory().execute(emfOp, null, null);
			ShapesDiagramUpdateCommand co = new ShapesDiagramUpdateCommand();
			co.execute(null);
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		/*EObject modelElement = ((View) ((EditPart) structuredSelection
				.getFirstElement()).getModel()).getElement();
		List editPolicies = CanonicalEditPolicy
				.getRegisteredEditPolicies(modelElement);
		for (Iterator it = editPolicies.iterator(); it.hasNext();) {
			CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it
					.next();
			nextEditPolicy.refresh();*/
		
		EObject modelElement = ((View) (editor.getDiagramEditPart().getModel())).getElement();
		List editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(modelElement);
		for (Iterator it = editPolicies.iterator(); it.hasNext();) {
			DiagramCanonicalEditPolicy nextEditPolicy = (DiagramCanonicalEditPolicy) it
			.next();
			nextEditPolicy.activate();
			nextEditPolicy.setEnable(true);
			nextEditPolicy.getViewer().getControl().redraw();
			nextEditPolicy.refresh();
		}
		
		/*for(Object o : editor.getDiagramEditPart().getChildren()){
		    if(o instanceof EditPart){//or ur costumized EditPart
		        EditPart editPart = (EditPart)o;
		        editPart.refresh();
		    }
		} */
		
		editor.getDiagramEditDomain().getDiagramCommandStack().execute(selectNewelement);
		
		editor.getDiagramGraphicalViewer().getRootEditPart().refresh();
		DiagramEditDomain domain = (DiagramEditDomain) editor.getDiagramEditDomain();
		RenderedDiagramRootEditPart rootEditPart = (RenderedDiagramRootEditPart)
		domain.getDiagramEditorPart().getDiagramGraphicalViewer().getRootEditPart(); 
		
		rootEditPart.refresh();
		rootEditPart.refreshVisuals();
		rootEditPart.refresh();
		
		editor.getEditorSite().getShell().redraw();
		
		
	}
	
	

	@Override
	public void receiveNewProcessedGesture(Sketch s) {
		
		
	}
	

}
