package com.training.account;

public class AccountClient {

	public static void main(String[] args) {
		Account account = new Account(111, 2000);
		
		//class Partner1 extends Thread
		Thread t1=new Thread()
		{
			public void run()
			{
				account.withdraw(1500);  // partner1 should acquire lock on account object
			}
		};
		
		//class Partner2 extends Thread
		Thread t2=new Thread()
		{
			public void run()
			{
				account.withdraw(500);
			}
		};
		
		//Partner1 p1=new Partner1(); 
		t1.setName("Partner1- Thread");
		t1.start(); 
		
		//Partner2 p2=new Partner2();
		t2.setName("Partner2 -Thread");
		t2.start();
				

	}

}
