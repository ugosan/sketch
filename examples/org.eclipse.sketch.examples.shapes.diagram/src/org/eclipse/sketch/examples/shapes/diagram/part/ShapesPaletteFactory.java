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
 package org.eclipse.sketch.examples.shapes.diagram.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.sketch.examples.shapes.diagram.AnnotateSketchTool;
import org.eclipse.sketch.examples.shapes.diagram.ShapesSketchTool;
import org.eclipse.sketch.examples.shapes.diagram.providers.ShapesElementTypes;

/**
 * @generated
 */
public class ShapesPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createShapes1Group());
	}

	/**
	 * Creates "shapes" palette tool group
	 * @generated
	 */
	private PaletteContainer createShapes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Shapes1Group_title);
		paletteContainer.setId("createShapes1Group"); //$NON-NLS-1$
		paletteContainer.add(createSquare1CreationTool());
		paletteContainer.add(createTriangle2CreationTool());
		paletteContainer.add(createConnection3CreationTool());
		paletteContainer.add(createDashedConnection4CreationTool());
		paletteContainer.add(createFreeSketch5CreationTool());
		paletteContainer.add(createAnnotation6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSquare1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ShapesElementTypes.Square_2001);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Square1CreationTool_title,
				Messages.Square1CreationTool_desc, types);
		entry.setId("createSquare1CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(ShapesDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.sketch.examples.shapes/icons/square_small.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(ShapesDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.sketch.examples.shapes/icons/square_large.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTriangle2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ShapesElementTypes.Triangle_2002);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Triangle2CreationTool_title,
				Messages.Triangle2CreationTool_desc, types);
		entry.setId("createTriangle2CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(ShapesDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.sketch.examples.shapes/icons/triangle_small.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(ShapesDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.sketch.examples.shapes/icons/triangle_large.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnection3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ShapesElementTypes.Connection_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Connection3CreationTool_title,
				Messages.Connection3CreationTool_desc, types);
		entry.setId("createConnection3CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(ShapesDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.sketch.examples.shapes/icons/connection_small.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(ShapesDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.sketch.examples.shapes/icons/connection_large.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDashedConnection4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(ShapesElementTypes.DashedConnection_4002);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.DashedConnection4CreationTool_title,
				Messages.DashedConnection4CreationTool_desc, types);
		entry.setId("createDashedConnection4CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(ShapesDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.sketch.examples.shapes/icons/dconnection_small.png")); //$NON-NLS-1$
		entry
				.setLargeIcon(ShapesDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.sketch.examples.shapes/icons/dconnection_large.png")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFreeSketch5CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.FreeSketch5CreationTool_title,
				Messages.FreeSketch5CreationTool_desc, null, null) {
		};
		entry.setId("createFreeSketch5CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(ShapesDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.sketch.examples.shapes/icons/Pen.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(ShapesDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.sketch.examples.shapes/icons/Pen.gif")); //$NON-NLS-1$
		entry.setToolClass(ShapesSketchTool.class);
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnnotation6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Annotation6CreationTool_title,
				Messages.Annotation6CreationTool_desc, null, null) {
		};
		entry.setId("createAnnotation6CreationTool"); //$NON-NLS-1$
		entry
				.setSmallIcon(ShapesDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.sketch.examples.shapes/icons/annotation.gif")); //$NON-NLS-1$
		entry
				.setLargeIcon(ShapesDiagramEditorPlugin
						.findImageDescriptor("/org.eclipse.sketch.examples.shapes/icons/annotation.gif")); //$NON-NLS-1$
		entry.setToolClass(AnnotateSketchTool.class);
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
