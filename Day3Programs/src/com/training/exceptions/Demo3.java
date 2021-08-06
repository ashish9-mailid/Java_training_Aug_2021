package com.training.exceptions;
/*read a +ve single digit number and calculate the sqrt , throws an exception for 
 * invalid input */

import java.util.Scanner;


public class Demo3 {

	public static void main(String[] args) {

		System.out.println("Enter a +ve Single digit number");
		int n= new Scanner(System.in).nextInt();
		try {
			if(n<0 || n > 9) {
				//	throw new ArithmeticException("Invalid input:non zero single digit");
				throw new NonZeroSingleDigitException("Invalid input:non zero single digit");
			}
			else
				System.out.println(Math.sqrt(n));
		}

		catch(NonZeroSingleDigitException e)
		{
			System.out.println(e); // toString()
			//System.out.println(e.getMessage());
		}
	}

}
