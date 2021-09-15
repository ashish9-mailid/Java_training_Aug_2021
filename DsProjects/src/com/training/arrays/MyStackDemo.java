package com.training.arrays;

import com.training.memory.User;

public class MyStackDemo {

	public static void main(String[] args) {
		
		MyStack<Integer> stack1 = new MyStack<Integer>();
		stack1.push(10);stack1.push(20);stack1.push(30);stack1.push(5);stack1.push(15);
		stack1.push(40);

		stack1.display();
		
		System.out.println("Popping elements");
		System.out.println(stack1.pop());System.out.println(stack1.pop());
		System.out.println(stack1.pop());System.out.println(stack1.pop());
		
		System.out.println("Peeked element:"+stack1.peek());
		
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
						
		MyStack<Double> stack2 = new MyStack<Double>();
		stack2.push(10.3);stack2.push(20.5);stack2.push(30.3);stack2.push(5.7);stack2.push(15.9);
		stack2.push(40.9);

		stack2.display();
		
		System.out.println("Popping elements");
		System.out.println(stack2.pop());System.out.println(stack2.pop());
		System.out.println(stack2.pop());System.out.println(stack2.pop());
		
		System.out.println("Peeked element:"+stack2.peek());
		
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
		
		stack2.display();
		
		//MyStack<User> userStack = new MyStack<>();
		
		
	}

}
