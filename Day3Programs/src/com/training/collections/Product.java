package com.training.collections;

/**
 * 
 * 
 * @author Radha
 * @version 1.8
 * 
 *
 */
public class Product {

	private int code;
	private String desc;
	private double price;
	private long stock;
	public Product(int code, String desc, double price, long stock) {
		super();
		this.code = code;
		this.desc = desc;
		this.price = price;
		this.stock = stock;
	}
	public Product() {
		super();
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public long getStock() {
		return stock;
	}
	public void setStock(long stock) {
		this.stock = stock;
	}
	
	/**
	 * This is a method to print the product details
	 */
	public String toString()
	{
		return code+" "+desc+" "+price+" "+stock;
	}
	
	@Override
	public int hashCode() {
		return code;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (code != other.code)
			return false;
		else if(!desc.equals(other.desc))
			return false;
			
		return true;
	}
		
	
}






