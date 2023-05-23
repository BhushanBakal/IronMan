package com.javaString;

public class PrintDuplicateCharactersInString {

	public static void main(String[] args) {
		
		String ab = "Bhushan Bakal";
		int count =0;
		
		char[] abc = ab.toCharArray();
		
		System.out.println("Duplicate charactres in String are :");
		for (int i=0;i<abc.length;i++) {
			count =1;
			for (int j=i+1;j<abc.length;j++) {
				if(abc[i]==abc[j]&&abc[i]!=' ') {
					count++;
					abc[j]='0';
				}
			}
		
		
			if(count>1&& abc[i]!='0') {
				System.out.print(abc[i] + " ");
			}
		

	}
	}
}
