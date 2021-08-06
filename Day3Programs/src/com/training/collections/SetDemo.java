package com.training.collections;



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void printSet(Set<String> Set1)
	{
		//enhanced loop 1.5 and above
		for(String name:Set1)
			System.out.println(name);
	}

	public static void main(String[] args) {

		Set<String> Set1 =new HashSet<>();
		Set1.add("sam");Set1.add("Elizibeth");
		Set1.add("peter");Set1.add("sam");
	//	Set1.add(2, "john");

		System.out.println(Set1);

		/*
		 * for(int i=0;i<Set1.size();i++) System.out.println(Set1.get(i));
		 */

		System.out.println("-----------------------------");


		printSet(Set1);
		
		// remove an element based on index.
		//Set1.remove(2);
		printSet(Set1);
		System.out.println("-----------------------------");
		
		//remove an element 
		Set1.remove("sam");
		System.out.println("-----------------------------");
		
		printSet(Set1);
		
		//search for an element
		
		System.out.println(Set1.contains("sam"));
		
		//System.out.println(Set1.indexOf("sam"));
		
		//update sam to sam123
		
	//	Set1.set(Set1.indexOf("sam"), "sam123");
		
		printSet(Set1);

		// java 8
		//Set1.forEach(n->System.out.println(n));
		
	//	Set<String> Set2 = Arrays.asSet("sam","john","peter");
		
		Set<String> Set2 = new HashSet<>(Arrays.asList("sam","john","peter","sam"));
		System.out.println(Set2);
		
		Set2.add("george");
		System.out.println(Set2);
		

	}

}
