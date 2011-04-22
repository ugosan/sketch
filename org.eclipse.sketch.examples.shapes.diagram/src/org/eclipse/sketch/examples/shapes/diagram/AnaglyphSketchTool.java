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

import java.util.ArrayList;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.SharedCursors;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.sketch.SketchTool;
import org.eclipse.sketch.clientobserver.ISketchListener;
import org.eclipse.sketch.examples.shapes.diagram.providers.ShapesElementTypes;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.RGB;

/**
 * Each tool that extends SketchTool may assign a SketchClient, who is responsible for receiving processed sketches from the API
 * @author ugo
 *
 */
public class AnaglyphSketchTool extends SketchTool {


	
	private Color cyan;
	private Color red;
	
	
	/**
	 * returns the class responsible for receiving sketches and creating elements
	 */
	public ISketchListener getClient(){
		
		return new MyLazySketchClient();
	}
	
	public AnaglyphSketchTool(){
		cyan = new Color(gc.getDevice(),0,0,250);
		red = new Color(gc.getDevice(),250,0,0);
	}
	
	
	@Override
	protected boolean handleDrag() {
		super.handleDrag();
		
		gc.setAlpha(50);
		Point point1 = points.get(points.size()-2);
		Point point2 = points.get(points.size()-1);
		
		gc.setForeground(cyan);
		int cx1 = point1.x + 10;
		int cy1 = point1.y;
		int cx2 = point2.x + 10;
		int cy2 = point2.y;
		
		gc.drawLine(cx1,cy1,cx2,cy2);

		gc.setForeground(red);
		int rx1 = point1.x - 10;
		int ry1 = point1.y;
		int rx2 = point2.x - 10;
		int ry2 = point2.y;
		
		gc.drawLine(rx1,ry1,rx2,ry2);
		
		
		return true;
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
		return new RGB(0,0,0);
	}

	@Override
	public Cursor getCursor() {	
		return SharedCursors.CROSS;
	}
	
	

}
