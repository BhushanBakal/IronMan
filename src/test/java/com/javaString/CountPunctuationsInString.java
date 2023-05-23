package com.javaString;

public class CountPunctuationsInString {

	public static void main(String[] args) {
		
	String str = "bhu.shan! is? a good; fello.";
	int count =0;
	
	
	for (int i=0; i<str.length();i++) {
		if (str.charAt(i)=='!' || str.charAt(i)=='?' || str.charAt(i)==';'||str.charAt(i)=='.') {
			count++;
		}			
	}
	System.out.println("total punctuations are "+ count);

	}

}
