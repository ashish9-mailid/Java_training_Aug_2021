package com.training.arrays;

public class ArrayDemo {
	
	public static void main(String[] args) {
		
		int arr[]; // reference
		 final int SIZE=5;
		arr = new int[SIZE];
		// [ 0,0,0,0,0]
	
		//print
		for(int i=0;i<SIZE;i++)
			System.out.print(arr[i]+" ");
		
		arr[4] = 34;
		
		for(int i=0;i<SIZE;i++)
			System.out.print(arr[i]+" ");
		
	}

}
