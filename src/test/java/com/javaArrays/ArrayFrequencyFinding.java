package com.javaArrays;

public class ArrayFrequencyFinding {

	public static void main(String[] args) {
		
		int[] abc = new int[] {1,2,3,4,5,6,2,4,5};
		int[] xy = new int [abc.length];
		
		int visited = -1;
		
		for (int i=0; i<abc.length; i++) {
			int count = 1;
			for (int j= i+1; j<abc.length; j++) {
				if (abc[i]==abc[j]) {
					count++;
				xy[j]= visited;
				}
			}
		
			if (xy[i]!= visited)
			xy[i]=count;
	}	
			for (int i=0; i<xy.length; i++) {
				if (xy[i]!= visited)
					System.out.println(abc[i] + " | " + xy[i]);
			}
		}
	
	}

