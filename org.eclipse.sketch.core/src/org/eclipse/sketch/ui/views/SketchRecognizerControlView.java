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

import org.eclipse.sketch.SketchBank;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

// TODO move everything from ui to a separate plugin
public class SketchRecognizerControlView extends ViewPart{

	 /**
     * The ID of the view as specified by the extension.
     */
    public static final String ID = "org.eclipse.sketch.ui.views.SketchRecognizerControlView";

    
	Control control;
	public Control getControl() {
		return control;
	}

	public SketchRecognizerControlView() {
	}

	
	@Override
	public void createPartControl(Composite parent) {
		control = new Control(parent, SWT.NONE);
		control.disableNewSketch();
		
		
	}

	@Override
	public void setFocus() {
		control.setTypes(SketchBank.getInstance().getAvailableTypes());
	}



	public int getTolerance(){
		return control.spinner2.getSelection();
	}
	
	public int getGridSize(){
		return control.spinner.getSelection();
	}
	
	
	public boolean getSketchedRecognitionType(){
		return control.radioButton1.getSelection();
	}
	
	public boolean getShowSamples(){
		return control.samplescheckBox.getSelection();
	}
	
	public int getLineWidth(){
		return control.spinner1.getSelection();
	}

}
