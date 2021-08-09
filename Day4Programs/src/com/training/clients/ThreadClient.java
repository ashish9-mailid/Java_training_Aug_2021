package com.training.clients;

import com.training.threads.Series;
import com.training.threads.Thread1;
import com.training.threads.Thread2;

public class ThreadClient {

	public static void main(String[] args) {
		
		Series series = new Series();
		Thread1 t1=new Thread1(series); // new born
		
		Thread2 t2=new Thread2(series); // new born
		
		t1.start(); // start() of THread
		t2.start();

		
		
	}

}
