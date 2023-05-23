package com.javaArrays;

public class FibonnaciSeries {

	public static void main(String[] args) {
		
		int a = 0;
		int b= 1;
		int c =0 ;
		int count = 15;
		
		
		System.out.print("fibonacci series " + a+" "+ b);
	
		for (int i=2; i<=count;i++) {
		c= a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
		}
	}
	}


