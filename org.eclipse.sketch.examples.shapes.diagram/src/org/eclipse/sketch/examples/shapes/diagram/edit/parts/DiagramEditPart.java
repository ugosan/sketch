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
package org.eclipse.sketch.examples.shapes.diagram.edit.parts;

import java.util.Collections;
import java.util.List;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayeredPane;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableLabelEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.DiagramImpl;
import org.eclipse.sketch.Sketch;
import org.eclipse.sketch.examples.shapes.Diagram;
import org.eclipse.sketch.examples.shapes.diagram.edit.policies.DiagramCanonicalEditPolicy;
import org.eclipse.sketch.examples.shapes.diagram.edit.policies.DiagramItemSemanticEditPolicy;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class DiagramEditPart extends
		org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "Shapes"; //$NON-NLS-1$

	private IFigure contentPane;

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 1000;

	/**
	 * @generated
	 */
	public DiagramEditPart(View view) {
		super(view);
	}

	@Override
	public void performRequest(Request request) {

		super.performRequest(request);
	}

	@Override
	/**
	 * Replaces default figure with layered pane. Lower layer for decorations, upper is original figure.
	 */
	protected IFigure createFigure() {
		FreeformLayeredPane pane = new FreeformLayeredPane();
		FreeformLayer roseLayer = new FreeformLayer() {

			public Rectangle getFreeformExtent() {
				// Do not count children; they are decorations that should not interfere with diagram contents.
				Insets insets = getInsets();
				return new Rectangle(0, 0, insets.getWidth(),
						insets.getHeight());
			}
		};
		roseLayer.setLayoutManager(new StackLayout());
		//roseLayer.setBorder(new MarginBorder(10));
		pane.add(roseLayer);
		roseLayer.add(new Figure() {
			@Override
			public void paint(Graphics g) {
				g.setLineWidth(1);
				g.setForegroundColor(new Color(null, 100, 100, 100));

				DiagramImpl d = (DiagramImpl) getModel();

				Sketch s = ((Diagram) d.getElement()).getRootSketch();

				if (s != null) {

					for (int i = 1; i < s.getPointlist().size(); i++) {
						Point p = (Point) s.getPointlist().get(i);
						Point lastp = p;
						lastp = (Point) s.getPointlist().get(i - 1);

						if (lastp.x == -1) {
							//if the last point is a pen lift, then consider just the current one
							g.drawLine(p.x, p.y, p.x, p.y);

						} else if (p.x > 0) {
							//if is a normal point, then traces a line from the last point to the current
							g.drawLine(lastp.x, lastp.y, p.x, p.y);
						}

					}
				}

			}
		});

		pane.add(contentPane = super.createFigure());
		return pane;
	}

	@Override
	public IFigure getContentPane() {
		return contentPane;
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new DiagramItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
				new DiagramCanonicalEditPolicy());
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);
	}

	/**
	 * @generated
	 */
	/*package-local*/static class NodeLabelDragPolicy extends
			NonResizableEditPolicy {

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected List createSelectionHandles() {
			MoveHandle h = new MoveHandle((GraphicalEditPart) getHost());
			h.setBorder(null);
			return Collections.singletonList(h);
		}

		/**
		 * @generated
		 */
		public Command getCommand(Request request) {
			return null;
		}

		/**
		 * @generated
		 */
		public boolean understandsRequest(Request request) {
			return false;
		}
	}

	/**
	 * @generated
	 */
	/*package-local*/static class LinkLabelDragPolicy extends
			NonResizableLabelEditPolicy {

		/**
		 * @generated
		 */
		@SuppressWarnings("rawtypes")
		protected List createSelectionHandles() {
			MoveHandle mh = new MoveHandle((GraphicalEditPart) getHost());
			mh.setBorder(null);
			return Collections.singletonList(mh);
		}
	}

}
