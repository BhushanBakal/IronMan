package com.javaString;

public class CountNoOfVowelsAndConsonuts {

	public static void main(String[] args) {

		String abc = "Bhushan Bakal";
		int vcount=0;
		int ccount=0;
		
	String xyz=	abc.toLowerCase();
	
	for (int i=0; i<xyz.length();i++) {
		if (xyz.charAt(i)=='a'|| xyz.charAt(i)=='e'||xyz.charAt(i)=='i'||xyz.charAt(i)=='o'||xyz.charAt(i)=='u') {
			vcount++;
		}
		
		else if (xyz.charAt(i)>='a'&&xyz.charAt(i)<='z') {
			ccount++;
		}
			
			
	}
		System.out.println("no of vowels " +vcount);
		System.out.println("no of consonuts " +ccount);

	}

}
