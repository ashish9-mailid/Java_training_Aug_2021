package com.training.clients;

import com.training.classes.Operations;

public class HelloWorld {
	
	public static void main(String[] args) {  // java HelloWorld 10 14
		
		System.out.println("Hello World");  //ctrl + Space   ctrl + F11
		/* Adding 2 numbers */
		
		
		/*
		 * int x= Integer.parseInt(args[0]); //parseInt is a static method called with
		 * class names int y= Integer.parseInt(args[1]);
		 * 
		 * int result = Operations.add2Numbers(x, y);
		 * 
		 * System.out.println("sum="+result);
		 */
		
		//int number = 13;
	//	System.out.println(Operations.isPrime(number));
		
		int lower=Integer.parseInt(args[0]);
		int upper = Integer.parseInt(args[1]);
		
		for(int limit=lower;limit<=upper;limit++)
			if(Operations.isPrime(limit))
				System.out.print(limit+" ");
		
		
	}
}
