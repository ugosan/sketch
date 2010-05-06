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
 package org.eclipse.sketch.examples.shapes.diagram.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.DiagramEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.SquareEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.TriangleEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.UnknownEditPart;
import org.eclipse.sketch.examples.shapes.diagram.part.Messages;
import org.eclipse.sketch.examples.shapes.diagram.part.ShapesDiagramEditorPlugin;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;

/**
 * @generated
 */
public class ShapesModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated NOT
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof DiagramEditPart) {
			ArrayList types = new ArrayList(3);
			//types.add(ShapesElementTypes.Square_2001);
			//types.add(ShapesElementTypes.Triangle_2002);
			//types.add(ShapesElementTypes.Unknown_2003);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof SquareEditPart) {
			return ((SquareEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof TriangleEditPart) {
			return ((TriangleEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof UnknownEditPart) {
			return ((UnknownEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof SquareEditPart) {
			return ((SquareEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof TriangleEditPart) {
			return ((TriangleEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof UnknownEditPart) {
			return ((UnknownEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof SquareEditPart) {
			return ((SquareEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof TriangleEditPart) {
			return ((TriangleEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof UnknownEditPart) {
			return ((UnknownEditPart) sourceEditPart)
					.getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof SquareEditPart) {
			return ((SquareEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof TriangleEditPart) {
			return ((TriangleEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof UnknownEditPart) {
			return ((UnknownEditPart) targetEditPart)
					.getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof SquareEditPart) {
			return ((SquareEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof TriangleEditPart) {
			return ((TriangleEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof UnknownEditPart) {
			return ((UnknownEditPart) sourceEditPart)
					.getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				ShapesDiagramEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.ShapesModelingAssistantProviderMessage);
		dialog.setTitle(Messages.ShapesModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
