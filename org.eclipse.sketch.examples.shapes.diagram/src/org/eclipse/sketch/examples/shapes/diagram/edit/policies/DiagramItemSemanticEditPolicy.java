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

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import org.eclipse.sketch.examples.shapes.diagram.edit.commands.SquareCreateCommand;
import org.eclipse.sketch.examples.shapes.diagram.edit.commands.TriangleCreateCommand;
import org.eclipse.sketch.examples.shapes.diagram.edit.commands.UnknownCreateCommand;
import org.eclipse.sketch.examples.shapes.diagram.providers.ShapesElementTypes;

/**
 * @generated
 */
public class DiagramItemSemanticEditPolicy extends
		ShapesBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DiagramItemSemanticEditPolicy() {
		super(ShapesElementTypes.Diagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ShapesElementTypes.Square_2001 == req.getElementType()) {
			return getGEFWrapper(new SquareCreateCommand(req));
		}
		if (ShapesElementTypes.Triangle_2002 == req.getElementType()) {
			return getGEFWrapper(new TriangleCreateCommand(req));
		}
		if (ShapesElementTypes.Unknown_2003 == req.getElementType()) {
			return getGEFWrapper(new UnknownCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
