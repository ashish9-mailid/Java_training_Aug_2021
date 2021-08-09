package com.training.threads;

public class Series {
	
	public void even()
	{
		for(int i=2;i<=20;i++)
		{
			System.out.println("Even:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    
		}
	}
	public void odd()
	{
		for(int i=1;i<=19;i++)
		{
			System.out.println("Odd:"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
		}
	}


}
