package com.training.clients;

import java.util.Scanner;

import com.training.classes.Customer;
import com.training.classes.Employee;
import com.training.classes.Factory;
import com.training.classes.User;
import com.training.classes.Utility;

public class UserClient {

	public static void main(String[] args) {
		
		System.out.println("Enter User Type:C/E/S");
		char type = new Scanner(System.in).next().charAt(0); //C
						
		User user = Factory.getUserInstance(type); // Factory Pattern
		
		if(user==null)
			System.out.println("We are working on it.");
		else
		Utility.testOffers(user);
			
		

	}

}
