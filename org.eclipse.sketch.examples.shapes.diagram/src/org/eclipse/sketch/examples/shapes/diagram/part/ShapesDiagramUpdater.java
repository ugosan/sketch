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
package org.eclipse.sketch.examples.shapes.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sketch.examples.shapes.Connection;
import org.eclipse.sketch.examples.shapes.DashedConnection;
import org.eclipse.sketch.examples.shapes.Diagram;
import org.eclipse.sketch.examples.shapes.Shape;
import org.eclipse.sketch.examples.shapes.ShapesPackage;
import org.eclipse.sketch.examples.shapes.Square;
import org.eclipse.sketch.examples.shapes.Triangle;
import org.eclipse.sketch.examples.shapes.Unknown;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.ConnectionEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.DashedConnectionEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.DiagramEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.SquareEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.TriangleEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.UnknownEditPart;
import org.eclipse.sketch.examples.shapes.diagram.providers.ShapesElementTypes;

/**
 * @generated
 */
public class ShapesDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ShapesNodeDescriptor> getSemanticChildren(View view) {
		switch (ShapesVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ShapesNodeDescriptor> getDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		Diagram modelElement = (Diagram) view.getElement();
		LinkedList<ShapesNodeDescriptor> result = new LinkedList<ShapesNodeDescriptor>();
		for (Iterator<?> it = modelElement.getShapes().iterator(); it.hasNext();) {
			Shape childElement = (Shape) it.next();
			int visualID = ShapesVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SquareEditPart.VISUAL_ID) {
				result.add(new ShapesNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == TriangleEditPart.VISUAL_ID) {
				result.add(new ShapesNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == UnknownEditPart.VISUAL_ID) {
				result.add(new ShapesNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getContainedLinks(View view) {
		switch (ShapesVisualIDRegistry.getVisualID(view)) {
		case DiagramEditPart.VISUAL_ID:
			return getDiagram_1000ContainedLinks(view);
		case SquareEditPart.VISUAL_ID:
			return getSquare_2001ContainedLinks(view);
		case TriangleEditPart.VISUAL_ID:
			return getTriangle_2002ContainedLinks(view);
		case UnknownEditPart.VISUAL_ID:
			return getUnknown_2003ContainedLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001ContainedLinks(view);
		case DashedConnectionEditPart.VISUAL_ID:
			return getDashedConnection_4002ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getIncomingLinks(View view) {
		switch (ShapesVisualIDRegistry.getVisualID(view)) {
		case SquareEditPart.VISUAL_ID:
			return getSquare_2001IncomingLinks(view);
		case TriangleEditPart.VISUAL_ID:
			return getTriangle_2002IncomingLinks(view);
		case UnknownEditPart.VISUAL_ID:
			return getUnknown_2003IncomingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001IncomingLinks(view);
		case DashedConnectionEditPart.VISUAL_ID:
			return getDashedConnection_4002IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getOutgoingLinks(View view) {
		switch (ShapesVisualIDRegistry.getVisualID(view)) {
		case SquareEditPart.VISUAL_ID:
			return getSquare_2001OutgoingLinks(view);
		case TriangleEditPart.VISUAL_ID:
			return getTriangle_2002OutgoingLinks(view);
		case UnknownEditPart.VISUAL_ID:
			return getUnknown_2003OutgoingLinks(view);
		case ConnectionEditPart.VISUAL_ID:
			return getConnection_4001OutgoingLinks(view);
		case DashedConnectionEditPart.VISUAL_ID:
			return getDashedConnection_4002OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getDiagram_1000ContainedLinks(
			View view) {
		Diagram modelElement = (Diagram) view.getElement();
		LinkedList<ShapesLinkDescriptor> result = new LinkedList<ShapesLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Connection_4001(modelElement));
		result.addAll(getContainedTypeModelFacetLinks_DashedConnection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getSquare_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getTriangle_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getUnknown_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getConnection_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getDashedConnection_4002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getSquare_2001IncomingLinks(
			View view) {
		Square modelElement = (Square) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ShapesLinkDescriptor> result = new LinkedList<ShapesLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DashedConnection_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getTriangle_2002IncomingLinks(
			View view) {
		Triangle modelElement = (Triangle) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ShapesLinkDescriptor> result = new LinkedList<ShapesLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DashedConnection_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getUnknown_2003IncomingLinks(
			View view) {
		Unknown modelElement = (Unknown) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ShapesLinkDescriptor> result = new LinkedList<ShapesLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Connection_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingTypeModelFacetLinks_DashedConnection_4002(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getConnection_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getDashedConnection_4002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getSquare_2001OutgoingLinks(
			View view) {
		Square modelElement = (Square) view.getElement();
		LinkedList<ShapesLinkDescriptor> result = new LinkedList<ShapesLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DashedConnection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getTriangle_2002OutgoingLinks(
			View view) {
		Triangle modelElement = (Triangle) view.getElement();
		LinkedList<ShapesLinkDescriptor> result = new LinkedList<ShapesLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DashedConnection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getUnknown_2003OutgoingLinks(
			View view) {
		Unknown modelElement = (Unknown) view.getElement();
		LinkedList<ShapesLinkDescriptor> result = new LinkedList<ShapesLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Connection_4001(modelElement));
		result.addAll(getOutgoingTypeModelFacetLinks_DashedConnection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getConnection_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ShapesLinkDescriptor> getDashedConnection_4002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ShapesLinkDescriptor> getContainedTypeModelFacetLinks_Connection_4001(
			Diagram container) {
		LinkedList<ShapesLinkDescriptor> result = new LinkedList<ShapesLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection) {
				continue;
			}
			Connection link = (Connection) linkObject;
			if (ConnectionEditPart.VISUAL_ID != ShapesVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Shape dst = link.getTarget();
			Shape src = link.getSource();
			result.add(new ShapesLinkDescriptor(src, dst, link,
					ShapesElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ShapesLinkDescriptor> getContainedTypeModelFacetLinks_DashedConnection_4002(
			Diagram container) {
		LinkedList<ShapesLinkDescriptor> result = new LinkedList<ShapesLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DashedConnection) {
				continue;
			}
			DashedConnection link = (DashedConnection) linkObject;
			if (DashedConnectionEditPart.VISUAL_ID != ShapesVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Shape dst = link.getTarget();
			Shape src = link.getSource();
			result.add(new ShapesLinkDescriptor(src, dst, link,
					ShapesElementTypes.DashedConnection_4002,
					DashedConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ShapesLinkDescriptor> getIncomingTypeModelFacetLinks_Connection_4001(
			Shape target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ShapesLinkDescriptor> result = new LinkedList<ShapesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ShapesPackage.eINSTANCE
					.getAbstractConnection_Target()
					|| false == setting.getEObject() instanceof Connection) {
				continue;
			}
			Connection link = (Connection) setting.getEObject();
			if (ConnectionEditPart.VISUAL_ID != ShapesVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Shape src = link.getSource();
			result.add(new ShapesLinkDescriptor(src, target, link,
					ShapesElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ShapesLinkDescriptor> getIncomingTypeModelFacetLinks_DashedConnection_4002(
			Shape target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ShapesLinkDescriptor> result = new LinkedList<ShapesLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ShapesPackage.eINSTANCE
					.getAbstractConnection_Target()
					|| false == setting.getEObject() instanceof DashedConnection) {
				continue;
			}
			DashedConnection link = (DashedConnection) setting.getEObject();
			if (DashedConnectionEditPart.VISUAL_ID != ShapesVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Shape src = link.getSource();
			result.add(new ShapesLinkDescriptor(src, target, link,
					ShapesElementTypes.DashedConnection_4002,
					DashedConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ShapesLinkDescriptor> getOutgoingTypeModelFacetLinks_Connection_4001(
			Shape source) {
		Diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Diagram) {
				container = (Diagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ShapesLinkDescriptor> result = new LinkedList<ShapesLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Connection) {
				continue;
			}
			Connection link = (Connection) linkObject;
			if (ConnectionEditPart.VISUAL_ID != ShapesVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Shape dst = link.getTarget();
			Shape src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ShapesLinkDescriptor(src, dst, link,
					ShapesElementTypes.Connection_4001,
					ConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ShapesLinkDescriptor> getOutgoingTypeModelFacetLinks_DashedConnection_4002(
			Shape source) {
		Diagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof Diagram) {
				container = (Diagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ShapesLinkDescriptor> result = new LinkedList<ShapesLinkDescriptor>();
		for (Iterator<?> links = container.getConnections().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof DashedConnection) {
				continue;
			}
			DashedConnection link = (DashedConnection) linkObject;
			if (DashedConnectionEditPart.VISUAL_ID != ShapesVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			Shape dst = link.getTarget();
			Shape src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ShapesLinkDescriptor(src, dst, link,
					ShapesElementTypes.DashedConnection_4002,
					DashedConnectionEditPart.VISUAL_ID));
		}
		return result;
	}

}
