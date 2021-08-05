package com.training.classes;
public class ProductStore
{
	private final int SIZE = 5;
	private Product products[] = new Product[SIZE];//[null,null,null,null,null]
	int count=0;

	public void addProduct(int code,String desc,double price,long stock)
	{
		if(count < SIZE){
		Product p= new Product(code,desc,price,stock);
		products[count++]=p;
		}

	}
	
	public void printProducts()
	{
		for(int i=0;i<count;i++)
			System.out.println(products[i]);
	}
	
	public Product searchProduct(int code)
	{
		for(int i=0;i<count;i++)
		{
			if(products[i].getCode()==code)
				return products[i];
		}
		return null;
	}

	

}
