package org.eclipse.sketch.examples.shapes.diagram.edit.policies;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.notation.View;

import java.util.ArrayList;
import java.util.List;

public class DawnDiagramCanonicalEditPolicy extends DiagramCanonicalEditPolicy {

	public DawnDiagramCanonicalEditPolicy() {
		super();
	}

	@Override
	protected CreateViewRequest getCreateViewRequest(
			List<ViewDescriptor> descriptors) {
		List<View> viewChildren = getViewChildren();

		List<ViewDescriptor> tbr = new ArrayList<CreateViewRequest.ViewDescriptor>();

		for (ViewDescriptor desc : descriptors) {
			EObject obj = (EObject) ((CanonicalElementAdapter) desc
					.getElementAdapter()).getRealObject();

			boolean found = false;

			for (View view : viewChildren) {
				if (view.getElement().equals(obj)) {
					found = true;
					break;
				}
			}
			if (!found) {
				tbr.add(desc);
			}
		}

		descriptors.removeAll(tbr);

		return new CreateViewRequest(descriptors);
	}
}
