package com.training.exceptions;

public class Demo1 {
	
	public static void main(String[] args) { //java Demo1 12d 2a
		try {
		int n1=Integer.parseInt(args[0]);
		int n2= Integer.parseInt(args[1]);
			try {
			int z=n1/n2;
			System.out.println("result="+z);
			}
			catch(ArithmeticException e)
			{
				System.out.println(e.getMessage());
				System.out.println("deno cannot be 0");
			}
		}
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		/*
		 * catch(NumberFormatException e) { System.out.println(e.getMessage()); }
		 */
		catch(Exception e)
		{
			System.out.println("Some other exception");
		}
		
		
		
			
		
	}

}
