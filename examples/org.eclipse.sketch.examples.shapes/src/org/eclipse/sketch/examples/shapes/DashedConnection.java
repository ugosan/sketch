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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dashed Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getDashedConnection()
 * @model kind="class"
 * @generated
 */
public class DashedConnection extends CDOObjectImpl implements AbstractConnection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DashedConnection() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShapesPackage.Literals.DASHED_CONNECTION;
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
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Shape)
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getAbstractConnection_Source()
	 * @model
	 * @generated
	 */
	public Shape getSource() {
		return (Shape)eGet(ShapesPackage.Literals.ABSTRACT_CONNECTION__SOURCE, true);
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.DashedConnection#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	public void setSource(Shape newSource) {
		eSet(ShapesPackage.Literals.ABSTRACT_CONNECTION__SOURCE, newSource);
	}

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Shape)
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getAbstractConnection_Target()
	 * @model
	 * @generated
	 */
	public Shape getTarget() {
		return (Shape)eGet(ShapesPackage.Literals.ABSTRACT_CONNECTION__TARGET, true);
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.DashedConnection#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	public void setTarget(Shape newTarget) {
		eSet(ShapesPackage.Literals.ABSTRACT_CONNECTION__TARGET, newTarget);
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
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getAbstractConnection_Label()
	 * @model
	 * @generated
	 */
	public String getLabel() {
		return (String)eGet(ShapesPackage.Literals.ABSTRACT_CONNECTION__LABEL, true);
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.DashedConnection#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	public void setLabel(String newLabel) {
		eSet(ShapesPackage.Literals.ABSTRACT_CONNECTION__LABEL, newLabel);
	}

} // DashedConnection
