package com.javaArrays;

public class PrintElementsOfArray {

	public static void main(String[] args) {

		int [] abc = {1,2,3,4,5,6};
		
		for (int i=0;i<abc.length;i++)
			System.out.print(abc[i] + " ");
		
		System.out.println();
		//Printing elements in reverse order

		for (int i=abc.length-1;i>=0;i--)
			System.out.print(abc[i] + " ");
	}

}
