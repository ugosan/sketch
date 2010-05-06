/*******************************************************************************
 * Copyright (c) 2010 The Eclipse Foundation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  Ugo Sangiorgi <ugo.sangiorgi@gmail.com> - Initial contribution
 *******************************************************************************/
package org.eclipse.sketch.clientobserver;

import org.eclipse.sketch.Sketch;

public interface ISketchProducer {
	void attach(ISketchListener ob);
	void detach(ISketchListener ob);
	void notifyNewSketch(Sketch s);
	void notifyNewGesture(Sketch s);
	
}
