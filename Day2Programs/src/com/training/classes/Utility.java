package com.training.classes;

public class Utility {
	
	public static void testOffers(User user)
	{
		System.out.println("Name:"+user.getName());
		
		if(user instanceof Customer)
		{
			Customer customer = (Customer)user;
			System.out.println("Email:"+customer.getEmail());
		}
		
		if(user instanceof Employee)
			System.out.println("Empcode:"+((Employee)user).getEmpCode());
		
		
		if(user instanceof Student)
			System.out.println("Reg no:"+((Student)user).getRegNo());
		user.giveOffers();
	}

}
