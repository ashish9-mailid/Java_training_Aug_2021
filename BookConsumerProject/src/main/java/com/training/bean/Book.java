package com.training.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@ToString
public class Book {
	private String isbn;
	private String title;
	private double price; //Double
	private long stock;
	private long qty;
	private double amount;
	
	/*
	 * public Book(String isbn, String title, double price, long stock,long qty) {
	 * super(); this.isbn = isbn; this.title = title; this.price = price; this.stock
	 * = stock; this.qty=qty;
	 * 
	 * } public Book() { super(); } public String getIsbn() { return isbn; } public
	 * void setIsbn(String isbn) { this.isbn = isbn; } public String getTitle() {
	 * return title; } public void setTitle(String title) { this.title = title; }
	 * public double getPrice() { return price; } public void setPrice(double price)
	 * { this.price = price; } public long getStock() { return stock; } public void
	 * setStock(long stock) { this.stock = stock; }
	 * 
	 * public long getQty() { return qty; } public void setQty(long qty) { this.qty
	 * = qty; } public double getAmount() { return amount; } public void
	 * setAmount(double amount) { this.amount = amount; }
	 * 
	 * @Override public String toString() { return
	 * isbn+" "+title+" "+price+" "+stock+" "+qty+" "+amount; }
	 */
	
}