package com.javaString;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		String a = "abc";
		String b = "bad";
		
		char[] ab = a.toCharArray();
		char[] bb = b.toCharArray();
		
		if (a.length()!=b.length()) {
			System.out.println("String is not anagram");
		}
		
		Arrays.sort(ab);
		Arrays.sort(bb);
		
		if(Arrays.equals(ab, bb)== true) {
			System.out.println("anagram");
		}else 
			System.out.println("not anagram");
		
	}

}
