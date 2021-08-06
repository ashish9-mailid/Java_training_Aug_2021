package com.training.treeset;

import java.util.Comparator;
import java.util.TreeSet;


class MyBookComparator implements Comparator<Book>
{

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return b1.getTitle().compareTo(b2.getTitle());
	}

}


public class TreeSetDemo {

	/*
	 * private static class MyBookComparator1 implements Comparator<Book> {
	 * 
	 * @Override public int compare(Book b1, Book b2) { // TODO Auto-generated
	 * method stub Double d1=b1.getPrice(); Double d2=b2.getPrice(); return
	 * d1.compareTo(d2); }
	 * 
	 * }
	 */

	public static void main(String[] args) {

		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(10); set1.add(34);set1.add(6);set1.add(2);set1.add(8);

		System.out.println(set1);


		TreeSet<Book> bookSet = new TreeSet<>();
		bookSet.add(new Book("4231", "C", 150.25, 100));
		bookSet.add(new Book("2345", "Alchemist", 250.25, 100));
		bookSet.add(new Book("7896", "Think like a Monk", 450.25, 100));
		bookSet.add(new Book("1234", "Stay hungry Stay Foolish", 150.25, 100));
		print(bookSet);
		System.out.println("--------------------------------------");

		//MyBookComparator comp=new MyBookComparator();
		Comparator<Book> comp1=new Comparator<Book>()
		{
		
			public int compare(Book b1, Book b2) { 
				Double d1=b1.getPrice(); 
				Double d2=b2.getPrice(); 
				return d1.compareTo(d2);
			}


		};

		TreeSet<Book> bookSet1 = new TreeSet<>(comp1);
		bookSet1.add(new Book("4231", "C", 150.25, 100));
		bookSet1.add(new Book("2345", "Alchemist", 250.25, 100));
		bookSet1.add(new Book("7896", "Think like a Monk", 450.25, 100));
		bookSet1.add(new Book("1234", "Stay hungry Stay Foolish", 150.25, 100));

		print(bookSet1);




	}

	private static void print(TreeSet<Book> bookSet) {
		for(Book book:bookSet)
			System.out.println(book);
	}

}
