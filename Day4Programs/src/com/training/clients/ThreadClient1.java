package com.training.clients;

import com.training.threads1.Series;
import com.training.threads1.Thread1;
import com.training.threads1.Thread2;

public class ThreadClient1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Thread.currentThread());
		
		Series series = new Series();
		Thread1 t1=new Thread1(series); // instanceof Runnable
		
		Thread2 t2=new Thread2(series); // Runnable instance
		
		Thread tr1=new Thread(t1);
		tr1.setName("Even Thread");
		Thread tr2=new Thread(t2);
		tr2.setName("Odd Thread");
		
		tr1.start(); // start() of THread
		
		tr2.start();

		System.out.println(tr1.isAlive());
		System.out.println(tr2.isAlive());
		
		tr1.join(); //main() joins tr1
		tr2.join(); //main joins tr2
		
		System.out.println(tr1.isAlive());
		System.out.println(tr2.isAlive());
		
		
		System.out.println("Finishing Statements");
		System.out.println("End Of Main..");
		
	}

}
