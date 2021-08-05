package com.training.classes1;

public class Customer extends User{
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String email;
	
	public Customer() { super(); } // calls super class constructor User()
	
	public Customer(String id,String name,String email)
	{
		//super(id,name);
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	public String toString()
	{
		return id+" "+name+" "+email;
		
		//return super.toString() + " "+email;
	}
	

}
