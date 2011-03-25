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
package org.eclipse.sketch.examples.shapes.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.sketch.examples.shapes.diagram.edit.commands.ConnectionCreateCommand;
import org.eclipse.sketch.examples.shapes.diagram.edit.commands.ConnectionReorientCommand;
import org.eclipse.sketch.examples.shapes.diagram.edit.commands.DashedConnectionCreateCommand;
import org.eclipse.sketch.examples.shapes.diagram.edit.commands.DashedConnectionReorientCommand;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.ConnectionEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.parts.DashedConnectionEditPart;
import org.eclipse.sketch.examples.shapes.diagram.part.ShapesVisualIDRegistry;
import org.eclipse.sketch.examples.shapes.diagram.providers.ShapesElementTypes;

/**
 * @generated
 */
public class SquareItemSemanticEditPolicy extends
		ShapesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SquareItemSemanticEditPolicy() {
		super(ShapesElementTypes.Square_2001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (ShapesVisualIDRegistry.getVisualID(incomingLink) == ConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (ShapesVisualIDRegistry.getVisualID(incomingLink) == DashedConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (ShapesVisualIDRegistry.getVisualID(outgoingLink) == ConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (ShapesVisualIDRegistry.getVisualID(outgoingLink) == DashedConnectionEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(
						outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ShapesElementTypes.Connection_4001 == req.getElementType()) {
			return getGEFWrapper(new ConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ShapesElementTypes.DashedConnection_4002 == req.getElementType()) {
			return getGEFWrapper(new DashedConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (ShapesElementTypes.Connection_4001 == req.getElementType()) {
			return getGEFWrapper(new ConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (ShapesElementTypes.DashedConnection_4002 == req.getElementType()) {
			return getGEFWrapper(new DashedConnectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new ConnectionReorientCommand(req));
		case DashedConnectionEditPart.VISUAL_ID:
			return getGEFWrapper(new DashedConnectionReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
