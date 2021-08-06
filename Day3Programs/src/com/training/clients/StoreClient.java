package com.training.clients;

import java.util.List;
import java.util.Scanner;

import com.training.collections.Product;
import com.training.collections.ProductStore;

public class StoreClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductStore store = new ProductStore();
		store.addProduct(2345, "Ketch up", 150.28, 100);
		store.addProduct(678, "Chilli Ketch up", 120.28, 100);
		store.addProduct(986, "chocos", 80.78, 100);
		store.addProduct(886, "chocolates", 810.78, 100);
		outer : while(true)
		{
					
			System.out.println("1.add a product");
			System.out.println("2. delete a product");
			System.out.println("3. display all products");
			System.out.println("4. update stock");
			System.out.println("5. Search based on pattern");
			System.out.println("0. exit");
			
			System.out.println("Enter choice 1/2/3/4/0");
			int choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("Enter code,desc,price,stock");
				store.addProduct(sc.nextInt(),sc.next(),sc.nextDouble(),sc.nextLong());
				break;
			case 2:
				System.out.println(store.deleteProduct(2345)); break;
			case 3:
				print(store.getProducts());break;
			case 4:
				System.out.println("Enter code and new stock");
				System.out.println(store.addStock(sc.nextInt(), sc.nextLong()));break;
			case 5:
				System.out.println("Enter pattern");
				List<Product> searchList = store.searchPattern(sc.next());
				if(searchList.isEmpty())
					System.out.println("products not found");
				else
				print(searchList);break;
			case 0:
				break outer;
				
				
			}
		}

				
		/*ProductStore store = new ProductStore();
		store.addProduct(2345, "Ketch up", 150.28, 100);
		store.addProduct(678, "Chilli Ketch up", 120.28, 100);
		store.addProduct(986, "chocos", 80.78, 100);
		store.addProduct(886, "chocolates", 810.78, 100);	*/
		
		
		/*System.out.println("---------------------");
		List<Product> searchList = store.searchPattern("tch");
		if(searchList.isEmpty())
			System.out.println("products not found");
		else
		print(searchList);*/

	}

	private static void print(List<Product> products) {
		
		for(Product p:products)
			System.out.println(p);
		
	}

}
