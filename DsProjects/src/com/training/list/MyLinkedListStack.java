package com.training.list;

public class MyLinkedListStack {
	
	class Node
	{
		//Node left;
		int data;
		Node next;
	}
	Node start=null;
	
	public void push(int element)
	{
		Node new1 = new Node(); // create a new node
		new1.data=element;
		
		new1.next=start;
		start = new1;
	}
	
	public int pop()
	{
		if(start==null) {
			System.out.println("List Empty");
		return -999;	
		}
		else {
		int data = start.data;
		start = start.next;
		
		return data;
		}
	}

	public void display()
	{
		for(Node ptr=start;ptr!=null;ptr=ptr.next)
			System.out.print(ptr.data+"->");
	}
	
	public int peek()
	{
		if(start==null) {
			System.out.println("List Empty");
		return -999;	
		}
		return start.data;
	}
}
