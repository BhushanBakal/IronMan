package com.javaString;

public class PalindromString {

	public static void main(String[] args) {
		String abc = "Namannkk";
		String rev = "";
		
		for (int i=abc.length()-1;i>=0;i--) {
			rev = rev + abc.charAt(i);
		}
		System.out.println(rev);
		
		if (abc.equalsIgnoreCase(rev)) {
			System.out.println("string is palindrom");
		}else
			System.out.println(" String is not palindrom");

	}

}
