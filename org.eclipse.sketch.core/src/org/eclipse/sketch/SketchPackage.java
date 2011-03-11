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

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.sketch.util.PointList;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.sketch.SketchFactory
 * @model kind="package"
 * @generated
 */
public class SketchPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "sketch";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "http://www.eclipse.org/sketch";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SketchPackage eINSTANCE = org.eclipse.sketch.SketchPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sketch.Sketch <em>Sketch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sketch.Sketch
	 * @see org.eclipse.sketch.SketchPackage#getSketch()
	 * @generated
	 */
	public static final int SKETCH = 0;

	/**
	 * The feature id for the '<em><b>Word</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SKETCH__WORD = 0;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SKETCH__POINTS = 1;

	/**
	 * The feature id for the '<em><b>Quantized Points</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SKETCH__QUANTIZED_POINTS = 2;

	/**
	 * The feature id for the '<em><b>Grid Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SKETCH__GRID_WIDTH = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SKETCH__NAME = 4;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SKETCH__META = 5;

	/**
	 * The feature id for the '<em><b>Pointlist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SKETCH__POINTLIST = 6;

	/**
	 * The number of structural features of the '<em>Sketch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SKETCH_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.sketch.SketchDatabase <em>Database</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sketch.SketchDatabase
	 * @see org.eclipse.sketch.SketchPackage#getSketchDatabase()
	 * @generated
	 */
	public static final int SKETCH_DATABASE = 1;

	/**
	 * The feature id for the '<em><b>Sketch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SKETCH_DATABASE__SKETCH = 0;

	/**
	 * The number of structural features of the '<em>Database</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SKETCH_DATABASE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '<em>Draw2 DDimension</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Dimension
	 * @see org.eclipse.sketch.SketchPackage#getDraw2DDimension()
	 * @generated
	 */
	public static final int DRAW2_DDIMENSION = 2;

	/**
	 * The meta object id for the '<em>Draw2 DPoint</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.draw2d.geometry.Point
	 * @see org.eclipse.sketch.SketchPackage#getDraw2DPoint()
	 * @generated
	 */
	public static final int DRAW2_DPOINT = 3;

	/**
	 * The meta object id for the '<em>Point List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sketch.util.PointList
	 * @see org.eclipse.sketch.SketchPackage#getPointList()
	 * @generated
	 */
	public static final int POINT_LIST = 4;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sketchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sketchDatabaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType draw2DDimensionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType draw2DPointEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pointListEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.sketch.SketchPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SketchPackage() {
		super(eNS_URI, SketchFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SketchPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SketchPackage init() {
		if (isInited) return (SketchPackage)EPackage.Registry.INSTANCE.getEPackage(SketchPackage.eNS_URI);

		// Obtain or create and register package
		SketchPackage theSketchPackage = (SketchPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SketchPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SketchPackage());

		isInited = true;

		// Create package meta-data objects
		theSketchPackage.createPackageContents();

		// Initialize created meta-data
		theSketchPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSketchPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SketchPackage.eNS_URI, theSketchPackage);
		return theSketchPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.sketch.Sketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch</em>'.
	 * @see org.eclipse.sketch.Sketch
	 * @generated
	 */
	public EClass getSketch() {
		return sketchEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sketch.Sketch#getWord <em>Word</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Word</em>'.
	 * @see org.eclipse.sketch.Sketch#getWord()
	 * @see #getSketch()
	 * @generated
	 */
	public EAttribute getSketch_Word() {
		return (EAttribute)sketchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.sketch.Sketch#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Points</em>'.
	 * @see org.eclipse.sketch.Sketch#getPoints()
	 * @see #getSketch()
	 * @generated
	 */
	public EAttribute getSketch_Points() {
		return (EAttribute)sketchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.sketch.Sketch#getQuantizedPoints <em>Quantized Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Quantized Points</em>'.
	 * @see org.eclipse.sketch.Sketch#getQuantizedPoints()
	 * @see #getSketch()
	 * @generated
	 */
	public EAttribute getSketch_QuantizedPoints() {
		return (EAttribute)sketchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sketch.Sketch#getGridWidth <em>Grid Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grid Width</em>'.
	 * @see org.eclipse.sketch.Sketch#getGridWidth()
	 * @see #getSketch()
	 * @generated
	 */
	public EAttribute getSketch_GridWidth() {
		return (EAttribute)sketchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sketch.Sketch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.sketch.Sketch#getName()
	 * @see #getSketch()
	 * @generated
	 */
	public EAttribute getSketch_Name() {
		return (EAttribute)sketchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sketch.Sketch#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta</em>'.
	 * @see org.eclipse.sketch.Sketch#getMeta()
	 * @see #getSketch()
	 * @generated
	 */
	public EAttribute getSketch_Meta() {
		return (EAttribute)sketchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sketch.Sketch#getPointlist <em>Pointlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pointlist</em>'.
	 * @see org.eclipse.sketch.Sketch#getPointlist()
	 * @see #getSketch()
	 * @generated
	 */
	public EAttribute getSketch_Pointlist() {
		return (EAttribute)sketchEClass.getEStructuralFeatures().get(6);
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.sketch.SketchDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Database</em>'.
	 * @see org.eclipse.sketch.SketchDatabase
	 * @generated
	 */
	public EClass getSketchDatabase() {
		return sketchDatabaseEClass;
	}


	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sketch.SketchDatabase#getSketch <em>Sketch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sketch</em>'.
	 * @see org.eclipse.sketch.SketchDatabase#getSketch()
	 * @see #getSketchDatabase()
	 * @generated
	 */
	public EReference getSketchDatabase_Sketch() {
		return (EReference)sketchDatabaseEClass.getEStructuralFeatures().get(0);
	}


	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Dimension <em>Draw2 DDimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Draw2 DDimension</em>'.
	 * @see org.eclipse.draw2d.geometry.Dimension
	 * @model instanceClass="org.eclipse.draw2d.geometry.Dimension"
	 * @generated
	 */
	public EDataType getDraw2DDimension() {
		return draw2DDimensionEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link org.eclipse.draw2d.geometry.Point <em>Draw2 DPoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Draw2 DPoint</em>'.
	 * @see org.eclipse.draw2d.geometry.Point
	 * @model instanceClass="org.eclipse.draw2d.geometry.Point"
	 * @generated
	 */
	public EDataType getDraw2DPoint() {
		return draw2DPointEDataType;
	}

	/**
	 * Returns the meta object for data type '{@link org.eclipse.sketch.util.PointList <em>Point List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Point List</em>'.
	 * @see org.eclipse.sketch.util.PointList
	 * @model instanceClass="org.eclipse.sketch.util.PointList"
	 * @generated
	 */
	public EDataType getPointList() {
		return pointListEDataType;
	}


	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public SketchFactory getSketchFactory() {
		return (SketchFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sketchEClass = createEClass(SKETCH);
		createEAttribute(sketchEClass, SKETCH__WORD);
		createEAttribute(sketchEClass, SKETCH__POINTS);
		createEAttribute(sketchEClass, SKETCH__QUANTIZED_POINTS);
		createEAttribute(sketchEClass, SKETCH__GRID_WIDTH);
		createEAttribute(sketchEClass, SKETCH__NAME);
		createEAttribute(sketchEClass, SKETCH__META);
		createEAttribute(sketchEClass, SKETCH__POINTLIST);

		sketchDatabaseEClass = createEClass(SKETCH_DATABASE);
		createEReference(sketchDatabaseEClass, SKETCH_DATABASE__SKETCH);

		// Create data types
		draw2DDimensionEDataType = createEDataType(DRAW2_DDIMENSION);
		draw2DPointEDataType = createEDataType(DRAW2_DPOINT);
		pointListEDataType = createEDataType(POINT_LIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(sketchEClass, Sketch.class, "Sketch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSketch_Word(), ecorePackage.getEString(), "word", null, 0, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSketch_Points(), this.getDraw2DPoint(), "points", null, 0, -1, Sketch.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSketch_QuantizedPoints(), this.getDraw2DPoint(), "quantizedPoints", null, 0, -1, Sketch.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSketch_GridWidth(), ecorePackage.getEInt(), "gridWidth", null, 0, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSketch_Name(), ecorePackage.getEString(), "name", null, 0, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSketch_Meta(), ecorePackage.getEString(), "meta", null, 0, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSketch_Pointlist(), this.getPointList(), "pointlist", null, 0, 1, Sketch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sketchDatabaseEClass, SketchDatabase.class, "SketchDatabase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSketchDatabase_Sketch(), this.getSketch(), null, "sketch", null, 0, -1, SketchDatabase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(draw2DDimensionEDataType, Dimension.class, "Draw2DDimension", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(draw2DPointEDataType, Point.class, "Draw2DPoint", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pointListEDataType, PointList.class, "PointList", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.sketch.Sketch <em>Sketch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sketch.Sketch
		 * @see org.eclipse.sketch.SketchPackage#getSketch()
		 * @generated
		 */
		public static final EClass SKETCH = eINSTANCE.getSketch();

		/**
		 * The meta object literal for the '<em><b>Word</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SKETCH__WORD = eINSTANCE.getSketch_Word();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SKETCH__POINTS = eINSTANCE.getSketch_Points();

		/**
		 * The meta object literal for the '<em><b>Quantized Points</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SKETCH__QUANTIZED_POINTS = eINSTANCE.getSketch_QuantizedPoints();

		/**
		 * The meta object literal for the '<em><b>Grid Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SKETCH__GRID_WIDTH = eINSTANCE.getSketch_GridWidth();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SKETCH__NAME = eINSTANCE.getSketch_Name();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SKETCH__META = eINSTANCE.getSketch_Meta();

		/**
		 * The meta object literal for the '<em><b>Pointlist</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SKETCH__POINTLIST = eINSTANCE.getSketch_Pointlist();

		/**
		 * The meta object literal for the '{@link org.eclipse.sketch.SketchDatabase <em>Database</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sketch.SketchDatabase
		 * @see org.eclipse.sketch.SketchPackage#getSketchDatabase()
		 * @generated
		 */
		public static final EClass SKETCH_DATABASE = eINSTANCE.getSketchDatabase();

		/**
		 * The meta object literal for the '<em><b>Sketch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference SKETCH_DATABASE__SKETCH = eINSTANCE.getSketchDatabase_Sketch();

		/**
		 * The meta object literal for the '<em>Draw2 DDimension</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Dimension
		 * @see org.eclipse.sketch.SketchPackage#getDraw2DDimension()
		 * @generated
		 */
		public static final EDataType DRAW2_DDIMENSION = eINSTANCE.getDraw2DDimension();

		/**
		 * The meta object literal for the '<em>Draw2 DPoint</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.draw2d.geometry.Point
		 * @see org.eclipse.sketch.SketchPackage#getDraw2DPoint()
		 * @generated
		 */
		public static final EDataType DRAW2_DPOINT = eINSTANCE.getDraw2DPoint();

		/**
		 * The meta object literal for the '<em>Point List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sketch.util.PointList
		 * @see org.eclipse.sketch.SketchPackage#getPointList()
		 * @generated
		 */
		public static final EDataType POINT_LIST = eINSTANCE.getPointList();

	}

} //SketchPackage
