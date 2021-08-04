package com.ewallet.oracle.classes;

public class Account {

	private String creditCardNo;
	private String validDate;
	private double balance;
	private User user;//has a 
		
	public Account() {
		
	}
	public Account(String creditCardNo, String validDate, double balance,
			User user) {
		this.creditCardNo = creditCardNo;
		this.validDate = validDate;
		this.balance = balance;
		this.user = user;
	}
	public String getCreditCardNo() {
		return creditCardNo;
	}
	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	public String getValidDate() {
		return validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
