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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
 * @see org.eclipse.sketch.examples.shapes.ShapesFactory
 * @model kind="package"
 * @generated
 */
public class ShapesPackage extends EPackageImpl {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNAME = "shapes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String eNS_URI = "shapes";

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
	public static final ShapesPackage eINSTANCE = org.eclipse.sketch.examples.shapes.ShapesPackage.init();

	/**
	 * The meta object id for the '{@link org.eclipse.sketch.examples.shapes.Diagram <em>Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sketch.examples.shapes.Diagram
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getDiagram()
	 * @generated
	 */
	public static final int DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Shapes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__SHAPES = 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM__CONNECTIONS = 1;

	/**
	 * The number of structural features of the '<em>Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DIAGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.sketch.examples.shapes.Shape <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sketch.examples.shapes.Shape
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getShape()
	 * @generated
	 */
	public static final int SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Svg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHAPE__SVG = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHAPE__LABEL = 1;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SHAPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.sketch.examples.shapes.Square <em>Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sketch.examples.shapes.Square
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getSquare()
	 * @generated
	 */
	public static final int SQUARE = 2;

	/**
	 * The feature id for the '<em><b>Svg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE__SVG = SHAPE__SVG;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE__LABEL = SHAPE__LABEL;

	/**
	 * The number of structural features of the '<em>Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int SQUARE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sketch.examples.shapes.Triangle <em>Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sketch.examples.shapes.Triangle
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getTriangle()
	 * @generated
	 */
	public static final int TRIANGLE = 3;

	/**
	 * The feature id for the '<em><b>Svg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGLE__SVG = SHAPE__SVG;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGLE__LABEL = SHAPE__LABEL;

	/**
	 * The number of structural features of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int TRIANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sketch.examples.shapes.Unknown <em>Unknown</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sketch.examples.shapes.Unknown
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getUnknown()
	 * @generated
	 */
	public static final int UNKNOWN = 4;

	/**
	 * The feature id for the '<em><b>Svg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN__SVG = SHAPE__SVG;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN__LABEL = SHAPE__LABEL;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN__META = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN__ELEMENT = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unknown</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.sketch.examples.shapes.AbstractConnection <em>Abstract Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sketch.examples.shapes.AbstractConnection
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getAbstractConnection()
	 * @generated
	 */
	public static final int ABSTRACT_CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_CONNECTION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_CONNECTION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_CONNECTION__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Abstract Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int ABSTRACT_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.sketch.examples.shapes.Connection <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sketch.examples.shapes.Connection
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getConnection()
	 * @generated
	 */
	public static final int CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION__SOURCE = ABSTRACT_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION__TARGET = ABSTRACT_CONNECTION__TARGET;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION__LABEL = ABSTRACT_CONNECTION__LABEL;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_FEATURE_COUNT = ABSTRACT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.sketch.examples.shapes.DashedConnection <em>Dashed Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.sketch.examples.shapes.DashedConnection
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getDashedConnection()
	 * @generated
	 */
	public static final int DASHED_CONNECTION = 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DASHED_CONNECTION__SOURCE = ABSTRACT_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DASHED_CONNECTION__TARGET = ABSTRACT_CONNECTION__TARGET;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DASHED_CONNECTION__LABEL = ABSTRACT_CONNECTION__LABEL;

	/**
	 * The number of structural features of the '<em>Dashed Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	public static final int DASHED_CONNECTION_FEATURE_COUNT = ABSTRACT_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass squareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dashedConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConnectionEClass = null;

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
	 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ShapesPackage() {
		super(eNS_URI, ShapesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ShapesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ShapesPackage init() {
		if (isInited) return (ShapesPackage)EPackage.Registry.INSTANCE.getEPackage(ShapesPackage.eNS_URI);

		// Obtain or create and register package
		ShapesPackage theShapesPackage = (ShapesPackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ShapesPackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ShapesPackage());

		isInited = true;

		// Create package meta-data objects
		theShapesPackage.createPackageContents();

		// Initialize created meta-data
		theShapesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theShapesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ShapesPackage.eNS_URI, theShapesPackage);
		return theShapesPackage;
	}


	/**
	 * Returns the meta object for class '{@link org.eclipse.sketch.examples.shapes.Diagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram</em>'.
	 * @see org.eclipse.sketch.examples.shapes.Diagram
	 * @generated
	 */
	public EClass getDiagram() {
		return diagramEClass;
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sketch.examples.shapes.Diagram#getShapes <em>Shapes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shapes</em>'.
	 * @see org.eclipse.sketch.examples.shapes.Diagram#getShapes()
	 * @see #getDiagram()
	 * @generated
	 */
	public EReference getDiagram_Shapes() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.sketch.examples.shapes.Diagram#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see org.eclipse.sketch.examples.shapes.Diagram#getConnections()
	 * @see #getDiagram()
	 * @generated
	 */
	public EReference getDiagram_Connections() {
		return (EReference)diagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.sketch.examples.shapes.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see org.eclipse.sketch.examples.shapes.Shape
	 * @generated
	 */
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sketch.examples.shapes.Shape#getSvg <em>Svg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Svg</em>'.
	 * @see org.eclipse.sketch.examples.shapes.Shape#getSvg()
	 * @see #getShape()
	 * @generated
	 */
	public EAttribute getShape_Svg() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sketch.examples.shapes.Shape#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.sketch.examples.shapes.Shape#getLabel()
	 * @see #getShape()
	 * @generated
	 */
	public EAttribute getShape_Label() {
		return (EAttribute)shapeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.sketch.examples.shapes.Square <em>Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Square</em>'.
	 * @see org.eclipse.sketch.examples.shapes.Square
	 * @generated
	 */
	public EClass getSquare() {
		return squareEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.sketch.examples.shapes.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle</em>'.
	 * @see org.eclipse.sketch.examples.shapes.Triangle
	 * @generated
	 */
	public EClass getTriangle() {
		return triangleEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.sketch.examples.shapes.Unknown <em>Unknown</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown</em>'.
	 * @see org.eclipse.sketch.examples.shapes.Unknown
	 * @generated
	 */
	public EClass getUnknown() {
		return unknownEClass;
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sketch.examples.shapes.Unknown#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Meta</em>'.
	 * @see org.eclipse.sketch.examples.shapes.Unknown#getMeta()
	 * @see #getUnknown()
	 * @generated
	 */
	public EAttribute getUnknown_Meta() {
		return (EAttribute)unknownEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sketch.examples.shapes.Unknown#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see org.eclipse.sketch.examples.shapes.Unknown#getElement()
	 * @see #getUnknown()
	 * @generated
	 */
	public EAttribute getUnknown_Element() {
		return (EAttribute)unknownEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.sketch.examples.shapes.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see org.eclipse.sketch.examples.shapes.Connection
	 * @generated
	 */
	public EClass getConnection() {
		return connectionEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.sketch.examples.shapes.DashedConnection <em>Dashed Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dashed Connection</em>'.
	 * @see org.eclipse.sketch.examples.shapes.DashedConnection
	 * @generated
	 */
	public EClass getDashedConnection() {
		return dashedConnectionEClass;
	}

	/**
	 * Returns the meta object for class '{@link org.eclipse.sketch.examples.shapes.AbstractConnection <em>Abstract Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Connection</em>'.
	 * @see org.eclipse.sketch.examples.shapes.AbstractConnection
	 * @generated
	 */
	public EClass getAbstractConnection() {
		return abstractConnectionEClass;
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sketch.examples.shapes.AbstractConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.eclipse.sketch.examples.shapes.AbstractConnection#getSource()
	 * @see #getAbstractConnection()
	 * @generated
	 */
	public EReference getAbstractConnection_Source() {
		return (EReference)abstractConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.sketch.examples.shapes.AbstractConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.sketch.examples.shapes.AbstractConnection#getTarget()
	 * @see #getAbstractConnection()
	 * @generated
	 */
	public EReference getAbstractConnection_Target() {
		return (EReference)abstractConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.sketch.examples.shapes.AbstractConnection#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.eclipse.sketch.examples.shapes.AbstractConnection#getLabel()
	 * @see #getAbstractConnection()
	 * @generated
	 */
	public EAttribute getAbstractConnection_Label() {
		return (EAttribute)abstractConnectionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	public ShapesFactory getShapesFactory() {
		return (ShapesFactory)getEFactoryInstance();
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
		diagramEClass = createEClass(DIAGRAM);
		createEReference(diagramEClass, DIAGRAM__SHAPES);
		createEReference(diagramEClass, DIAGRAM__CONNECTIONS);

		shapeEClass = createEClass(SHAPE);
		createEAttribute(shapeEClass, SHAPE__SVG);
		createEAttribute(shapeEClass, SHAPE__LABEL);

		squareEClass = createEClass(SQUARE);

		triangleEClass = createEClass(TRIANGLE);

		unknownEClass = createEClass(UNKNOWN);
		createEAttribute(unknownEClass, UNKNOWN__META);
		createEAttribute(unknownEClass, UNKNOWN__ELEMENT);

		connectionEClass = createEClass(CONNECTION);

		dashedConnectionEClass = createEClass(DASHED_CONNECTION);

		abstractConnectionEClass = createEClass(ABSTRACT_CONNECTION);
		createEReference(abstractConnectionEClass, ABSTRACT_CONNECTION__SOURCE);
		createEReference(abstractConnectionEClass, ABSTRACT_CONNECTION__TARGET);
		createEAttribute(abstractConnectionEClass, ABSTRACT_CONNECTION__LABEL);
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
		squareEClass.getESuperTypes().add(this.getShape());
		triangleEClass.getESuperTypes().add(this.getShape());
		unknownEClass.getESuperTypes().add(this.getShape());
		connectionEClass.getESuperTypes().add(this.getAbstractConnection());
		dashedConnectionEClass.getESuperTypes().add(this.getAbstractConnection());

		// Initialize classes and features; add operations and parameters
		initEClass(diagramEClass, Diagram.class, "Diagram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiagram_Shapes(), this.getShape(), null, "shapes", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDiagram_Connections(), this.getAbstractConnection(), null, "connections", null, 0, -1, Diagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getShape_Svg(), ecorePackage.getEString(), "svg", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getShape_Label(), ecorePackage.getEString(), "label", null, 0, 1, Shape.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(squareEClass, Square.class, "Square", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(triangleEClass, Triangle.class, "Triangle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unknownEClass, Unknown.class, "Unknown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnknown_Meta(), ecorePackage.getEString(), "meta", null, 0, 1, Unknown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUnknown_Element(), ecorePackage.getEString(), "element", null, 0, 1, Unknown.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectionEClass, Connection.class, "Connection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(dashedConnectionEClass, DashedConnection.class, "DashedConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractConnectionEClass, AbstractConnection.class, "AbstractConnection", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractConnection_Source(), this.getShape(), null, "source", null, 0, 1, AbstractConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractConnection_Target(), this.getShape(), null, "target", null, 0, 1, AbstractConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractConnection_Label(), ecorePackage.getEString(), "label", null, 0, 1, AbstractConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		 * The meta object literal for the '{@link org.eclipse.sketch.examples.shapes.Diagram <em>Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sketch.examples.shapes.Diagram
		 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getDiagram()
		 * @generated
		 */
		public static final EClass DIAGRAM = eINSTANCE.getDiagram();

		/**
		 * The meta object literal for the '<em><b>Shapes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DIAGRAM__SHAPES = eINSTANCE.getDiagram_Shapes();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference DIAGRAM__CONNECTIONS = eINSTANCE.getDiagram_Connections();

		/**
		 * The meta object literal for the '{@link org.eclipse.sketch.examples.shapes.Shape <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sketch.examples.shapes.Shape
		 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getShape()
		 * @generated
		 */
		public static final EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '<em><b>Svg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHAPE__SVG = eINSTANCE.getShape_Svg();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute SHAPE__LABEL = eINSTANCE.getShape_Label();

		/**
		 * The meta object literal for the '{@link org.eclipse.sketch.examples.shapes.Square <em>Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sketch.examples.shapes.Square
		 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getSquare()
		 * @generated
		 */
		public static final EClass SQUARE = eINSTANCE.getSquare();

		/**
		 * The meta object literal for the '{@link org.eclipse.sketch.examples.shapes.Triangle <em>Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sketch.examples.shapes.Triangle
		 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getTriangle()
		 * @generated
		 */
		public static final EClass TRIANGLE = eINSTANCE.getTriangle();

		/**
		 * The meta object literal for the '{@link org.eclipse.sketch.examples.shapes.Unknown <em>Unknown</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sketch.examples.shapes.Unknown
		 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getUnknown()
		 * @generated
		 */
		public static final EClass UNKNOWN = eINSTANCE.getUnknown();

		/**
		 * The meta object literal for the '<em><b>Meta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute UNKNOWN__META = eINSTANCE.getUnknown_Meta();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute UNKNOWN__ELEMENT = eINSTANCE.getUnknown_Element();

		/**
		 * The meta object literal for the '{@link org.eclipse.sketch.examples.shapes.Connection <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sketch.examples.shapes.Connection
		 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getConnection()
		 * @generated
		 */
		public static final EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '{@link org.eclipse.sketch.examples.shapes.DashedConnection <em>Dashed Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sketch.examples.shapes.DashedConnection
		 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getDashedConnection()
		 * @generated
		 */
		public static final EClass DASHED_CONNECTION = eINSTANCE.getDashedConnection();

		/**
		 * The meta object literal for the '{@link org.eclipse.sketch.examples.shapes.AbstractConnection <em>Abstract Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.sketch.examples.shapes.AbstractConnection
		 * @see org.eclipse.sketch.examples.shapes.ShapesPackage#getAbstractConnection()
		 * @generated
		 */
		public static final EClass ABSTRACT_CONNECTION = eINSTANCE.getAbstractConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ABSTRACT_CONNECTION__SOURCE = eINSTANCE.getAbstractConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EReference ABSTRACT_CONNECTION__TARGET = eINSTANCE.getAbstractConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public static final EAttribute ABSTRACT_CONNECTION__LABEL = eINSTANCE.getAbstractConnection_Label();

	}

} //ShapesPackage
