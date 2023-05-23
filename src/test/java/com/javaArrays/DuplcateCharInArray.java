package com.javaArrays;

public class DuplcateCharInArray {

	public static void main(String[] args) {

	 String stringb = "Bhushan Bakal";
	 int count;
	 
	 char[] stringArray = stringb.toCharArray();
	 
	 for (int i=0; i<stringArray.length; i++) {
		 count = 1;
		 
		 for (int j=i+1;j<stringArray.length;j++) {
			 if (stringArray[i]==stringArray[j]&&stringArray[i]!=' ') {
				 count++;
				 stringArray[j]='0';
			 }
		 }
		 if (count>1&&stringArray[i]!='0')
			 System.out.println(stringArray[i]);
	 }

	}

}
