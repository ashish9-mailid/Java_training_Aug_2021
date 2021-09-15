package com.training.linear;

import java.util.Arrays;

public class MyList {
	private Object objects[]=new Object[3];
	private int count;
	Class c1 =null; 
	int ctr=0;
	private boolean checkType(Object obj)
	{
		
		if(count==0) {
			c1=obj.getClass();count++;return true;
		}
		else {count++;	
			if(obj.getClass()==c1)
				return true;
			else
				return false;
			
		}
	}
		
		public String add(Object obj) 
		{
			if(ctr==2)
			{
				Object objects1[] = Arrays.copyOf(objects, objects.length+3);
				//Create a copy of the Array with size 3 more and assign 
				objects = objects1;
			}
			if(checkType(obj)) {
				objects[ctr++] = obj;
			return obj+" added";	
			}
			else
			{
				try {
				throw new TypeMisMatchException(obj+"Type MisMatch");
				}
				finally {
					return "";
				}
				}
			
		}
		
		public String toString()
		{
			StringBuffer sb = new StringBuffer("[");
			for(Object o:objects) {
				if(o!=null)
				sb.append(o+" ");
			}
			sb.append("]");
			return sb.toString();
				
		}
			
	
	
	public static void main(String[] args)  {
		
		MyList list1 = new MyList();
		/*
		 * System.out.println(list1.checkType("abc"));
		 * System.out.println(list1.checkType(1));
		 * System.out.println(list1.checkType("xyz"));
		 */
		
		   System.out.println(list1.add("abc"));
		   System.out.println(list1.add(1));
		   System.out.println(list1.add("xyz"));
		   
		   System.out.println(list1);
		   System.out.println(list1.add("xyz"));
		   System.out.println(list1.add(1.7));
		   System.out.println(list1.add("xyz"));
		   System.out.println(list1);
		   
		  
		
	}

}
