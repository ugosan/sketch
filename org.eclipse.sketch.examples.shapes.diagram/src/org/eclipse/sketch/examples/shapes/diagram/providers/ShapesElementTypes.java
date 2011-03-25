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
package org.eclipse.sketch.examples.shapes.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.sketch.examples.shapes.ShapesPackage;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.ConnectionEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.DashedConnectionEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.DiagramEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.SquareEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.TriangleEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.UnknownEditPart;
import org.eclipse.sketch.examples.shapes.diagram.part.ShapesDiagramEditorPlugin;

import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class ShapesElementTypes {

	/**
	 * @generated
	 */
	private ShapesElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Diagram_1000 = getElementType("org.eclipse.sketch.examples.shapes.diagram.Diagram_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Square_2001 = getElementType("org.eclipse.sketch.examples.shapes.diagram.Square_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Triangle_2002 = getElementType("org.eclipse.sketch.examples.shapes.diagram.Triangle_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Unknown_2003 = getElementType("org.eclipse.sketch.examples.shapes.diagram.Unknown_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Connection_4001 = getElementType("org.eclipse.sketch.examples.shapes.diagram.Connection_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DashedConnection_4002 = getElementType("org.eclipse.sketch.examples.shapes.diagram.DashedConnection_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return ShapesDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Diagram_1000, ShapesPackage.eINSTANCE.getDiagram());

			elements.put(Square_2001, ShapesPackage.eINSTANCE.getSquare());

			elements.put(Triangle_2002, ShapesPackage.eINSTANCE.getTriangle());

			elements.put(Unknown_2003, ShapesPackage.eINSTANCE.getUnknown());

			elements.put(Connection_4001,
					ShapesPackage.eINSTANCE.getConnection());

			elements.put(DashedConnection_4002,
					ShapesPackage.eINSTANCE.getDashedConnection());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Diagram_1000);
			KNOWN_ELEMENT_TYPES.add(Square_2001);
			KNOWN_ELEMENT_TYPES.add(Triangle_2002);
			KNOWN_ELEMENT_TYPES.add(Unknown_2003);
			KNOWN_ELEMENT_TYPES.add(Connection_4001);
			KNOWN_ELEMENT_TYPES.add(DashedConnection_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case DiagramEditPart.VISUAL_ID:
			return Diagram_1000;
		case SquareEditPart.VISUAL_ID:
			return Square_2001;
		case TriangleEditPart.VISUAL_ID:
			return Triangle_2002;
		case UnknownEditPart.VISUAL_ID:
			return Unknown_2003;
		case ConnectionEditPart.VISUAL_ID:
			return Connection_4001;
		case DashedConnectionEditPart.VISUAL_ID:
			return DashedConnection_4002;
		}
		return null;
	}

}
