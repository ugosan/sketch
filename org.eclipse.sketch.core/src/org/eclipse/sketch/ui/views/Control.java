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
package org.eclipse.sketch.ui.views;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.NodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.dialogs.InputDialog;
import org.eclipse.sketch.Sketch;
import org.eclipse.sketch.SketchBank;
import org.eclipse.sketch.clientobserver.ISketchListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.ProgressBar;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.layout.RowData;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class Control extends Composite implements ISketchListener {

	protected Label label = null;
	protected Spinner spinner = null;
	protected Label label1 = null;
	protected Label label2 = null;
	protected Button button = null;
	protected List list = null;
	protected Composite composite = null;
	protected Spinner spinner2 = null;
	protected Label label3 = null;
	protected Composite composite1 = null;
	protected Button radioButton2 = null;
	protected Button radioButton1 = null;
	protected Button button21 = null;
	protected Label label21 = null;
	protected FormToolkit formToolkit = null;   //  @jve:decl-index=0:visual-constraint=""
	protected Combo combo = null;
	protected ArrayList<Object> types;  //  @jve:decl-index=0:
	protected Sketch sketch;
	protected Label label5 = null;
	protected Spinner spinner1 = null;
	protected Composite composite4 = null;
	protected Button samplescheckBox = null;
	protected Button interpcheckBox = null;
	private Button button1 = null;
	public Control(Composite parent, int style) {
		super(parent, style);
		initialize();
	}

	@SuppressWarnings("unused")
	protected void initialize() {
		label21 = new Label(this, SWT.NONE);
		label21.setText("Recognition");
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		gridLayout.verticalSpacing = 2;
		gridLayout.makeColumnsEqualWidth = true;
		createComposite1();
		Label filler5 = new Label(this, SWT.NONE);
		label = new Label(this, SWT.NONE);
		label.setText("Grid Size");
		label.setToolTipText("");
		spinner = new Spinner(this, SWT.BORDER);
		spinner.setMaximum(20);
		spinner.setPageIncrement(2);
		spinner.setSelection(2);
		spinner.setMinimum(1);
		Label filler15 = new Label(this, SWT.NONE);
		Label filler16 = new Label(this, SWT.NONE);
		createComposite4();
		Label filler14 = new Label(this, SWT.NONE);
		label1 = new Label(this, SWT.NONE);
		label1.setText("Tolerance");
		createComposite();
		list = new List(this, SWT.NONE);
		label5 = new Label(this, SWT.NONE);
		label5.setText("Line Width");
		spinner1 = new Spinner(this, SWT.NONE);
		spinner1.setMaximum(10);
		spinner1.setSelection(1);
		Label filler3 = new Label(this, SWT.NONE);
		label2 = new Label(this, SWT.NONE);
		label2.setText("Options");
		button = new Button(this, SWT.NONE);
		Label filler13 = new Label(this, SWT.NONE);
		button.setText("Reset Database");
		button.setToolTipText("Restore the database to its original state");
		button.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseDown(MouseEvent e) {
				
				 MessageBox messageBox = new MessageBox(getShell(), SWT.ICON_QUESTION
				            | SWT.YES | SWT.NO);
				        messageBox.setMessage("Are you sure?");
				        messageBox.setText("Clear Database");
				        int response = messageBox.open();
				        if (response == SWT.YES){
				        	SketchBank.getInstance().reset();
				        	setTypes(SketchBank.getInstance().getAvailableTypes());
				        }
				          
			}

			@Override
			public void mouseUp(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		
		this.setLayout(gridLayout);
		
		
		this.setSize(new Point(353, 319));
		createCombo();
		/*Label filler2 = */new Label(this, SWT.NONE);
		/*Label filler4 = */new Label(this, SWT.NONE);
		button1 = new Button(this, SWT.NONE);
		button1.setText("ok");
		button1.addMouseListener(new MouseListener(){

			@Override
			public void mouseDoubleClick(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseDown(MouseEvent e) {
				if(combo.getSelectionIndex()<(combo.getItemCount()-1)){
					disableNewSketch();
					if(combo.getSelectionIndex()!=0){				
						
						System.out.println("selected is "+types.get(combo.getSelectionIndex()-1));
						SketchBank.getInstance().add(types.get(combo.getSelectionIndex()-1), sketch.getDna());
						SketchBank.getInstance().dump();
						SketchBank.getInstance().fetch();
						
						PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor().setFocus();
						
					}
				}else{
					//new element
					
					InputDialog input = new InputDialog(getShell(),"Enter the element's name","Name:","", null);
					input.open();
						
					String type = input.getValue();
					
					SketchBank.getInstance().insert(type);
					SketchBank.getInstance().add(type, sketch.getDna());
					SketchBank.getInstance().dump();
					SketchBank.getInstance().fetch();					
					
					setTypes(SketchBank.getInstance().getAvailableTypes());
					disableNewSketch();
				}
			}

			@Override
			public void mouseUp(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

	/**
	 * This method initializes composite	
	 *
	 */
	protected void createComposite() {
		RowData rowData = new org.eclipse.swt.layout.RowData();
		rowData.width = 40;
		RowLayout rowLayout = new RowLayout();
		rowLayout.type = org.eclipse.swt.SWT.HORIZONTAL;
		GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = org.eclipse.swt.layout.GridData.BEGINNING;
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.BEGINNING;
		composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(gridData);
		composite.setLayout(rowLayout);
		spinner2 = new Spinner(composite, SWT.NONE);
		
		spinner2.setIncrement(100);
		
		spinner2.setMinimum(10);
		spinner2.setToolTipText("How long the recognizer must wait until it decides you finished sketching");
		spinner2.setLayoutData(rowData);
		spinner2.setMaximum(5000);
		spinner2.setSelection(1600);
		
		label3 = new Label(composite, SWT.NONE);
		label3.setText("ms");
	}

	/**
	 * This method initializes composite1	
	 *
	 */
	protected void createComposite1() {
		RowLayout rowLayout1 = new RowLayout();
		rowLayout1.type = org.eclipse.swt.SWT.VERTICAL;
		composite1 = new Composite(this, SWT.NONE);
		composite1.setLayout(rowLayout1);
		radioButton1 = new Button(composite1, SWT.RADIO);
		radioButton1.setText("Sketched");
		radioButton1.setToolTipText("Sketched: will represent the element with your drawing");
		radioButton1.setSelection(true);
		radioButton2 = new Button(composite1, SWT.RADIO);
		radioButton2.setText("Beautified");
		radioButton2.setEnabled(false);
		radioButton2.setToolTipText("Beautified: will represent the element with its canonical form");
	}

	/**
	 * This method initializes formToolkit	
	 * 	
	 * @return org.eclipse.ui.forms.widgets.FormToolkit	
	 */
	protected FormToolkit getFormToolkit() {
		if (formToolkit == null) {
			formToolkit = new FormToolkit(Display.getCurrent());
		}
		return formToolkit;
	}

	/**
	 * This method initializes combo	
	 *
	 */
	protected void createCombo() {
		combo = new Combo(this, SWT.NONE);
		
	}
	
	protected void enableNewSketch(Sketch s){
		
		combo.setEnabled(true);
		button1.setEnabled(true);
	}
	
	
	protected void disableNewSketch(){
		
		combo.setEnabled(false);
		button1.setEnabled(false);
	}
	
	@Override
	public void receiveNewProcessedSketch(Sketch s) {		
		this.sketch = s;
		setTypes(this.types);
		enableNewSketch(s);
	
	}

	public void setTypes(ArrayList<Object> types) {
		this.types = types;
		combo.removeAll();
		combo.add("New sketch! Please select");
		for(int i=0;i<types.size();i++){
			Object type = types.get(i);
			if(type instanceof IElementType)
				combo.add("It's a "+((IElementType)type).getDisplayName());
			else
				combo.add("It's a "+type);
		}	
		combo.add("----------------");
		combo.add("Add a new element...");
		combo.select(0);
		combo.pack();
		combo.redraw();
	}

	/**
	 * This method initializes composite4	
	 *
	 */
	private void createComposite4() {
		RowLayout rowLayout4 = new RowLayout();
		rowLayout4.type = SWT.HORIZONTAL;
		composite4 = new Composite(this, SWT.NONE);
		composite4.setLayout(rowLayout4);
		samplescheckBox = new Button(composite4, SWT.CHECK);
		samplescheckBox.setText("Show samples");
	}

	@Override
	public void receiveNewProcessedGesture(Sketch s) {
		// TODO Auto-generated method stub
		
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
