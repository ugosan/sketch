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
 */
package org.eclipse.sketch;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.sketch.util.PointList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sketch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sketch.Sketch#getWord <em>Word</em>}</li>
 *   <li>{@link org.eclipse.sketch.Sketch#getPoints <em>Points</em>}</li>
 *   <li>{@link org.eclipse.sketch.Sketch#getQuantizedPoints <em>Quantized Points</em>}</li>
 *   <li>{@link org.eclipse.sketch.Sketch#getGridWidth <em>Grid Width</em>}</li>
 *   <li>{@link org.eclipse.sketch.Sketch#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sketch.Sketch#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.eclipse.sketch.Sketch#getPointlist <em>Pointlist</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sketch.SketchPackage#getSketch()
 * @model kind="class"
 * @generated
 */
public class Sketch extends EObjectImpl implements EObject {
	/**
	 * The default value of the '{@link #getWord() <em>Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWord()
	 * @generated
	 * @ordered
	 */
	protected static final String WORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWord() <em>Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWord()
	 * @generated
	 * @ordered
	 */
	protected String word = WORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> points;

	/**
	 * The cached value of the '{@link #getQuantizedPoints() <em>Quantized Points</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantizedPoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Point> quantizedPoints;

	/**
	 * The default value of the '{@link #getGridWidth() <em>Grid Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int GRID_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGridWidth() <em>Grid Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridWidth()
	 * @generated
	 * @ordered
	 */
	protected int gridWidth = GRID_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMeta() <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected static final String META_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMeta() <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeta()
	 * @generated
	 * @ordered
	 */
	protected String meta = META_EDEFAULT;

	/**
	 * The default value of the '{@link #getPointlist() <em>Pointlist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointlist()
	 * @generated
	 * @ordered
	 */
	protected static final PointList POINTLIST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPointlist() <em>Pointlist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPointlist()
	 * @generated
	 * @ordered
	 */
	protected PointList pointlist = POINTLIST_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sketch() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SketchPackage.Literals.SKETCH;
	}

	/**
	 * Returns the value of the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Word</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Word</em>' attribute.
	 * @see #setWord(String)
	 * @see org.eclipse.sketch.SketchPackage#getSketch_Word()
	 * @model
	 * @generated
	 */
	public String getWord() {
		return word;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.Sketch#getWord <em>Word</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Word</em>' attribute.
	 * @see #getWord()
	 * @generated
	 */
	public void setWord(String newWord) {
		String oldWord = word;
		word = newWord;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SketchPackage.SKETCH__WORD, oldWord, word));
	}

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute list.
	 * @see org.eclipse.sketch.SketchPackage#getSketch_Points()
	 * @model dataType="org.eclipse.sketch.Draw2DPoint" transient="true"
	 * @generated
	 */
	public List<Point> getPoints() {
		if (points == null) {
			points = new EDataTypeUniqueEList<Point>(Point.class, this, SketchPackage.SKETCH__POINTS);
		}
		return points;
	}

	/**
	 * Returns the value of the '<em><b>Quantized Points</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.draw2d.geometry.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantized Points</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantized Points</em>' attribute list.
	 * @see org.eclipse.sketch.SketchPackage#getSketch_QuantizedPoints()
	 * @model dataType="org.eclipse.sketch.Draw2DPoint" transient="true"
	 * @generated
	 */
	public List<Point> getQuantizedPoints() {
		if (quantizedPoints == null) {
			quantizedPoints = new EDataTypeUniqueEList<Point>(Point.class, this, SketchPackage.SKETCH__QUANTIZED_POINTS);
		}
		return quantizedPoints;
	}

	/**
	 * Returns the value of the '<em><b>Grid Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid Width</em>' attribute.
	 * @see #setGridWidth(int)
	 * @see org.eclipse.sketch.SketchPackage#getSketch_GridWidth()
	 * @model
	 * @generated
	 */
	public int getGridWidth() {
		return gridWidth;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.Sketch#getGridWidth <em>Grid Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grid Width</em>' attribute.
	 * @see #getGridWidth()
	 * @generated
	 */
	public void setGridWidth(int newGridWidth) {
		int oldGridWidth = gridWidth;
		gridWidth = newGridWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SketchPackage.SKETCH__GRID_WIDTH, oldGridWidth, gridWidth));
	}

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.sketch.SketchPackage#getSketch_Name()
	 * @model
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.Sketch#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SketchPackage.SKETCH__NAME, oldName, name));
	}

	/**
	 * Returns the value of the '<em><b>Meta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta</em>' attribute.
	 * @see #setMeta(String)
	 * @see org.eclipse.sketch.SketchPackage#getSketch_Meta()
	 * @model
	 * @generated
	 */
	public String getMeta() {
		return meta;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.Sketch#getMeta <em>Meta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta</em>' attribute.
	 * @see #getMeta()
	 * @generated
	 */
	public void setMeta(String newMeta) {
		String oldMeta = meta;
		meta = newMeta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SketchPackage.SKETCH__META, oldMeta, meta));
	}

	/**
	 * Returns the value of the '<em><b>Pointlist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pointlist</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointlist</em>' attribute.
	 * @see #setPointlist(PointList)
	 * @see org.eclipse.sketch.SketchPackage#getSketch_Pointlist()
	 * @model dataType="org.eclipse.sketch.PointList"
	 * @generated
	 */
	public PointList getPointlist() {
		return pointlist;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.Sketch#getPointlist <em>Pointlist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointlist</em>' attribute.
	 * @see #getPointlist()
	 * @generated
	 */
	public void setPointlist(PointList newPointlist) {
		PointList oldPointlist = pointlist;
		pointlist = newPointlist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SketchPackage.SKETCH__POINTLIST, oldPointlist, pointlist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SketchPackage.SKETCH__WORD:
				return getWord();
			case SketchPackage.SKETCH__POINTS:
				return getPoints();
			case SketchPackage.SKETCH__QUANTIZED_POINTS:
				return getQuantizedPoints();
			case SketchPackage.SKETCH__GRID_WIDTH:
				return getGridWidth();
			case SketchPackage.SKETCH__NAME:
				return getName();
			case SketchPackage.SKETCH__META:
				return getMeta();
			case SketchPackage.SKETCH__POINTLIST:
				return getPointlist();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SketchPackage.SKETCH__WORD:
				setWord((String)newValue);
				return;
			case SketchPackage.SKETCH__POINTS:
				getPoints().clear();
				getPoints().addAll((Collection<? extends Point>)newValue);
				return;
			case SketchPackage.SKETCH__QUANTIZED_POINTS:
				getQuantizedPoints().clear();
				getQuantizedPoints().addAll((Collection<? extends Point>)newValue);
				return;
			case SketchPackage.SKETCH__GRID_WIDTH:
				setGridWidth((Integer)newValue);
				return;
			case SketchPackage.SKETCH__NAME:
				setName((String)newValue);
				return;
			case SketchPackage.SKETCH__META:
				setMeta((String)newValue);
				return;
			case SketchPackage.SKETCH__POINTLIST:
				setPointlist((PointList)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SketchPackage.SKETCH__WORD:
				setWord(WORD_EDEFAULT);
				return;
			case SketchPackage.SKETCH__POINTS:
				getPoints().clear();
				return;
			case SketchPackage.SKETCH__QUANTIZED_POINTS:
				getQuantizedPoints().clear();
				return;
			case SketchPackage.SKETCH__GRID_WIDTH:
				setGridWidth(GRID_WIDTH_EDEFAULT);
				return;
			case SketchPackage.SKETCH__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SketchPackage.SKETCH__META:
				setMeta(META_EDEFAULT);
				return;
			case SketchPackage.SKETCH__POINTLIST:
				setPointlist(POINTLIST_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SketchPackage.SKETCH__WORD:
				return WORD_EDEFAULT == null ? word != null : !WORD_EDEFAULT.equals(word);
			case SketchPackage.SKETCH__POINTS:
				return points != null && !points.isEmpty();
			case SketchPackage.SKETCH__QUANTIZED_POINTS:
				return quantizedPoints != null && !quantizedPoints.isEmpty();
			case SketchPackage.SKETCH__GRID_WIDTH:
				return gridWidth != GRID_WIDTH_EDEFAULT;
			case SketchPackage.SKETCH__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SketchPackage.SKETCH__META:
				return META_EDEFAULT == null ? meta != null : !META_EDEFAULT.equals(meta);
			case SketchPackage.SKETCH__POINTLIST:
				return POINTLIST_EDEFAULT == null ? pointlist != null : !POINTLIST_EDEFAULT.equals(pointlist);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (word: ");
		result.append(word);
		result.append(", points: ");
		result.append(points);
		result.append(", quantizedPoints: ");
		result.append(quantizedPoints);
		result.append(", gridWidth: ");
		result.append(gridWidth);
		result.append(", name: ");
		result.append(name);
		result.append(", meta: ");
		result.append(meta);
		result.append(", pointlist: ");
		result.append(pointlist);
		result.append(')');
		return result.toString();
	}

	
	public static String ELEMENT_RESULT_KEY = "ELEMENT_RESULT_KEY_HashMap_IElementType_Integer";

	
	private Point location;
	private Dimension size;
	
	
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
		if(word==null)
			word = buildDna().toString();
		return word;
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
	private Word buildDna(){
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


		return new Word(s);
	}
	
	
	
	/**
	 * Computes the size of the sketch based on the smallest and the biggest points
	 * @param points
	 * @return the size of the sketch 
	 */
	private Dimension computeSize(List<Point> points){
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
	
	private Point computeLocation(List<Point> points){
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
	
	/**
	 * Defines the Word of a sketch. It is basically a String, with some useful methods
	 * (as reverting the Word)
	 * @author Olivier Bourdoux <olivier.bourdoux@gmail.com>
	 */
	public static class Word
	{
		private String value;
		
		public Word(String v)
		{ value = v; }
		
		public String toString()
		{ return value; }
		
		/**
		 * @return the reverse DNA of this instance
		 */
		public Word reverse()
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
			
			return new Word(out./*reverse().*/toString());
		}
	}
} // Sketch
