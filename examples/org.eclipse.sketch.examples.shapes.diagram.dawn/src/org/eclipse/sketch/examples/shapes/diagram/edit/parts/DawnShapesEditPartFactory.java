package org.eclipse.sketch.examples.shapes.diagram.edit.parts;

import org.eclipse.sketch.examples.shapes.diagram.part.ShapesVisualIDRegistry;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

public class DawnShapesEditPartFactory extends ShapesEditPartFactory {

	public DawnShapesEditPartFactory() {
		super();
	}

	@Override
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (ShapesVisualIDRegistry.getVisualID(view)) {
				case DawnDiagramEditPart.VISUAL_ID :
					return new DawnDiagramEditPart(view);
			}
		}

		return super.createEditPart(context, model);
	}
}
