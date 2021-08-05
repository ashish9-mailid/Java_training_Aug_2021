package com.training.classes;

public class Operations {

	public static int add2Numbers(int x,int y)
	{
		return x+y;
	}

	// check if any number is a prime number

	public static boolean isPrime(int number)
	{
		for(int ctr=2;ctr<=Math.sqrt(number);ctr++)
			if(number%ctr==0)
				return false;

		return true;

	}

	public static String getWeek(int index)
	{

		String weeks[] = {"sunday","Monday","Tuesday","wednesday","thursday","friday","saturday"};
		return weeks[index];
	}
}

