package com.training.threads1;

public class Thread1 implements Runnable{
	private Series series;
	
	public Thread1(Series series)
	{
		this.series=series;
	}
	public void run()
	{
		series.even();
	}

}
