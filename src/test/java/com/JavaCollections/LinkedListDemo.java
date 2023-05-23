package com.JavaCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		//declaring linkedlist
		
		LinkedList l = new LinkedList();
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("b");
		ll.add("n");
		ll.add("k");
		
		
		l.add(10);
		l.add("bhush");
		l.add(34.5);
		l.add("Naruto");
		System.out.println(l);
		System.out.println(l.size());
		
		//removing
		l.remove(2);
		System.out.println(l);
		System.out.println(l.size());
		
		// inerting element in middle
		l.add(2, "element");
		System.out.println(l);
		System.out.println(l.size());
		
		//retrive value /object
		
		System.out.println(l.get(3));
		
		// chage the value
		l.set(3, "bhussjaska");
		System.out.println(l);
		
		//contains
		System.out.println(l.contains("element"));
		System.out.println(l.contains("elem"));
		
		//isEmpty
		System.out.println(l.isEmpty());
		
		for (int i=0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		for (Object e:l) {
			System.out.println(e);
		}
		
		System.out.println("-------------------");
		Iterator it = l.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		
		//removing multiple elements
		l.removeAll(ll);
		System.out.println(l);
		
		//adding multiple elements
				l.addAll(ll);
				System.out.println(l);
				
			Collections.sort(ll);
			
			//adding first elememt
			
		l.addFirst("mnb");
		l.addLast("dfg");
		
		System.out.println(l);
				
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		//remove first & remove last
		
	}

}
