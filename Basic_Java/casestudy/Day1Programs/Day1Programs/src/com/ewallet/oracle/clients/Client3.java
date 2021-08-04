package com.ewallet.oracle.clients;

import com.ewallet.oracle.classes.User;

public class Client3 {

	public static void main(String[] args) {
		
		User user1=new User("Smith", "98833322", 35);
		System.out.println(user1);// toString() of Object
		
		User user2=new User("Smith", "98833322", 35);
		
		System.out.println(user1==user2);// false
		
		User user3=user1;
		System.out.println(user1==user3);// true
		
		System.out.println(user1.equals(user2));//true
		
		System.out.println(user1.hashCode());
		
		System.out.println(user2.hashCode());
		System.out.println(user3.hashCode());
		
		

	}

}
