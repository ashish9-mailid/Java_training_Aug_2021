package com.training.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="booknew")
public class Book {
	
	public Book() {
		
	}
	public Book(String isbn, String title, long stock, double price) {
		this.isbn = isbn;
		this.title = title;
		this.stock = stock;
		this.price = price;
	}
	
	@Id
	private String isbn;
	
	private String title;
	private long stock;
	private double price;
	private String port;
	
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
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
	public double getStock() {
		return stock;
	}
	public void setStock(long stock) {
		this.stock = stock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public String toString()
	{
		return isbn+" "+title+" "+price+" "+stock;
	}
	

}
