package com.javaArrays;

public class PrintingElementsAtOddPlace {

	public static void main(String[] args) {
		
		int[] abc = new int[] {1,2,3,4,5,6,7,8,9};
		int sum = 0;
		
		for (int i=0; i<abc.length; i=i+2) {
			System.out.println(abc[i]);
			sum = sum + abc[i];
		}
			System.out.println(sum);
	}

}
