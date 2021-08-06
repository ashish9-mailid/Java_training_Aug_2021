package com.training.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.training.treeset.Book;

public class TestArraysSort {
	
	public static void main(String[] args) {
		
		
		/*
		 * Comparator<Book> comp=new Comparator<Book>() {
		 * 
		 * public int compare(Book b1, Book b2) {
		 * 
		 * return b1.getIsbn().compareTo(b2.getIsbn()); }
		 * 
		 * };
		 */
		
		
		List<Book> books = Arrays.asList(
				new Book("1234", "C", 150.25, 100),
				new Book("4567", "CPlus", 150.25, 100),
				new Book("2345", "Python", 250.25, 100)
				
				);
		
		Collections.sort(books, new Comparator<Book>()
		{
		
			public int compare(Book b1, Book b2) { 
				
				return b1.getIsbn().compareTo(b2.getIsbn());
			}

		});
		System.out.println(books);
		
		
		//Collections.sort(books);
		System.out.println(books);
		
		Comparator<Book> comp1=(Book b1,Book b2)->{
			return b1.getIsbn().compareTo(b2.getIsbn());
		};
			Collections.sort(books,comp1);
		
	
		
		
		
		
		
		
	}

}
