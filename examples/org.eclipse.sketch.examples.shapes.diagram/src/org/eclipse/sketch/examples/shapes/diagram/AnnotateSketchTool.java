/**
 * Copyright (c) 2010 The Eclipse Foundation and others.
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

import java.util.ArrayList;

import org.eclipse.gef.SharedCursors;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.sketch.SketchTool;
import org.eclipse.sketch.clientobserver.ISketchListener;
import org.eclipse.sketch.examples.shapes.diagram.providers.ShapesElementTypes;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.RGB;

/**
 * Each tool that extends SketchTool may assign a SketchClient, who is responsible for receiving processed sketches from the API
 * @author ugo
 *
 */
public class AnnotateSketchTool extends SketchTool {


	/**
	 * returns the class responsible for receiving sketches and creating elements
	 */
	public ISketchListener getClient(){
		return new MyAnnotationSketchClient();
	}
	
	@Override
	public ArrayList getTypes() {
		ArrayList types = new ArrayList();
		//types.add("Annotation");
		return types;
	}
	
	@Override
	public IElementType getConnection(){
		return ShapesElementTypes.Connection_4001;
	}
	
	@Override
	public IElementType getDashedConnection(){
		return ShapesElementTypes.DashedConnection_4002;
	}

	@Override
	public RGB getStrokeColor(){
		return new RGB(0,0,200);
	}

	@Override
	public Cursor getCursor() {	
		return SharedCursors.CROSS;
	}
	
	

}
