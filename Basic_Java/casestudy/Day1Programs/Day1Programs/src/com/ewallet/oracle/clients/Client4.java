package com.ewallet.oracle.clients;

import com.ewallet.oracle.classes.Customer;

public class Client4 {

	public static void main(String[] args) {
		Customer c1=new Customer("sam", "43323223", 34, "sam@gmail.com");
		System.out.println("Customer "+c1.getCustId()+ " Is generated");
		
		Customer c2=new Customer("peter", "43323223", 34, "pet@gmail.com");
		System.out.println("Customer "+c2.getCustId()+ " Is generated");
		
		System.out.println(c1.equals(c2));//true
		System.out.println(c1); 
	}

}
