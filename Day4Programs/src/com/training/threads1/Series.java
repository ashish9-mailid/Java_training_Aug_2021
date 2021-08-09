package com.training.threads1;

public class Series {
	
	public void even()
	{
		
		for(int i=2;i<=20;i+=2)
		{
			
			System.out.println(Thread.currentThread()+" "+i);
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
		
		for(int i=1;i<=19;i+=2)
		{
			System.out.println(Thread.currentThread()+" "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   
		}
	}


}
