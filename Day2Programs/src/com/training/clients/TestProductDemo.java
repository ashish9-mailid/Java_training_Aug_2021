package com.training.clients;

import com.training.classes.Product;

public class TestProductDemo {

	public static void main(String[] args) {
		
		String s1=new String("sam");
		String s2=new String("sam");
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		
		
		
		Integer i1=23;
		Integer i2=23;

		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode()+" "+i2.hashCode());
		
		
		Product p1= new Product(234, "nuts", 150.25, 100); 
		System.out.println(p1.hashCode());
		
		Product p2= new Product(234, "nuts", 150.25, 100); //
		System.out.println(p2.hashCode());
		
		
		
		System.out.println(p1.equals(p2));
	}

}
