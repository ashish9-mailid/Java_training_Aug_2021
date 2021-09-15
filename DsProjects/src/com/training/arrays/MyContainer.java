package com.training.arrays;

import java.util.ArrayList;

public class MyContainer {
	private ArrayList list1 = new ArrayList();
	private Class c1=null;
	
	public static void main(String[] args) {
		MyContainer container= new MyContainer();
		container.add(12);
		container.add("abc"); // adds to the container
		 // reject 
		container.add(3.45);//does not add
		container.add("xyz"); // adds
		container.add("pqr");
		container.add(56);
		
		System.out.println(container); // System.out.print(list1);

	}
	
	private void add(Object obj) {
		
		
		/*
		 *  check the type of first data
		 *  add that to the container(list1)
		 *  check the type of other data 
		 *  if it matches with that of the first data
		 *  add it else ignore
		 */
		
		if(list1.isEmpty())
		{
			c1 = obj.getClass();
			list1.add(obj);
		}
		else
		{
			Class c2 = obj.getClass();
			if(c1==c2)
				list1.add(obj);
		}
	}
	
	public String toString()
	{
		return list1.toString();
	}

}
