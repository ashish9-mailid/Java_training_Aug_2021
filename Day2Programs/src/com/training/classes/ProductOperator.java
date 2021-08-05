package com.training.classes;

import com.training.interfaces.Operator;

public class ProductOperator implements Operator<Product> {

	@Override
	public void operate(Product x, Product y) {
		
		if(x.getPrice() > y.getPrice())
			System.out.println(x);
		else
			System.out.println(y);
	}

}
