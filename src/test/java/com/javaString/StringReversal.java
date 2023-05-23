package com.javaString;

public class StringReversal {

	public static void main(String[] args) {
		
		String abc = "Saske Uchiha";
		String ab = "";
		
		for (int i=abc.length()-1;i>=0;i--) {
			ab = ab + abc.charAt(i);
		}
		System.out.println(ab);

	}

}
