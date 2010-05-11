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

public class CornerFindingHandler extends SketchChainHandler {
 
	 
	private SketchChainHandler successor;
	
	
	/**
	 *@see SketchChainHandler#setSuccessor(SketchChainHandler)
	 */
	public void setSuccessor(SketchChainHandler s) {
		this.successor = s;
	}

	@Override
	public  SketchChainHandler perform(Sketch sketch) {
		// TODO Auto-generated method stub
		
		return null;
	}
	 
	 
}
 
