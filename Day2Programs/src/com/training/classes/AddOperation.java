package com.training.classes;

import com.training.interfaces.Operator;

public class AddOperation implements Operator<Integer>{

	@Override
	public void operate(Integer x, Integer y) {
		System.out.println("sum="+(x+y));
		
	}


}
