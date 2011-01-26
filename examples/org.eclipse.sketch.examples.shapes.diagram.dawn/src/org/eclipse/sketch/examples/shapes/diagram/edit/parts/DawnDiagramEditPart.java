package org.eclipse.sketch.examples.shapes.diagram.edit.parts;

import org.eclipse.emf.cdo.dawn.synchronize.DawnConflictHelper;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

public class DawnDiagramEditPart extends DiagramEditPart {

	public DawnDiagramEditPart(View view) {
		super(view);
	}

	@Override
	protected void removeChild(EditPart child) {
		if (DawnConflictHelper.isConflicted((EObject) child.getModel())) {
			return;
		}
		super.removeChild(child);
	}
}
