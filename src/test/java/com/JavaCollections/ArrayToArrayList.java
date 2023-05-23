package com.JavaCollections;

import java.util.ArrayList;
import java.util.Arrays;



public class ArrayToArrayList {

	public static void main(String[] args) {

		String animals []  = {"dog","cat","man"};
		
		for (String a:animals) {
			System.out.println(a);
		}
		
		ArrayList al = new ArrayList(Arrays.asList(animals));
		System.out.println(al);

	}

}
