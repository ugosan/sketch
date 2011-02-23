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
 package org.eclipse.sketch.examples.shapes.diagram.application;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

/**
 * @generated
 */
public class DiagramEditorPerspective implements IPerspectiveFactory {
	/**
	 * @generated NOT
	 */
	public void createInitialLayout(IPageLayout layout) {
		layout.setEditorAreaVisible(true);
		layout
				.addPerspectiveShortcut(DiagramEditorWorkbenchAdvisor.PERSPECTIVE_ID);
		IFolderLayout right = layout.createFolder(
				"right", IPageLayout.RIGHT, 0.7f, layout.getEditorArea()); //$NON-NLS-1$

		right.addView("org.eclipse.sketch.ui.views.SketchRecognizerControlView");
		right.addView("org.eclipse.sketch.ui.views.SketchesView");
		
		IFolderLayout bottom = layout.createFolder(
				"left", IPageLayout.BOTTOM, 0.7f, layout.getEditorArea()); //$NON-NLS-1$

		bottom.addView(IPageLayout.ID_PROP_SHEET);

		IFolderLayout bottomRight = layout.createFolder(
				"bottomRight", IPageLayout.BOTTOM, 0.7f, "right"); //$NON-NLS-1$	 //$NON-NLS-2$
		bottomRight.addView(IPageLayout.ID_OUTLINE);

	}
}