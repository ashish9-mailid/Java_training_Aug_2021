package com.training.classes;

public class Customer extends User{
	private String email;
	
	
	public Customer() {
		super();
	}

	public Customer(String name, String email) {
		this.name=name;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void giveOffers()
	{
		System.out.println("ou get a discount of 10%");
	}
	
	
	

}
