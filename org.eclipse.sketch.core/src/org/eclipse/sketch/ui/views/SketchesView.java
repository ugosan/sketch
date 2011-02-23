/*******************************************************************************
 * Copyright (c) 2010 Ugo Sangiorgi and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Ugo Sangiorgi <ugo.sangiorgi@gmail.com> - Initial contribution
 *******************************************************************************/
package org.eclipse.sketch.ui.views;


import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.nebula.widgets.gallery.DefaultGalleryGroupRenderer;
import org.eclipse.nebula.widgets.gallery.DefaultGalleryItemRenderer;
import org.eclipse.nebula.widgets.gallery.Gallery;
import org.eclipse.nebula.widgets.gallery.GalleryItem;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;



/**
 * This sample class demonstrates how to plug-in a new
 * workbench view. The view shows data obtained from the
 * model. The sample creates a dummy model on the fly,
 * but a real implementation would connect to the model
 * available either in this or another plug-in (e.g. the workspace).
 * The view is connected to the model using a content provider.
 * <p>
 * The view uses a label provider to define how model
 * objects should be presented in the view. Each
 * view can present the same model objects using
 * different labels and icons, if needed. Alternatively,
 * a single label provider can be shared between views
 * in order to ensure that objects of the same type are
 * presented in the same way everywhere.
 * <p>
 */

public class SketchesView extends ViewPart {

	

	 /**
    * The ID of the view as specified by the extension.
    */
   public static final String ID = "org.eclipse.sketch.ui.views.SketchesView";
   Gallery gallery_1;
   Composite parent;
	
	public SketchesView() {
	}

	@Override
	public void createPartControl(Composite parent) {
		this.parent = parent;
		gallery_1 = new Gallery(parent, SWT.BORDER);
		gallery_1.setVertical(true);
		gallery_1.setGroupRenderer(new DefaultGalleryGroupRenderer());
		gallery_1.setItemRenderer(new DefaultGalleryItemRenderer());
		
		GalleryItem galleryItem = new GalleryItem(gallery_1, SWT.NONE);
		galleryItem.setText("New Item");
		
		loadGallery();

		
	}

	/**
	 * Fills up the gallery with sketch images from the database (SketchBank)
	 * TODO: retrieve sketches from the SketchBank and insert the images on the gallery
	 */
	private void loadGallery(){
		

		try{
			IWorkspaceRoot myWorkspaceRoot= ResourcesPlugin.getWorkspace().getRoot();


			gallery_1.removeAll();
			String[] dirs = new String[]{myWorkspaceRoot.getLocation().append("img").toFile().getAbsolutePath()};
			for(int d=0;d<dirs.length;d++){
				File f = new File(dirs[d]);
				File[] files = f.listFiles();
				GalleryItem group = new GalleryItem(gallery_1, SWT.NONE);
				//group.setText(RelativePath.getRelativePath(openedFile, f)); //$NON-NLS-1$
				group.setText(f.getAbsolutePath()); //$NON-NLS-1$
				group.setExpanded(true);

				for (int i = 0; i < files.length; i++) {
					if(files[i].isFile()){
						try{

							Image itemImage = new Image(parent.getDisplay(), files[i].getAbsolutePath());

							GalleryItem item = new GalleryItem(group, SWT.NONE);
							item.setImage(itemImage);
							item.setData(files[i]);
							
						}catch(Exception ex){ ex.printStackTrace(); }
					}
				}
			}

		}catch(Exception e){
			e.printStackTrace();
		}





	}
	
	@Override
	public void setFocus() {
		// TODO Auto-generated method stub
		
	}
}