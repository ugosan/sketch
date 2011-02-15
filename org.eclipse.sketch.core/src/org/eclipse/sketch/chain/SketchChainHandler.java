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
package org.eclipse.sketch.chain;


import org.eclipse.sketch.Sketch;
import org.eclipse.sketch.SketchManager;

public abstract class SketchChainHandler {

	
	protected SketchManager manager;
	
	public void setManager(SketchManager manager){
		this.manager = manager; 
	}
	
	public abstract SketchChainHandler perform(Sketch sketch);
	
	public abstract void setSuccessor(SketchChainHandler s);
}
 
