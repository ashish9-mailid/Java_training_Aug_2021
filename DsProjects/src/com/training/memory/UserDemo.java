package com.training.memory;

public class UserDemo {

	public static void main(String[] args) {
		
		User user1 = new User(12, "sam");
		User user2=new User(24, "peter");
		
		System.out.println(user1+" "+user2);
		
		//swap(user1,user2);
		
		User temp=user1;   
		user1=user2;
		user2=user1;
		
		System.out.println(user1+" "+user2);

	}

	private static void swap(User user1, User user2) {
		
		User temp=user1;   
		user1=user2;
		user2=user1;
		
	}

}
