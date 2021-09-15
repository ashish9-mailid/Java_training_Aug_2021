package com.training.linear;

import java.util.ArrayList;

public class MyArrays {
	
	private static MyList list1;
	
	public static MyList asList(Object... args)
	{
		list1=new MyList();
		for(Object o:args)
			list1.add(o);
		return list1;
	}
	
	public static void main(String[] args) {
		
		MyList list1 = MyArrays.asList(3,4,"abc",3.45);
		System.out.println(list1);
	}

// write code for Linear Search
	public static linearSearch(..)
{

}
	

}
