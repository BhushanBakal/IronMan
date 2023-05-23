package com.javaString;

public class CountNoOfCharactersInString {

	public static void main(String[] args) {
		
		String abc = "Bhushan Bakal";
		int count =0;
		
		for (int i=0; i<abc.length();i++) {
			if(abc.charAt(i)!=' ');
			count++;
			
		}
		System.out.println("total characters in string are " + count);
		System.out.println(abc.length());

	}

}
