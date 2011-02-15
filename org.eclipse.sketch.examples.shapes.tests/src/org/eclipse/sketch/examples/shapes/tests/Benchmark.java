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
 package org.eclipse.sketch.examples.shapes.tests;

import java.util.ArrayList;

public class Benchmark {

	
	String mySquare = "33333333555555557777777711111111";
	
	public static void main(String[] args)throws Exception{
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("33333333555555557777777711111111");
		strings.add("4333332345555555557777777777811111111");
		strings.add("4333333455556555777787787111111111");
		strings.add("4333235555555557787177871111111");
		strings.add("433333333233455545555555577777777787711111111131");
		strings.add("47677775455555533332333181118187777777");
		strings.add("4777777555555545333333333181111111187777");
		strings.add("48777755655555343332333331111111877777");
		strings.add("45555555553332334333333111111181877777777777");
		strings.add("455555555553333333323331111111111777777777");
		strings.add("47717656555555333333333333321111818777777");
		
		/*ArrayList<String> milstrings = new ArrayList<String>();
		milstrings.addAll(strings);
		milstrings.addAll(strings);
		milstrings.addAll(strings);
		milstrings.addAll(strings);
		milstrings.addAll(strings);
		milstrings.addAll(strings);
		milstrings.addAll(strings);
		milstrings.addAll(strings);
		milstrings.addAll(strings);*/
		
		long time = System.currentTimeMillis();
		int all = 0;
		for(int i=0;i<strings.size();i++){
			System.out.println("comparing "+strings.get(i));
			for(int j=0;j<strings.size();j++){
				if(i!=j){
					
					//System.out.println(LevenshteinHandler.run(strings.get(j), strings.get(i)));					
				
				}
			}
		}
		
		System.out.println(all/strings.size());
		System.out.println(System.currentTimeMillis()-time);
		
		
		
	}
	
}
