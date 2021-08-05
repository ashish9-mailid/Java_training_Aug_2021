package com.training.clients;

import java.util.Scanner;

import com.training.classes.Customer;
import com.training.classes.Employee;
import com.training.classes.Factory;
import com.training.classes.User;
import com.training.classes.Utility;

public class UserClient {

	public static void main(String[] args) {
		
		/*
		 * System.out.println("Enter User Type:C/E/S"); char type = new
		 * Scanner(System.in).next().charAt(0); //C
		 * 
		 * User user = Factory.getUserInstance(type); // Factory Pattern
		 * 
		 * if(user==null) System.out.println("We are working on it."); else
		 * Utility.testOffers(user);
		 */
			
		
		
		Object obj = new Customer();
		System.out.println(obj instanceof Object); // true
		System.out.println(obj instanceof Customer); //true
		System.out.println(obj instanceof User); //true
		
		System.out.println(obj instanceof Employee);//false
		
		System.out.println(obj instanceof String); //false
		
		User e = new Employee();
		System.out.println(e instanceof User); // true
		System.out.println(e instanceof Employee); //true
		System.out.println(e instanceof Customer); //false
		
		//System.out.println(e instanceof String);
		

	}

}
