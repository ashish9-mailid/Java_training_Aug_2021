package com.training.queue;

public class Queue {
	
	class Node
	{
		int data;
		Node next;
	}
	Node front,rear;
	
	public void enQue(int data)
	{
		Node new1 = new Node();
		new1.data=data;
		
		if(front==null) // first node
		front = rear = new1;
		else {
			rear.next = new1;
			rear = new1;
		}
	}
	
	public void deque()
	{
		//code
		if(front==rear)  // 1 element
			front = rear = null;
		else {
		System.out.println(front.data+" Processed..");
			front=front.next;
		
		}
		
	}
	
	public void display()
	{
		System.out.print("Front:");
		for(Node ptr=front;ptr!=null;ptr=ptr.next)
			System.out.print(ptr.data+"->");
		
		System.out.print(":Rear");
	}

}
