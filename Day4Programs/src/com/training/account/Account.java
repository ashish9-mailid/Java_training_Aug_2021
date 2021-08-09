package com.training.account;

public class Account {
	
	private long accountNo;
	private double balance;
	public Account(long accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	
	public /* synchronized */ void withdraw(double amount)
	{
		System.out.println("Request Taken..."+Thread.currentThread().getName());
		
		synchronized(this) {
		if(balance - amount >= 1000) {
		
		System.out.println("Processing...."+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance = balance - amount;
		System.out.println("Processed.."+balance+" "+Thread.currentThread().getName());
		}
		else
			System.out.println("Insufficient Balance..");
		}
		
	}

}
