package com.training.threads;

public class Thread2 extends Thread {
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
