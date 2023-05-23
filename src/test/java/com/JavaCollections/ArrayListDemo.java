package com.JavaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList als = new ArrayList();
		als.add("bhush");
		als.add(100);
		als.add(12.39);
		als.add("java");
		System.out.println(als);
		
		//ArrayList size (how many elements are stored in the arraylist)
		int ArrayListsize= als.size();
		System.out.println(ArrayListsize);
		
		// removing elements
		als.remove(2);
		als.remove("bhush"); // removing by element value
		System.out.println("--------------");
		System.out.println(als);
		
		// adding with index
		als.add(2, "python");
		
		//retriving specific element
		System.out.println(als.get(2));
		
		//replce/change element
		System.out.println("changing elements in list");
		als.set(0, "element");
		System.out.println(als);
		
		//search arraylist
		System.out.println(als.contains("jaa"));
		
		//isEmpty
		System.out.println(als.isEmpty());
		
		//How to read data in arraylist
		// 1. using for loop
		// 2. using for each loop
		// 3. using iterator
		
		// 1. using for loop
		System.out.println("reading from for loop");
		for (int i=0; i<als.size(); i++) {
			System.out.println(als.get(i));
		}
		
		// 2. using for each loop
		for (Object e: als) {
			System.out.println(e);
		}
		
		// 3. using iterator
		System.out.println("from iterator");
		Iterator it = als.iterator();
		while (it.hasNext())
		{
			
			System.out.println(it.next());
		}
		
		//adding all into an arraylist
		ArrayList al_all= new ArrayList();
		al_all.addAll(als);
		System.out.println(al_all);
		
		//removing all elements at atime
		al_all.removeAll(als);
		System.out.println("post removeal :" +al_all);
		
		ArrayList <String>al= new ArrayList<String>();
		al.add("Bhushan");
		al.add("bhush");
		al.add("naruto");
		al.add("boruto");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);

	}

}
