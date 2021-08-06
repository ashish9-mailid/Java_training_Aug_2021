package com.training.exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
	
	public static int m1(int x,int y)
	{
		try {
		return x/y;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			return -999;
		}
		finally {
		System.out.println("End of the method");
		}
	}
	
	public  static void writeToFile()
	{
		FileWriter fw=null;
		try {
			fw=new FileWriter("data.txt");
			fw.write("Good morning");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	
	public  static void writeToFile1() throws IOException
	{
		
		FileWriter fw=new FileWriter("data.txt",true);
		fw.write("Java is Fun");
		fw.close();

	}
	
	public static void main(String[] args) {
		
		//System.out.println(m1(12,0));
		//writeToFile();
		try {
			writeToFile1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
	
	
}
