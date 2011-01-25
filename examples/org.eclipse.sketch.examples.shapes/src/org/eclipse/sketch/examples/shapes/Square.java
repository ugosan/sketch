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
package org.eclipse.sketch.examples.shapes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Square</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getSquare()
 * @model kind="class"
 * @generated
 */
public class Square extends CDOObjectImpl implements Shape {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Square() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShapesPackage.Literals.SQUARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

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
	public String getSvg() {
		return (String)eGet(ShapesPackage.Literals.SHAPE__SVG, true);
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.Square#getSvg <em>Svg</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Svg</em>' attribute.
	 * @see #getSvg()
	 * @generated
	 */
	public void setSvg(String newSvg) {
		eSet(ShapesPackage.Literals.SHAPE__SVG, newSvg);
	}

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
	public String getLabel() {
		return (String)eGet(ShapesPackage.Literals.SHAPE__LABEL, true);
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.Square#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(ShapesPackage.Literals.SHAPE__LABEL, newLabel);
	}

} // Square
