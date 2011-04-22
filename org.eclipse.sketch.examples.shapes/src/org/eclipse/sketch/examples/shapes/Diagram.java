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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;


import org.eclipse.sketch.Sketch;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.sketch.examples.shapes.Diagram#getShapes <em>Shapes</em>}</li>
 *   <li>{@link org.eclipse.sketch.examples.shapes.Diagram#getConnections <em>Connections</em>}</li>
 *   <li>{@link org.eclipse.sketch.examples.shapes.Diagram#getRootSketch <em>Root Sketch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getDiagram()
 * @model kind="class"
 * @generated
 */
public class Diagram extends EObjectImpl implements EObject {
	/**
	 * The cached value of the '{@link #getShapes() <em>Shapes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShapes()
	 * @generated
	 * @ordered
	 */
	protected EList<Shape> shapes;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractConnection> connections;

	/**
	 * The cached value of the '{@link #getRootSketch() <em>Root Sketch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootSketch()
	 * @generated
	 * @ordered
	 */
	protected Sketch rootSketch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Diagram() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShapesPackage.Literals.DIAGRAM;
	}

	/**
	 * Returns the value of the '<em><b>Shapes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sketch.examples.shapes.Shape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shapes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shapes</em>' containment reference list.
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getDiagram_Shapes()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Shape> getShapes() {
		if (shapes == null) {
			shapes = new EObjectContainmentEList<Shape>(Shape.class, this, ShapesPackage.DIAGRAM__SHAPES);
		}
		return shapes;
	}

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.sketch.examples.shapes.AbstractConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getDiagram_Connections()
	 * @model containment="true"
	 * @generated
	 */
	public EList<AbstractConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<AbstractConnection>(AbstractConnection.class, this, ShapesPackage.DIAGRAM__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * Returns the value of the '<em><b>Root Sketch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root Sketch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Sketch</em>' containment reference.
	 * @see #setRootSketch(Sketch)
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getDiagram_RootSketch()
	 * @model containment="true" required="true"
	 * @generated
	 */
	public Sketch getRootSketch() {
		return rootSketch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRootSketch(Sketch newRootSketch, NotificationChain msgs) {
		Sketch oldRootSketch = rootSketch;
		rootSketch = newRootSketch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShapesPackage.DIAGRAM__ROOT_SKETCH, oldRootSketch, newRootSketch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.sketch.examples.shapes.Diagram#getRootSketch <em>Root Sketch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Sketch</em>' containment reference.
	 * @see #getRootSketch()
	 * @generated
	 */
	public void setRootSketch(Sketch newRootSketch) {
		if (newRootSketch != rootSketch) {
			NotificationChain msgs = null;
			if (rootSketch != null)
				msgs = ((InternalEObject)rootSketch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.DIAGRAM__ROOT_SKETCH, null, msgs);
			if (newRootSketch != null)
				msgs = ((InternalEObject)newRootSketch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShapesPackage.DIAGRAM__ROOT_SKETCH, null, msgs);
			msgs = basicSetRootSketch(newRootSketch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShapesPackage.DIAGRAM__ROOT_SKETCH, newRootSketch, newRootSketch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShapesPackage.DIAGRAM__SHAPES:
				return ((InternalEList<?>)getShapes()).basicRemove(otherEnd, msgs);
			case ShapesPackage.DIAGRAM__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
			case ShapesPackage.DIAGRAM__ROOT_SKETCH:
				return basicSetRootSketch(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShapesPackage.DIAGRAM__SHAPES:
				return getShapes();
			case ShapesPackage.DIAGRAM__CONNECTIONS:
				return getConnections();
			case ShapesPackage.DIAGRAM__ROOT_SKETCH:
				return getRootSketch();
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
			case ShapesPackage.DIAGRAM__SHAPES:
				getShapes().clear();
				getShapes().addAll((Collection<? extends Shape>)newValue);
				return;
			case ShapesPackage.DIAGRAM__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends AbstractConnection>)newValue);
				return;
			case ShapesPackage.DIAGRAM__ROOT_SKETCH:
				setRootSketch((Sketch)newValue);
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
			case ShapesPackage.DIAGRAM__SHAPES:
				getShapes().clear();
				return;
			case ShapesPackage.DIAGRAM__CONNECTIONS:
				getConnections().clear();
				return;
			case ShapesPackage.DIAGRAM__ROOT_SKETCH:
				setRootSketch((Sketch)null);
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
			case ShapesPackage.DIAGRAM__SHAPES:
				return shapes != null && !shapes.isEmpty();
			case ShapesPackage.DIAGRAM__CONNECTIONS:
				return connections != null && !connections.isEmpty();
			case ShapesPackage.DIAGRAM__ROOT_SKETCH:
				return rootSketch != null;
		}
		return super.eIsSet(featureID);
	}

} // Diagram
