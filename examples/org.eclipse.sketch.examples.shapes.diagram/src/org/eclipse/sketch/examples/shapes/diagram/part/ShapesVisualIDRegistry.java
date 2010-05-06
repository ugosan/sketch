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
 package org.eclipse.sketch.examples.shapes.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sketch.examples.shapes.ShapesPackage;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.ConnectionEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.ConnectionLabelEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.DashedConnectionEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.DashedConnectionLabelEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.DiagramEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.SquareEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.TriangleEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.UnknownEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.UnknownLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ShapesVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "org.eclipse.sketch.examples.shapes.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (DiagramEditPart.MODEL_ID.equals(view.getType())) {
				return DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return org.eclipse.sketch.examples.shapes.diagram.part.ShapesVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ShapesDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ShapesPackage.eINSTANCE.getDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((org.eclipse.sketch.examples.shapes.Diagram) domainElement)) {
			return DiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.eclipse.sketch.examples.shapes.diagram.part.ShapesVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.sketch.examples.shapes.diagram.part.ShapesVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case DiagramEditPart.VISUAL_ID:
			if (ShapesPackage.eINSTANCE.getSquare().isSuperTypeOf(
					domainElement.eClass())) {
				return SquareEditPart.VISUAL_ID;
			}
			if (ShapesPackage.eINSTANCE.getTriangle().isSuperTypeOf(
					domainElement.eClass())) {
				return TriangleEditPart.VISUAL_ID;
			}
			if (ShapesPackage.eINSTANCE.getUnknown().isSuperTypeOf(
					domainElement.eClass())) {
				return UnknownEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.sketch.examples.shapes.diagram.part.ShapesVisualIDRegistry
				.getModelID(containerView);
		if (!DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (DiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.sketch.examples.shapes.diagram.part.ShapesVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = DiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case UnknownEditPart.VISUAL_ID:
			if (UnknownLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DiagramEditPart.VISUAL_ID:
			if (SquareEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (TriangleEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (UnknownEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectionEditPart.VISUAL_ID:
			if (ConnectionLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DashedConnectionEditPart.VISUAL_ID:
			if (DashedConnectionLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ShapesPackage.eINSTANCE.getConnection().isSuperTypeOf(
				domainElement.eClass())) {
			return ConnectionEditPart.VISUAL_ID;
		}
		if (ShapesPackage.eINSTANCE.getDashedConnection().isSuperTypeOf(
				domainElement.eClass())) {
			return DashedConnectionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(
			org.eclipse.sketch.examples.shapes.Diagram element) {
		return true;
	}

}
