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

package org.eclipse.sketch;

import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;

/**
 * Sketch object is created by the Recognizer and is responsible to hold all the information
 * regarding the recognition made somewhere else.
 * @author Ugo Sangiorgi
 */
public class Sketch 
{	
	/**
	 * Defines the DNA of a sketch. It is basically a String, with some useful methods
	 * (as reverting the DNA)
	 * @author Olivier Bourdoux <olivier.bourdoux@gmail.com>
	 */
	public static class Dna
	{
		private String value;
		
		public Dna(String v)
		{ value = v; }
		
		public String toString()
		{ return value; }
		
		/**
		 * @return the reverse DNA of this instance
		 */
		public Dna reverse()
		{
			StringBuffer out = new StringBuffer();
			StringBuffer buf = new StringBuffer();
			
			int l = value.length();
			for (int i=0; i!=l; ++i)
			{
				int c = Integer.parseInt(value.substring(i, i+1));
				
				if (c==0)
				{
					if (buf.length()!=0)
					{
						out.append(buf.reverse().append(0));
						buf = new StringBuffer();
					}
				}
				else
				{
					c = (c+3)%8+1; //computes the reverse direction
					buf.append(c);
				}
			}
			
			return new Dna(out./*reverse().*/toString());
		}
	}
// ------------------------------------------------------------------------------

	public static String ELEMENT_RESULT_KEY = "ELEMENT_RESULT_KEY_HashMap_IElementType_Integer";

	private ArrayList<Point> points = new ArrayList<Point>();
	private ArrayList<Point> quantizedPoints = new ArrayList<Point>();
	
	private Point location;
	private Dimension size;
	private Dna dna;
	
	
	//result of a computation
	private HashMap<String,Object> result = new HashMap<String,Object>();

	
	
	/**
	 * 
	 * @return the result of a computation regarding what this sketch is, in a map.
	 */
	public HashMap<String, Object> getResult() {
		return result;
	}

	public void setResult(HashMap<String, Object> result) {
		this.result = result;
	}

	/**
	 * 
	 * @return the Point relative to the diagram
	 */
	public Point getLocation() {
		if(location == null){
			location = computeLocation(quantizedPoints);
		}
		return location;
	}
	
	/**
	 * 
	 * @return the Dimension of this Sketch
	 */

	public Dimension getSize() {
		if(size == null){
			size = computeSize(quantizedPoints);
		}
		return size;
	}


	
	/**
	 * 
	 * @return the word representing this Sketch
	 */
	public String getDna() {
		if(dna==null)
			dna = buildDna();
		return dna.toString();
	}

	/* Olivier : DNA should not be changed outside of a sketch
	   public void setDna(String dna) {
		this.dna = dna;
	}
	
	public void appendDna(String character){
		dna += character;
	}*/
	
	/**
	 * turn this sketch into a word based on cardinal points:
	 * 1 means North, 2 NorthEast, 3 East, 4 SouthEast, 5 South, 6 SouthWest, 7 West, 8 NorthWest 
	 * 0 means a pen lift (another stroke)
	 * Based on work from Adrien Coyette, Sascha Schimke, Jean Vanderdonckt, and Claus Vielhauer - http://www.isys.ucl.ac.be/bchi/publications/2007/Schimke-Interact2007.pdf
	 * @return
	 */
	private Dna buildDna(){
		String s = "";

		for(int i=0;i<quantizedPoints.size();i++){
			if(i+1==quantizedPoints.size()){
				s += "";
				break;
			}

			int x1 = quantizedPoints.get(i).x;
			int y1 = quantizedPoints.get(i).y;

			int x2 = quantizedPoints.get(i+1).x;
			int y2 = quantizedPoints.get(i+1).y;

			int x = x2-x1;
			int y = y2-y1;

			if(x2==-1){
				s+="0";

			}else{

				if(x>0 && y>0){
					s+="4";
				}else if(x>0 && y==0){
					s+="3";
				}else if(x>0 && y<0){
					s+="2";
				}else if(x==0 && y<0){
					s+="1";
				}else if(x<0 && y<0){				
					s+="8";
				}else if(x<0 && y==0){
					s+="7";
				}else if(x<0 && y>0){
					s+="6";
				}else if(x==0 && y>0){
					s+="5";
				}
			}
		}


		return new Dna(s);
	}
	
	/**
	 * 
	 * @return an ArrayList with ALL the points (Point) of this Sketch
	 */
	public ArrayList<Point> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<Point> points) {
		this.points = points;		
	}

	/**
	 * 
	 * @return the ArrayList with the points on a grid (less points)
	 */
	public ArrayList<Point> getQuantizedPoints() {
		return quantizedPoints;
	}

	public void setQuantizedPoints(ArrayList<Point> quantizedPoints) {
		System.out.println(quantizedPoints);
		this.quantizedPoints = quantizedPoints;
	}
	
	/**
	 * Computes the size of the sketch based on the smallest and the biggest points
	 * @param points
	 * @return the size of the sketch 
	 */
	private Dimension computeSize(ArrayList<Point> points){
		Point p = points.get(0);
				
		int sx = p.x,sy = p.y;
		int bx = p.x,by = p.y;

		for(int i=0;i<points.size();i++){
			Point point = points.get(i);
			
			if(point.x>0){			
				if(point.x<=sx)
					sx = point.x;
			
				if(point.y<=sy)
					sy = point.y;
			
				if(point.x>=bx) 
					bx = point.x;
				if(point.y>=by)				
					by = point.y;
			}			
		}
		
		//relax by 5 pixels
		sx = sx-5;
		bx = bx+5;
		sy = sy-5;
		by = by+5;
		
		
		return new Dimension(bx-sx,by-sy);
	}
	
	private Point computeLocation(ArrayList<Point> points){
		Point p = points.get(1);
		
		int sx = p.x,sy = p.y;

		for(int i=0;i<points.size();i++){
			Point point = points.get(i);
			
			if(point.x>0){			
				if(point.x<=sx)
					sx = point.x;
			
				if(point.y<=sy)
					sy = point.y;

			}			
		}
		
		return new Point(sx,sy);		
	}

	@Override
	public String toString() {
		String s = "[Sketch]";
		s += "\n\tWord (dna): [" + getDna() + "]";
		s += "\n\tpoints: "
			+ getPoints().size() + " registered, "
			+ getQuantizedPoints().size()
			+ " processed";
		s += "\n\tSize: "+getSize() +" | Location: "+getLocation();		
		s += "\n\tComputed Result: "+result;
		return s;
	}
	
	/**
	 * Test method for Sketch.Dna
	 */
	public static void main(String args[])
	{
		Sketch.Dna dna = new Sketch.Dna("11111012340");
		Sketch.Dna dna2 = new Sketch.Dna("123450");
		System.out.println(dna);
		System.out.println(dna.reverse());
		System.out.println(dna.reverse().reverse());
	}

	
}
