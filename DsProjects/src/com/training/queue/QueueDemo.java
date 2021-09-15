package com.training.queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue q1=new Queue();
		q1.enQue(10);
		
		q1.enQue(20);
		
		q1.enQue(30);

		q1.display();
		System.out.println();
		
		q1.deque();
		q1.display();
		System.out.println();
		
		q1.deque();
		q1.display();
		System.out.println();
		
		q1.deque();
		q1.display();
		System.out.println();
		
		
		
		
	}

}
