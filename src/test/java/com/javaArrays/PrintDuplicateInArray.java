package com.javaArrays;

public class PrintDuplicateInArray {

	public static void main(String[] args) {

		int [] abc = new int[] {1,2,3,4,5,6,4,3,2};
		
		for (int i=0; i<abc.length; i++) {
			
			for (int j=i+1; j<abc.length; j++) {
				if (abc[i]==abc[j])
					System.out.println(abc[j]);
			}
			
		}

	}

}
