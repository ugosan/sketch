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
package org.eclipse.sketch;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.sketch.util.PointList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;
import org.eclipse.swt.widgets.Display;

/**
 * Very basic implementation of a Sketch database, using properties and storing
 * ONLY the sketched in string form (based on work from Adrien Coyette, Sascha
 * Schimke, Jean Vanderdonckt, and Claus Vielhauer -
 * http://www.isys.ucl.ac.be/bchi/publications/2007/Schimke-Interact2007.pdf).
 * 
 * TODO: store the whole Sketch object - bug
 * https://bugs.eclipse.org/bugs/show_bug.cgi?id=312513.
 * 
 * @author Ugo Sangiorgi
 */
public class SketchBank {

	String workspace =  ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
	String path = workspace
			+ File.separator + "sketches.xml";
	// String path = "/home/ugo/runtime-shapes.product/sketches.xml";
	String pathemf = workspace
			+ File.separator + "sketchbank.xml";
	SketchDatabase database;

	// Types defined by Object. Usually an IElementType or a plain String
	public ArrayList types = new ArrayList();

	public ArrayList sketches = new ArrayList();

	// all the words associated with a type, represented by its name, in case of
	// IElementType, or itself in case of a String
	public static HashMap<String, ArrayList<String>> maps = new HashMap<String, ArrayList<String>>();

	private static SketchBank instance;

	public static SketchBank getInstance() {
		if (instance == null)
			instance = new SketchBank();

		return instance;
	}

	private SketchBank() {

		// if there is a bank already at the disk, fill the maps
		fetch();

	}

	public void reset() {
		File f = new File(path);
		f.delete();

		maps = new HashMap<String, ArrayList<String>>();
		dump();

	}

	/**
	 * SketchTool classes set their recognizable types using this method
	 * 
	 * @param t
	 */
	public void setTypes(ArrayList t) {

		// merge the already existing types in the properties file, with those
		for (int i = 0; i < t.size(); i++) {
			Object newType = t.get(i);
			if (!types.contains(getName(newType))) {
				types.add(getName(newType));
				maps.put(getName(newType), new ArrayList<String>());
			}
		}

	}

	public ArrayList<Object> getAvailableTypes() {
		return types;
	}

	public ArrayList<String> getSketches(Object type) {
		return maps.get(getName(type));
	}

	public void insert(Object type) {

		if (!this.types.contains(getName(type))) {
			this.types.add(getName(type));
		}

		maps.put(getName(type), new ArrayList<String>());
	}

	public void add(Object type, String dna) {
		maps.get(getName(type)).add(dna);
	}

	public void add(Sketch s) {
		PointList list = s.pointlist;
		
		Image img = new Image(null, s.getSize().width, s.getSize().height);
		
		GC imageGC = new GC(img);
		imageGC.setAntialias(SWT.ON);
		imageGC.setForeground(new Color(null,0,0,0));
		
		for(int i=0;i<list.size()-2;i++){
			
			Point p = (Point) list.get(i);
			Point p2 = (Point) list.get(i+1);
			
			Point translatedp = new Point(p.x-s.getLocation().x, p.y-s.getLocation().y);
			Point translatedp2 = new Point(p2.x-s.getLocation().x, p2.y-s.getLocation().y);
			
			imageGC.drawLine(translatedp.x, translatedp.y, translatedp2.x, translatedp2.y);
		}
		
		
		String imgpath = workspace+File.separator+System.currentTimeMillis()+".jpg";

		ImageLoader imgLoader = new ImageLoader();
		imgLoader.data = new ImageData[] { img.getImageData() };
		imgLoader.save(imgpath, SWT.IMAGE_JPEG);
		
		imageGC.dispose();
		List l = new ArrayList();
		l.addAll(database.getSketch());
		l.add(s);
		
		database.eSet(SketchPackage.SKETCH_DATABASE__SKETCH, l);
	}

	public void dump() {
		dumpXMI();
		OutputStream out = null;
		try {

			Properties properties = new Properties();
			for (int i = 0; i < types.size(); i++) {
				Object type = types.get(i);
				ArrayList<String> sketches = getSketches(getName(type));
				if (sketches != null) {
					for (int j = 0; j < sketches.size(); j++) {

						properties.put(sketches.get(j), getName(type));

					}
				}
			}

			out = new FileOutputStream(path);
			properties.storeToXML(
					out,
					"Generated by Eclipse Sketch - sketches made by "
							+ System.getProperty("user.name"));

			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void fetch() {
		fetchXMI();
		try {
			InputStream in = new FileInputStream(path);

			Properties properties = new Properties();
			properties.loadFromXML(in);

			Iterator it = properties.keySet().iterator();

			while (it.hasNext()) {
				String sketch = (String) it.next();

				String type = properties.getProperty(sketch);

				ArrayList<String> sketches = maps.get(getName(type));
				if (sketches == null) {
					sketches = new ArrayList<String>();
					sketches.add(sketch);
					insert((Object) type);
					maps.put(type, sketches);

				} else {
					if (!sketches.contains(sketch))
						sketches.add(sketch);
				}

			}

		} catch (FileNotFoundException e) {
			dump();
		} catch (InvalidPropertiesFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getName(Object type) {
		if (type instanceof IElementType)
			return ((IElementType) type).getDisplayName();
		else
			return (String) type;

	}

	private void fetchXMI() {

		try {

			ResourceSet resourceSet = new ResourceSetImpl();

			resourceSet
					.getResourceFactoryRegistry()
					.getExtensionToFactoryMap()
					.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
							new XMIResourceFactoryImpl());

			resourceSet.getPackageRegistry().put(SketchPackage.eNS_URI,
					SketchPackage.eINSTANCE);

			File f = new File(pathemf);
			if (f.exists()) {

				URI fileURI = URI.createFileURI(new File(pathemf)
						.getAbsolutePath());

				Resource resource = resourceSet.getResource(fileURI, true);

				for (Iterator j = resource.getContents().iterator(); j
						.hasNext();) {
					database = (SketchDatabase) j.next();
					System.out.println("fetching "+database);
				}
			} else {

				database = SketchFactory.eINSTANCE.createSketchDatabase();

			}

		} catch (Exception exception) {
			exception.printStackTrace();
			database = SketchFactory.eINSTANCE.createSketchDatabase();
		}
	}

	private void dumpXMI() {

		ResourceSet resourceSet = new ResourceSetImpl();

		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		try {
			Resource resource = resourceSet.createResource(URI.createURI("http://sketchbank.sketch"));
			
			FileOutputStream out = new FileOutputStream(pathemf);
			resource.getContents().add(database);
			resource.save(out, null);
			System.out.println("saving "+database.getSketch()+" "+pathemf);
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}

	protected static void printDiagnostic(Diagnostic diagnostic, String indent) {
		for (Iterator i = diagnostic.getChildren().iterator(); i.hasNext();) {
			printDiagnostic((Diagnostic) i.next(), indent + "  ");
		}
	}

	// test
	public static void main(String[] args) throws Exception {
		SketchBank.getInstance().dumpXMI();
		
		/*
		 * ArrayList types = new ArrayList(); types.add("Square");
		 * types.add("Circle"); SketchBank.getInstance().setTypes(types);
		 * 
		 * SketchBank.getInstance().insert("objeto novo");
		 * SketchBank.getInstance().add("objeto novo", "12312312");
		 * SketchBank.getInstance().add("objeto novo", "122342342");
		 * 
		 * SketchBank.getInstance().add("Square", "44444444");
		 * 
		 * SketchBank.getInstance().dump(); SketchBank.getInstance().fetch();
		 * 
		 * SketchBank.getInstance().add("Circle", "3423423423");
		 * SketchBank.getInstance().dump();
		 */

	}
}
