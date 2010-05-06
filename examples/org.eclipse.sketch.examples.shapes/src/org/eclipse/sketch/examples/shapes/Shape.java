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
package org.eclipse.sketch.examples.shapes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sketch.examples.shapes.Shape#getSvg <em>Svg</em>}</li>
 *   <li>{@link org.eclipse.sketch.examples.shapes.Shape#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getShape()
 * @model kind="class" interface="true" abstract="true"
 * @generated
 */
public interface Shape extends EObject {
	/**
	 * Returns the value of the '<em><b>Svg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Svg</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Svg</em>' attribute.
	 * @see #setSvg(String)
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getShape_Svg()
	 * @model
	 * @generated
	 */
	String getSvg();

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.Shape#getSvg <em>Svg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Svg</em>' attribute.
	 * @see #getSvg()
	 * @generated
	 */
	void setSvg(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getShape_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.Shape#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

} // Shape
