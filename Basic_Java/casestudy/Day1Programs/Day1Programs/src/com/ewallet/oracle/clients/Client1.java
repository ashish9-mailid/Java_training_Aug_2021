package com.ewallet.oracle.clients;

import com.ewallet.oracle.classes.User;



public class Client1 {

	public static void main(String[] args) {
		
		//user object
		User user1 =new User(); //name null    phoneNo null
		// calls a constructor  User()
		user1.setName("peter");
System.out.println(user1.getName()+" "+user1.getPhoneNo());//null null


// parameterized constructor
	User user2=new User("sam","3883838",25);
System.out.println(user2.getName()+" "+user2.getPhoneNo()+" "+user2.getAge());
	
	}

}
