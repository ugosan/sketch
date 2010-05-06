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
package org.eclipse.sketch.chain;


import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.sketch.Sketch;
import org.eclipse.sketch.SketchBank;

public class LevenshteinHandler extends SketchChainHandler {
 
	 
	private SketchChainHandler successor;
	
	
	/**
	 *@see SketchChainHandler#setSuccessor(SketchChainHandler)
	 */
	public void setSuccessor(SketchChainHandler s) {
		this.successor = s;
	}

	@Override
	public SketchChainHandler perform(Sketch sketch) {
		System.out.println("LEVENSHTEIN CHAIN: is it a shape?");
		String dna = sketch.getDna();
		String debug = "";
		
		HashMap<Object, Integer> result_map = new HashMap<Object, Integer>(); 
		
		for(int i=0;i<SketchBank.getInstance().getAvailableTypes().size();i++){
			Object type = SketchBank.getInstance().getAvailableTypes().get(i);
			//debug += "\n\t is it a "+type.getDisplayName()+"?";
			
			ArrayList<String> sketches = SketchBank.getInstance().getSketches(type);
			if(sketches.size()>0){
				int sum = 0;
				for(int x=0;x<sketches.size();x++){
				
					int distance = run(dna,sketches.get(x));
					sum += distance;
					
				}
				
				int average = sum/sketches.size();
				
				result_map.put(type, new Integer(average));
				debug += "\tAverage distance from "+type+": "+average+"\n";
			}else{ 
				result_map.put(type, new Integer(-1));
				debug += "\tAverage distance from "+type+": -1\n";
			}
			
		}
		
		HashMap<String,Object> result = sketch.getResult();
		result.put(Sketch.ELEMENT_RESULT_KEY, result_map);

		System.out.println(debug);
		return this;
	}

	
	/**
	 * @author Chas Emerick  
	 * @param s
	 * @param t
	 * @return
	 */
	private int run (String s, String t) {
		  if (s == null || t == null) {
		    throw new IllegalArgumentException("Strings must not be null");
		  }
				
		  /*
		    The difference between this impl. and the previous is that, rather 
		     than creating and retaining a matrix of size s.length()+1 by t.length()+1, 
		     we maintain two single-dimensional arrays of length s.length()+1.  The first, d,
		     is the 'current working' distance array that maintains the newest distance cost
		     counts as we iterate through the characters of String s.  Each time we increment
		     the index of String t we are comparing, d is copied to p, the second int[].  Doing so
		     allows us to retain the previous cost counts as required by the algorithm (taking 
		     the minimum of the cost count to the left, up one, and diagonally up and to the left
		     of the current cost count being calculated).  (Note that the arrays aren't really 
		     copied anymore, just switched...this is clearly much better than cloning an array 
		     or doing a System.arraycopy() each time  through the outer loop.)

		     Effectively, the difference between the two implementations is this one does not 
		     cause an out of memory condition when calculating the LD over two very large strings.  		
		  */		
				
		  int n = s.length(); // length of s
		  int m = t.length(); // length of t
				
		  if (n == 0) {
		    return m;
		  } else if (m == 0) {
		    return n;
		  }

		  int p[] = new int[n+1]; //'previous' cost array, horizontally
		  int d[] = new int[n+1]; // cost array, horizontally
		  int _d[]; //placeholder to assist in swapping p and d

		  // indexes into strings s and t
		  int i; // iterates through s
		  int j; // iterates through t

		  char t_j; // jth character of t

		  int cost; // cost

		  for (i = 0; i<=n; i++) {
		     p[i] = i;
		  }
				
		  for (j = 1; j<=m; j++) {
		     t_j = t.charAt(j-1);
		     d[0] = j;
				
		     for (i=1; i<=n; i++) {
		        cost = s.charAt(i-1)==t_j ? 0 : 1;
		        // minimum of cell to the left+1, to the top+1, diagonally left and up +cost				
		        d[i] = Math.min(Math.min(d[i-1]+1, p[i]+1),  p[i-1]+cost);  
		     }

		     // copy current distance counts to 'previous row' distance counts
		     _d = p;
		     p = d;
		     d = _d;
		  } 
				
		  // our last action in the above loop was to switch d and p, so p now 
		  // actually has the most recent cost counts
		  return p[n];
		}
}
 
