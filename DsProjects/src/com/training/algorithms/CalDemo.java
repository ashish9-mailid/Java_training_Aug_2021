package com.training.algorithms;

public class CalDemo {
	
	/*
	 * public static long factorial(int num) { long fact=1;
	 * 
	 * for(int n=num;n>0;n--) { System.out.println(n+ " "+fact); fact = fact * n;
	 * 
	 * } return fact;
	 * 
	 * }
	 */
	
	public static long factorial(int num)
	{
		  if(num==1 || num==0) return 1;
		else
		{
			/*
			 * int n=num-1; long p = num * factorial(n); System.out.println(p); return p;
			 */
			
			return num * factorial(num-1);
		}
			
	}
	
	public static int fib(int n)  //6
	{
		// base condition
		if(n==1) return 0;
		else if(n==2) return 1;
		
		return fib(n-1)+fib(n-2); 
	}
	
	public static void main(String[] args) {
		
		/*
		 * int n=0;
		 * 
		 * long fact = factorial(n); System.out.println("Factorial of n:"+fact);
		 */
		int n=8; // 0 1 1 2 3 5 8 13 21 34
		System.out.println("Fib of "+ n +" is"+fib(n));
	}

}
