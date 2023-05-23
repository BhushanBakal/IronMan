package com.javaArrays;


public class IronMan {

	public static void main(String args[]){
		
		String array[] = new String[2];
		array[0]= "Bhushan";
		array[1]= "tushan";

		for (int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}
	}
	
		public void trial() {
			int arr[]= {1,2,3,4,5,6,7,8,9};
			int len = arr.length;
			for (int i=0;i<=len-1;i++)
			{
				System.out.print(arr[i]);
			}
	
			System.out.println();
			int arr1[] = {1,2,3,4,5,6,7,8,9};
			int len1 = arr1.length;
			for (int i=len1-1;i>=0;i--)
			{
				System.out.print(arr1[i]);
			}
		}
	}

