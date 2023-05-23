package com.javaString;

public class PrintEachWordHowManyTimes {

	public static void main(String[] args) {

		String a = "India is my country all indians are my friends all is well friends";
		int count = 0;
		int visited = -1;
		
		//char[] abc= a.toCharArray();
		String words[] = a.split(" ");
		int rep[] = new int[words.length];
		
		for (int i=0;i<words.length;i++) {
			count =1;
			for (int j=i+1;j<words.length;j++) {
				
				if(words[i].equalsIgnoreCase(words[j])) {
					count++;
					words[j]= "0";
					rep[j]= visited;
				}
			}
			if(rep[i]!=visited)
				rep[i]=count;
		}
		for (int i= 0;i<rep.length;i++ ) {
			if(rep[i]!=visited) {
				System.out.println(" "+words[i]+ " "+ rep[i]);
			}
		}
		
	}

}
