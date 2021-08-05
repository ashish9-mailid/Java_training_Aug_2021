package com.training.clients;

import com.training.classes1.Customer;
import com.training.classes1.User;

public class UserClient {

	public static void main(String[] args) {
		
		User user1 = new User("abcd123", "Ajay");
		
		System.out.println(user1); //com.training.classes1.User@36aa7bc2   toString()
		
		Customer customer = new Customer("ajjpr374", "Peter", "pet@gmail.com");
		System.out.println(customer);// toString()
		
		
		
	}

}
