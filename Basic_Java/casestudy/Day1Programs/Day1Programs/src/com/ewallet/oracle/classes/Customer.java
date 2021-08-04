package com.ewallet.oracle.classes;

public class Customer extends User{

	private long custId;
	private String emailId;
	private static int count;
	
	public Customer() {
		super();
		this.custId=++count;
	}
	
	public Customer(String name, String phoneNo, int age, String emailId) {
		super(name, phoneNo, age); //User(name,phoneNo,age)
		this.emailId = emailId;
		this.custId=++count;
	}
	
	public long getCustId() {
		return custId;
	}
	
	public void setCustId(long custId) {
		this.custId = custId;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String toString()
	{
		return super.toString()+" "+custId+" "+emailId;
	}

	@Override
	public void giveOffers() {
		System.out.println("Customer gets a Cash back of 10%..");
		
	}
	
}
