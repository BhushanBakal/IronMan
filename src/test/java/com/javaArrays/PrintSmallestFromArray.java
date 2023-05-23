package com.javaArrays;

public class PrintSmallestFromArray {

	public static void main(String[] args) {

		int [] a = new int[] {5,2,3,45,6,7,8,9,8};
		int	min = a[0];
		int sum =0;
		
		for (int i=0; i<a.length; i++)
		{
			if (a[i]<min)
				min = a[i];
		}
		System.out.println(min);

		// to print no of elements present in an array
		System.out.println(a.length); 
		
		//sum of all elements
		
		for (int i=0;i<a.length;i++) {
			 sum = sum + a[i];
		}
		System.out.println(sum);
	}
	
}
