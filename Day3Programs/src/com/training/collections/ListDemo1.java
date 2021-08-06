package com.training.collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListDemo1 {

	public static void printList(List<String> list1)
	{
		//enhanced loop 1.5 and above
		for(String name:list1)
			System.out.println(name);
	}

	public static void main(String[] args) {

		List<String> list1 =new ArrayList<>();
		list1.add("sam");list1.add("Elizibeth");
		list1.add("peter");list1.add("sam");
		list1.add(2, "john");

		System.out.println(list1);

		/*
		 * for(int i=0;i<list1.size();i++) System.out.println(list1.get(i));
		 */

		System.out.println("-----------------------------");


		printList(list1);
		
		// remove an element based on index.
		list1.remove(2);
		printList(list1);
		System.out.println("-----------------------------");
		
		//remove an element 
		list1.remove("sam");
		System.out.println("-----------------------------");
		
		printList(list1);
		
		//search for an element
		
		System.out.println(list1.contains("sam"));
		
		System.out.println(list1.indexOf("sam"));
		
		//update sam to sam123
		
		list1.set(list1.indexOf("sam"), "sam123");
		
		printList(list1);

		// java 8
		//list1.forEach(n->System.out.println(n));
		
	//	List<String> list2 = Arrays.asList("sam","john","peter");
		
		List<String> list2 = new ArrayList<>(Arrays.asList("sam","john","peter"));
		System.out.println(list2);
		
		list2.add("george");
		System.out.println(list2);
		

	}

}
