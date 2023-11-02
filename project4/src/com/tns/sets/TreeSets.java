package com.tns.sets;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSets {
	public static void operations()
	{
		TreeSet<Integer> nset = new TreeSet<Integer>();
		//adding elements
		nset.add(12);
		nset.addAll(Arrays.asList(new Integer[]{1,4,5,3,7}));
		//nset.add(null); exception arises
		//print set
		Iterator<Integer>ite = nset.iterator();
		System.out.println("the elements in arrays are");
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}
}
		
		
		
		
		
	


	