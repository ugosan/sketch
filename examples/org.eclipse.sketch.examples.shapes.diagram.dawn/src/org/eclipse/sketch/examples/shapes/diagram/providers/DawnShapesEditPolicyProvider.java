package org.eclipse.sketch.examples.shapes.diagram.providers;

import org.eclipse.sketch.examples.shapes.diagram.edit.parts.DiagramEditPart;
import org.eclipse.sketch.examples.shapes.diagram.edit.policies.DawnDiagramCanonicalEditPolicy;
import org.eclipse.sketch.examples.shapes.diagram.part.ShapesDiagramEditorPlugin;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;

public class DawnShapesEditPolicyProvider extends AbstractProvider
		implements
			IEditPolicyProvider {
	public static String ID = "org.eclipse.sketch.examples.shapes.diagram.providers.DawnShapesEditPolicyProvider";

	public boolean provides(IOperation operation) {
		if (operation instanceof CreateEditPoliciesOperation) {
			CreateEditPoliciesOperation editPoliciesOperation = (CreateEditPoliciesOperation) operation;
			if (editPoliciesOperation.getEditPart() instanceof DiagramEditPart) {
				return true;
			}
		}
		return false;
	}

	public void createEditPolicies(EditPart editPart) {
		if (editPart instanceof DiagramEditPart) {
			editPart.installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
					new DawnDiagramCanonicalEditPolicy());
		}
	}
}
