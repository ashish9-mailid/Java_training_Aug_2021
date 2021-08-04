package com.ewallet.oracle.classes;

//User sam
public abstract class User extends Object {

	//attributes  instance variables
	private String name;
	private String phoneNo;
	private int age;
				
	public User() {
		
	}

	public User(String name, String phoneNo, int age) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String toString()
	{
		return name+" "+phoneNo+" "+age;
	}
	
	public boolean equals(Object object)
	{
		User user=(User)object;
		
		if(this.phoneNo.equals(user.getPhoneNo()))
			return true;
		
		return false;
	}
	
	public int hashCode()
	{
		return phoneNo.hashCode();
	}
	
	public abstract void giveOffers();
	
}












