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

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.sketch.util.PointList;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.sketch.SketchPackage
 * @generated
 */
public class SketchFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SketchFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SketchFactory init() {
		try {
			SketchFactory theSketchFactory = (SketchFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/sketch"); 
			if (theSketchFactory != null) {
				return theSketchFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SketchFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SketchFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case SketchPackage.SKETCH: return createSketch();
		case SketchPackage.SKETCH_DATABASE: return createSketchDatabase();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case SketchPackage.DRAW2_DDIMENSION:
			return createDraw2DDimensionFromString(eDataType, initialValue);
		case SketchPackage.DRAW2_DPOINT:
			return createDraw2DPointFromString(eDataType, initialValue);
		case SketchPackage.POINT_LIST:
			return createPointListFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case SketchPackage.DRAW2_DDIMENSION:
			return convertDraw2DDimensionToString(eDataType, instanceValue);
		case SketchPackage.DRAW2_DPOINT:
			return convertDraw2DPointToString(eDataType, instanceValue);
		case SketchPackage.POINT_LIST:
			return convertPointListToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sketch createSketch() {
		Sketch sketch = new Sketch();
		return sketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SketchDatabase createSketchDatabase() {
		SketchDatabase sketchDatabase = new SketchDatabase();
		return sketchDatabase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dimension createDraw2DDimensionFromString(EDataType eDataType, String initialValue) {
		return (Dimension)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDraw2DDimensionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Point createDraw2DPointFromString(EDataType eDataType, String initialValue) {

		//int x = Integer.valueOf((initialValue.substring(initialValue.indexOf("(")+1, initialValue.indexOf(","))).trim());
		//int y = Integer.valueOf((initialValue.substring(initialValue.indexOf(",")+1, initialValue.indexOf(")"))).trim());

		int x = Integer.valueOf(initialValue.substring(0, initialValue.indexOf(",")).trim());
		int y = Integer.valueOf(initialValue.substring(initialValue.indexOf(",")+1, initialValue.length()).trim());

		Point p = new Point(x,y);
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertDraw2DPointToString(EDataType eDataType, Object instanceValue) {
		Point p = (Point)instanceValue;
		return ""+p.x+","+p.y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PointList createPointListFromString(EDataType eDataType, String initialValue) {
		final Pattern pattern = Pattern.compile("\"([^\"]*)\"|(?<=,|^)([^,]*)(?=,|$)");

		ArrayList<String> numbers = new ArrayList<String>();

		Matcher m = pattern.matcher(initialValue);
		// For each field
		while (m.find()) {
			String match = m.group();
			if (match == null)
				break;
			if (match.endsWith(",")) {  // trim trailing ,
				match = match.substring(0, match.length() - 1);
			}
			if (match.startsWith("\"")) { // assume also ends with
				match = match.substring(1, match.length() - 1);
			}
			if (match.length() == 0)
				match = null;
			numbers.add(match);
		}


		PointList plist = new PointList();

		for(int i=0;i<numbers.size();i=i+2){
			//System.out.println(numbers.get(i) +" -- "+numbers.get(i+1));
			Point p = new Point(Integer.valueOf(numbers.get(i)),Integer.valueOf(numbers.get(i+1)));
			plist.add(p);
		}
		return plist;

	}



	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String convertPointListToString(EDataType eDataType, Object instanceValue) {
		PointList list = (PointList)instanceValue;
		String result = "";

		for(int i=0;i<list.size();i++){
			Point p = (Point)list.get(i);
			result+=p.x+","+p.y;
			if(i+1!=list.size())
				result+=",";
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SketchPackage getSketchPackage() {
		return (SketchPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SketchPackage getPackage() {
		return SketchPackage.eINSTANCE;
	}

} //SketchFactory
