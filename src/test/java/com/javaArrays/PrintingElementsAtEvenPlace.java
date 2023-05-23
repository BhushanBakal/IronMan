package com.javaArrays;

public class PrintingElementsAtEvenPlace {

	public static void main(String[] args) {
		
		int[] abc= new int[] {1,2,3,4,5,6,7,8,9,0};
		int sum = 0;
		
		for (int i=1; i<abc.length;i=i+2) {
			System.out.print(abc[i] + " ");
			sum = sum + abc[i];
		} 
			System.out.println(sum);
	}

}
