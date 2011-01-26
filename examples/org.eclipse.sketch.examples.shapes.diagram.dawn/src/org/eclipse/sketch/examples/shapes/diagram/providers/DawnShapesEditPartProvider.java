package org.eclipse.sketch.examples.shapes.diagram.providers;

import org.eclipse.sketch.examples.shapes.diagram.edit.parts.DawnShapesEditPartFactory;
import org.eclipse.sketch.examples.shapes.diagram.part.ShapesDiagramEditorPlugin;

public class DawnShapesEditPartProvider extends ShapesEditPartProvider {

	public DawnShapesEditPartProvider() {
		super();
		setFactory(new DawnShapesEditPartFactory());
	}
}
