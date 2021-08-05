package com.training.clients;

import com.training.classes.Product;
import com.training.classes.ProductStore;

public class ProductStoreClient {

	public static void main(String[] args) {
		ProductStore store=new ProductStore();
		store.addProduct(456, "sauce", 150, 100);
		store.addProduct(432, "nuts", 57, 100);
		store.addProduct(123, "jam", 67, 100);

		store.printProducts();

		Product product = store.searchProduct(5678);
		
		
		if(product!=null)
			System.out.println(product);
		else
			System.out.println("Product not found");
	}

}
