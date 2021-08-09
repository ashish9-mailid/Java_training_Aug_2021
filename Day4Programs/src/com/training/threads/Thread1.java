package com.training.threads;

public class Thread1 extends Thread {
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
