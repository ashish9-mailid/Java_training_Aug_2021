package com.training.collections;

import java.util.ArrayList;
import java.util.List;

public class ProductStore {

	private List<Product> products;

	public ProductStore()
	{
		products = new ArrayList<>();
	}

	public List<Product> getProducts()
	{
		return products;
	}

	public boolean addProduct(int code,String desc,double price,long stock)
	{
		return products.add(new Product(code, desc, price, stock));
	}



	public Product searchProduct(int code) {
		for(Product p:products)
		{
			if(p.getCode()==code)
				return p;

		}
		return null;
	}

	public boolean deleteProduct(int code) {
		Product p= searchProduct(code);
		if(p!=null) {
			products.remove(p);return true;
		}

		return false;
	}

	public boolean addStock(int code,long newStock) {
		for(Product p:products)
		{
			if(p.getCode()==code)
			{
				p.setStock(p.getStock()+newStock);
				return true;
			}
		}
		return false;
	}

	public List<Product> searchPattern(String descPattern) {

		List<Product> productSearchList=new ArrayList<>();
		for(Product p:products)
		{
			if(p.getDesc().indexOf(descPattern)!=-1)
				productSearchList.add(p);

		}
		return productSearchList;
	}



}





