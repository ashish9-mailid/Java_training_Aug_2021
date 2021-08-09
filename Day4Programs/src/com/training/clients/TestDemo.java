package com.training.clients;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestDemo {

	public static void m1(List<String> names)
	{
		
		names.add("abc");
	}
	public static void main(String[] args) {
		List<String> names = new ArrayList<>(Arrays.asList("sam","peter","ajay"));
		/*
		 * m1(names);
		 * 
		 * new Thread() { public void run() { m1(names); } }.start();
		 */
		
		synchronized(names) {
		names.add("abc");
		}

	}

}
