package com.training.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class A
{
	public void m1() //throws FileNotFoundException
	{
		
	}
}

class B extends A
{
	public void m1() 
	{
		try {
			FileReader fr=new FileReader("data.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Demo4 {

	public static void main(String[] args) {
		

	}

}
