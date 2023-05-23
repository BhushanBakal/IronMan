package com.JavaCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue q = new PriorityQueue(); // duplicate allowed, insertion order preserved, heterogeneous data not allowed
		LinkedList ll= new LinkedList(); // duplicate allowed, insertion order preserved, heterogeneous data allowed
										// only one diff be	between PQ & LL & rest all the methods are same
		//Adding elements
		
		q.add("a");
		q.add("b");	
		q.add("c");
		q.offer("c");
		q.add("b");	
		q.add("e");	
		System.out.println(q);//[a, b, c, c] insertion order preserved and duplicates allowed
		
		//get head element element() & peek()
		
		System.out.println(q.element());// throws exception if queue is empty
		System.out.println(q.peek()); // returns null  if queue is empty
		System.out.println(q);
		
		// return and remove element from queue remove() & poll()
		
		System.out.println(q.remove());// returns and remove the head element & throws exception if queue is empty
		System.out.println(q);
		System.out.println(q.poll()); // returns and remove the head element &returns null  if queue is empty
		System.out.println(q);
		
		//to read all the elements using iterator method
		
		Iterator it = q.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		for (Object a:q)
		{
			System.out.print(a);
		}
	}

}
