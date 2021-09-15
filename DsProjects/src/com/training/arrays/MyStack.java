package com.training.arrays;

public class MyStack<T> {   // Byte , Short, Integer , Long, Float , Double
		// create array of SIZE 5
	private final int SIZE=5;
	private Object[] arr = new Object[SIZE];
	private int top =-1;
	public void push(T element)
	{
		//check if stack is full
		if(top==SIZE-1)
			System.out.println("Stack is full");
		else
			arr[++top] = element;		
	}
	public Object pop()
	{
		// check if stack is empty
		if(top==-1) {
			System.out.println("Stack is empty");
		return 	-999;
		}
		else
			return arr[top--];
	}
	
	public Object peek()
	{
		if(top==-1)
			System.out.println("Stack is empty");
		return arr[top];
	}
	
	public void display()
	{
		for(int i=0;i<=top;i++)
			System.out.println(arr[i]);
	}

}
