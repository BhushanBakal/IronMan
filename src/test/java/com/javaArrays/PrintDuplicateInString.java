package com.javaArrays;

public class PrintDuplicateInString {

	public static void main(String[] args) {
		
		String abc = "bhushan is a good guy";
		
		char[] xy = abc.toCharArray();
		
		for (int i = 0; i<xy.length; i++)
			for (int j= i+1; j<xy.length; j++) {
				if(xy[i]==xy[j])
					System.out.print(xy[j]);
			}

	}

}
