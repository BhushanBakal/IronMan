package com.javaArrays;

public class PrintLargestFromTheArray {

	public static void main(String[] args) {
		
		int[] abc = new int[] {1,2,3,4,55,6,77,88,99,123};
		int max = abc[0];
		
		for (int i =0; i<abc.length; i++) {
			if (abc[i]>max)
				max = abc[i];
		}
		System.out.println(max);
	}

}
