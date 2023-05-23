package com.javaArrays;

public class PrintOddAndEvenFromArray {

	public static void main(String[] args) {
		
		int [] abc = new int[] {1,2,34,5,6,7,8,9,88};
		
		System.out.println("odd numbers");
		for (int i=0;i<abc.length; i++) {
			if (abc[i]%2!=0) {
				System.out.print(abc[i]+" ");
			}
		}
			
		System.out.println();
			System.out.println("even numbers");
			for (int i=0;i<abc.length; i++) {
				if (abc[i]%2==0) {
					System.out.print(abc[i]+ " ");
				}

	}
			
	}}
