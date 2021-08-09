package com.training.threads1;

public class Thread2 implements Runnable {
	private Series series;
	
	public Thread2(Series series)
	{
		this.series=series;
	}
	public void run()
	{
		series.odd();
	}

}
