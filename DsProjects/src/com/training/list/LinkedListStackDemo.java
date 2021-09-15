package com.training.list;

public class LinkedListStackDemo {

	public static void main(String[] args) {
		
		MyLinkedListStack list1=new MyLinkedListStack();
		list1.push(10);
		list1.display();
		
		System.out.println();
		list1.push(20);
		list1.display();
		
		System.out.println();
		list1.push(30);
		list1.display();
		
		System.out.println("Top element:"+list1.peek());
		System.out.println();
		System.out.println("------------popping --------------");
		System.out.println(list1.pop());
		list1.display();
		
		System.out.println("------------popping --------------");
		System.out.println(list1.pop());
		list1.display();
		
		System.out.println("------------popping --------------");
		System.out.println(list1.pop());
		list1.display();
		
		System.out.println("------------popping --------------");
		System.out.println(list1.pop());
		list1.display();
	}
}
