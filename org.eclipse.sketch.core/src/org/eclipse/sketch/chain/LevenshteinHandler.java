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


import java.util.ArrayList;
import java.util.HashMap;

import org.eclipse.emf.ecore.xmi.IllegalValueException;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.sketch.Sketch;
import org.eclipse.sketch.SketchBank;
import org.eclipse.sketch.exceptions.IllegalLengthException;
/**
 * Recognize the sketch based on its string form, based on work from Adrien Coyette, Sascha Schimke, Jean Vanderdonckt, and Claus Vielhauer - http://www.isys.ucl.ac.be/bchi/publications/2007/Schimke-Interact2007.pdf
 * @author ugo
 *
 */
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
			if(sketches!=null && sketches.size()>0){
				int sum = 0;
				int sum2 = 0; //comparison var, can be removed in the release
				
				for(int x=0;x<sketches.size();x++)
				{
					String bankDna = sketches.get(x);
					try 
					{
						String stretchedDna; 
						if (bankDna.length() > dna.length())
							stretchedDna = stretch(dna, bankDna.length());
						else
						{
							stretchedDna = dna;
							bankDna = stretch(bankDna, dna.length());
						}						
						
						System.out.println(type);
						System.out.println("dna : "+stretchedDna);
						System.out.println("bank: "+bankDna);
						
						int distance = run(stretchedDna,bankDna);						
						float normalized_distance = 100*(float)distance/stretchedDna.length();
						System.out.println("Distance % (stretch)   :"+normalized_distance);
						
						//This block of code is for comparison, it can be removed in the release 
							int distance2 = run(dna,sketches.get(x));						
							float normalized_distance2 = 100*(float)distance2/Math.max(dna.length(), sketches.get(x).length()); //can
							System.out.println("Distance % (nostretch) :"+normalized_distance2);

						sum += (int)normalized_distance;
						sum2 += (int)normalized_distance2;
					}
					catch (IllegalLengthException e) 
					{
						System.err.println("ERROR : can't stretch this dna");
						e.printStackTrace();
					}					
				}
				
				int average = sum/sketches.size();
				int average2 = sum2/sketches.size(); //can be removed in release
				
				result_map.put(type, new Integer(average));
				debug += "\tAverage distance from "+type+":\t"+average+"\t"+average2+"\n";
			}
			else
			{ 
				result_map.put(type, new Integer(-1));
				debug += "\tAverage distance from "+type+":\t-1\n";
			}
			
		}
		
		HashMap<String,Object> result = sketch.getResult();
		result.put(Sketch.ELEMENT_RESULT_KEY, result_map);

		System.out.println(debug);
		return this;
	}
	
	/**
	 * Stretch the Dna so that it has a given length (bigger than its current length)
	 * @param dna the dna to b stretched
	 * @param length the length to reach
	 * @throws IllegalLengthException when the length to obtain is smaller than the 
	 * current length of the Dna
	 * @return the new Dna, stretched
	 */
	private String stretch(String dna, int length) throws IllegalLengthException 
	{
		int curlength = dna.length();
		
		//Handling lengths that are too big
			if (curlength > length)
				throw new IllegalLengthException(length);
			if (curlength == length)
				return dna;
		
		float step = curlength/(float)(length-curlength);
		
		StringBuffer out = new StringBuffer();
		
		
		System.out.println(dna + "; length:"+curlength+"; step:"+step);
		//if (step > 0)
		{
			for (float i=0; i<curlength; i+=step)
			{
				if (i+step > curlength)
				{
					out.append(dna.substring((int)i));
					if (out.length() < length)
						out.append(dna.charAt((int)(dna.length()-1)));
				}
				else
					out.append(dna.substring((int)i,(int)(i+step)))
					   .append(dna.charAt((int)(i+step-1)));
				//System.out.println(out.toString());
			}
		}
		return out.toString();
	}
	/**
	 * Test function
	 */
	public static void main(String args[])
	{
		LevenshteinHandler l = new LevenshteinHandler();
		try 
		{
			String a;
			a = l.stretch("1234567890", 10); 
			System.out.println(a+";length:"+a.length());
			
			a = l.stretch("3333345555567777899990", 95); 
			System.out.println(a+";length:"+a.length());
			
			a = l.stretch("86666666666655554444443323222222211118117887877770", 95); 
			System.out.println(a+";length:"+a.length());
		} 
		catch (IllegalLengthException e) {e.printStackTrace();}
	}

	/**
	 * String distance algorithm as implemented by Chas Emerick (http://www.merriampark.com/ldjava.htm) based on the 
	 * original source of Michael Gilleland (http://www.merriampark.com/ld.htm) 
	 * 
	 * @author Chas Emerick http://www.merriampark.com/ldjava.htm  
	 * @author Michael Gilleland http://www.merriampark.com/ld.htm
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
 
