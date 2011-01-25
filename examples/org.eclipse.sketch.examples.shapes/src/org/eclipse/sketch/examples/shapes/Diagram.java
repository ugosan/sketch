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

import org.eclipse.emf.cdo.CDOObject;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.internal.cdo.CDOObjectImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

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
 * </ul>
 * </p>
 *
 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getDiagram()
 * @model kind="class"
 * @extends CDOObject
 * @generated
 */
public class Diagram extends CDOObjectImpl implements CDOObject {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
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
	@SuppressWarnings("unchecked")
	public EList<Shape> getShapes() {
		return (EList<Shape>)eGet(ShapesPackage.Literals.DIAGRAM__SHAPES, true);
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
	@SuppressWarnings("unchecked")
	public EList<AbstractConnection> getConnections() {
		return (EList<AbstractConnection>)eGet(ShapesPackage.Literals.DIAGRAM__CONNECTIONS, true);
	}

} // Diagram
