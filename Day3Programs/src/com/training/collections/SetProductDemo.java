package com.training.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetProductDemo {

	public static void main(String[] args) {
		
		Set<Product> products = new LinkedHashSet<>();
		products.add(new Product(2345, "Ketch up", 150.28, 100));
		products.add(new Product(4567, "Nuts", 150.28, 100));
		products.add(new Product(321, "chocos", 70.28, 100));
		products.add(new Product(321, "chocos", 170.28, 100));
		
		System.out.println(products);

	}

}
