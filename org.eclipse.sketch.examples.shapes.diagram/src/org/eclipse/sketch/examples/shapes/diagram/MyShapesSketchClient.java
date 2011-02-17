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

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.dom.svg.SVGDOMImplementation;
import org.apache.batik.svggen.SVGGraphics2D;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.workspace.AbstractEMFOperation;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.sketch.Sketch;
import org.eclipse.sketch.clientobserver.ISketchListener;
import org.eclipse.sketch.examples.shapes.Diagram;
import org.eclipse.sketch.examples.shapes.ShapesFactory;
import org.eclipse.sketch.examples.shapes.ShapesPackage;
import org.eclipse.sketch.examples.shapes.Unknown;
import org.eclipse.sketch.examples.shapes.diagram.providers.ShapesElementTypes;
import org.eclipse.sketch.examples.shapes.diagram.util.Base64;
import org.eclipse.ui.PlatformUI;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;


/**
 * This class is responsible for receiving new and processed sketches
 * @author ugo
 *
 */
public class MyShapesSketchClient implements ISketchListener{

	/**
	 * Receives a Sketch object filled with results, every time a new sketch is processed
	 */
	@Override
	public void receiveNewProcessedSketch(Sketch s) {	
		
		createUnknownNode(s, createTempElementImage(s));
	}
	
	/**
	 * Creates a temporary Element node with an SVG file based on Sketch s. 
	 * @param s
	 */
	private File createTempElementImage(Sketch s){		
		//creates the image file			
		File imgfile = ResourcesPlugin.getWorkspace().getRoot().getLocation().append("sketch-"+System.currentTimeMillis()+".svg").toFile();
		try {
			// This is where the SVG Generator is instantiated
			DOMImplementation dom = GenericDOMImplementation.getDOMImplementation();			
			Document doc = dom.createDocument(SVGDOMImplementation.SVG_NAMESPACE_URI, "svg", null);
			
			SVGGraphics2D generator = new SVGGraphics2D(doc);
			generator.getGraphicContext().setStroke(new BasicStroke(2f));			
			generator.setStroke(new BasicStroke(2f));
			

			
			Dimension size = new Dimension(s.getSize().width,s.getSize().height);			
			generator.setSVGCanvasSize(size);
			
			
			
			
		    //translates the points to a 0,0 location and draws them as lines in the svg
			for(int i=0;i<s.getPoints().size();i++){
				Point p = s.getPoints().get(i);
				Point lastp = p;
				
				
				if(i>0){
					lastp = s.getPoints().get(i-1);
				}
				
				if(lastp.x==-1){
					//if the last point is a pen lift, then consider just the current one
					generator.drawLine(p.x - s.getLocation().x, p.y - s.getLocation().y, p.x - s.getLocation().x, p.y - s.getLocation().y);
					
				}else if(p.x>0){
					//if is a normal point, then traces a line from the last point to the current
					generator.drawLine(lastp.x - s.getLocation().x, lastp.y - s.getLocation().y, p.x - s.getLocation().x, p.y - s.getLocation().y);
				}

				
			}
			

			FileWriter file = new FileWriter(imgfile);

			PrintWriter writer = new PrintWriter(file);
			generator.stream(writer);

			writer.close();
			ResourcesPlugin.getWorkspace().getRoot().refreshLocal(1, new NullProgressMonitor());
			
		}catch(Exception e){
			e.printStackTrace();
			imgfile = null;
		}
		return imgfile;
		
	}
	
	
	private void createUnknownNode(final Sketch s, File file){
		try{
			CompoundCommand command = new CompoundCommand();
			
			//creates the sketch element and set the image encoded as Base64
			final Unknown unknown_element = ShapesFactory.eINSTANCE.createUnknown();
			unknown_element.eSet(ShapesPackage.Literals.SHAPE__SVG,  Base64.encodeFromFile(file.getPath()));
			
			this.setMeta(unknown_element, s);
			
			
			//discard the file
			file.delete();
			
			
			final DiagramEditor editor = (DiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

			CreateViewRequest.ViewDescriptor viewDescriptor = new CreateViewRequest.ViewDescriptor(
					new EObjectAdapter(unknown_element), Node.class, ((IHintedType)ShapesElementTypes.Unknown_2003).getSemanticHint(), true,
					editor.getDiagramEditPart().getDiagramPreferencesHint()); 

			viewDescriptor.setPersisted(true);
			

			CreateViewRequest createRequest = new CreateViewRequest(viewDescriptor);
			createRequest.setLocation(s.getLocation());
			createRequest.setSize(s.getSize());
			
			
			//command to add the element to the model
			Command c = new Command(){

				@Override
				public void execute() {
					AbstractEMFOperation emfOp = new AbstractEMFOperation(editor.getEditingDomain(), "Insert sketched element") {

						@Override
						protected IStatus doExecute(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
							
							DiagramImpl n = (DiagramImpl)editor.getDiagramEditPart().getModel();
							Diagram s = (Diagram) n.basicGetElement();
							s.getShapes().add(unknown_element);

							return Status.OK_STATUS;
						}
					};


					try {
						OperationHistoryFactory.getOperationHistory().execute(emfOp, null, null);
					} catch (ExecutionException e) {}
				}
			};

			
			Command selectNewelement = new Command(){
			
				public void execute() {
					GraphicalViewer viewer = (GraphicalViewer) editor.getAdapter(GraphicalViewer.class);
				    
					viewer.getControl().setFocus();
					
					//selects the last created element
				    NodeEditPart object = (NodeEditPart) editor.getDiagramEditPart().getChildren().get(editor.getDiagramEditPart().getChildren().size()-1);

					viewer.select(object);
	
				}
			
			};

			
			editor.getDiagramEditDomain().getDiagramCommandStack().execute(c);
			editor.getDiagramEditDomain().getDiagramCommandStack().execute(editor.getDiagramEditPart().getCommand(createRequest));
			editor.getDiagramEditDomain().getDiagramCommandStack().execute(selectNewelement);

			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	private void setMeta(Unknown unknown_element, Sketch s){
		//shows what this element is, nicely, with percentages			
		if(s.getResult().get(Sketch.ELEMENT_RESULT_KEY)!=null){
			HashMap<Object,Integer> resultmap = (HashMap<Object, Integer>) s.getResult().get(Sketch.ELEMENT_RESULT_KEY);
			
			String meta = "distances: ";
			
			String best_guess_element = "?";
			int best_guess_distance = 999;
			
			
			Iterator it = resultmap.keySet().iterator();
			while(it.hasNext()){
				String type = (String) it.next(); 
				
				int distance = resultmap.get(type);
				
				if(distance >=0 && distance < best_guess_distance){
					best_guess_distance = distance;
					best_guess_element = type;
				}
				
				meta += type+":"+distance+" ";
				
			}
			unknown_element.eSet(ShapesPackage.UNKNOWN__ELEMENT,best_guess_element);
			unknown_element.eSet(ShapesPackage.UNKNOWN__META,meta);
			System.out.println(unknown_element.getDna());
			unknown_element.eSet(ShapesPackage.UNKNOWN__DNA, s.getDna());
		}
		
	}

	@Override
	public void receiveNewProcessedGesture(Sketch s) {
		//process a new gesture
		
	}
	

}
