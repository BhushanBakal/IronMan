package com.javaArrays;

public class PrintThirdLargestInArray {

	public static void main(String[] args) {
		
		int[] a = new int[] {1,2,34,5,6,8,9};
		System.out.println(getThirdLargest(a,a.length));
	}

	public static int getThirdLargest(int a[], int total) {
	
		
		int big = 0;
	
		
		for (int i=0; i<total; i++) {
			for (int j=i+1; j<total; j++) {
				if (a[i]>a[j]) {
					big = a[i];
					a[i]=a[j];
					a[j]= big;
				}
			}
		}
		return a[total-1];
		
	}
}
