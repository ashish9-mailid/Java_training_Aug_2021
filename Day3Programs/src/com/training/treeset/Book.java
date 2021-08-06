package com.training.treeset;

public class Book{// implements Comparable<Book>{
	private String isbn;
	private String title;
	private double price; //Double
	private long stock;
	public Book(String isbn, String title, double price, long stock) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
		this.stock = stock;
	}
	public Book() {
		super();
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	@Override
	public String toString() {
		return  isbn+" "+title+" "+price+" "+stock;
	}


	//@Override 
	//public int compareTo(Book book) {
//
		//return this.isbn.compareTo(book.getIsbn()); 

		/*
		 * Double d1=price; //autoboxing Double d2=book.getPrice();
		 * 
		 * return d1.compareTo(d2);
		 */


	



}
