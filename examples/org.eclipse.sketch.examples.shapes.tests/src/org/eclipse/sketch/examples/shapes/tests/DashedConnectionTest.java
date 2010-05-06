
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
package org.eclipse.sketch.examples.shapes.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;

import org.eclipse.sketch.examples.shapes.DashedConnection;
import org.eclipse.sketch.examples.shapes.ShapesFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Dashed Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DashedConnectionTest extends TestCase {

	/**
	 * The fixture for this Dashed Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DashedConnection fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DashedConnectionTest.class);
	}

	/**
	 * Constructs a new Dashed Connection test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DashedConnectionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Dashed Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DashedConnection fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Dashed Connection test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DashedConnection getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ShapesFactory.eINSTANCE.createDashedConnection());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //DashedConnectionTest
