package com.training.clients;

import com.training.classes.AddOperation;
import com.training.classes.Product;
import com.training.classes.ProductOperator;
import com.training.interfaces.Operator;

public class OperatorClient {

	public static void main(String[] args) {
		

		Operator op = new AddOperation();
		op.operate(23, 45);
		
		op= new ProductOperator();
		Product p1= new Product(123, "nuts", 150.20, 100);
		Product p2 = new Product(5678, "sauce", 75.25, 100);
		
		op.operate(p1, p2);
	}

}
