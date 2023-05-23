package com.javaArrays;

public class SortingArrayInAscendingOrder {

	public static void main(String[] args) {

		int[] abc = new int[] {1,2,3,4,5,6,3,5,56,32,3,7,564,4};
		int big = 0;
		
		//printing original array
		System.out.println("original array");
		for (int i=0;i<abc.length;i++) {
			System.out.print(abc[i]+ " ");
		}
		
		for (int i=0;i<abc.length;i++) {
			for (int j=i+1; j<abc.length; j++) {
				if (abc[i]<abc[j]) {
					big = abc[i];
					abc[i]=abc[j];
					abc[j]=big;
				}
			}
			
	}
		System.out.println();
		System.out.println("after sorting");
		for (int i=0;i<abc.length;i++) {
			System.out.print(abc[i]+ " ");
	}
	}}
