package com.training.classes;


class A
{
	 protected void m1(int x,int y) { System.out.println("m1 with 2 ints");}
	 public int m1(double x,int y) { System.out.println("m1 with double,int");return 1;}
	 
	 void m2() { System.out.println("m2 default");}
	 
	 public static  void m3() {System.out.println("m3 in A");}
	
}

class B extends A
{
	public int m1(char x,int y) { System.out.println("m1 with char and int ");return 1;}
	
	 public void m1(int x,int y) { System.out.println("m1 with 2 ints re defined");}
	 
	 public int m1(double x,int y) { System.out.println("m1 with double,int again");return 1;}
	 public static void m3() {System.out.println("m3 in B");}
}

public class TestDemo {

	public static void main(String[] args) {
					
		A ob1 = new A();
		ob1.m1(12.0, 34);
		ob1.m1('A', 10);  // early binding /static polymorphism
		
		B ob2=new B();
		ob2.m1('A', 15);
		
		ob2.m1(4, 7);//m1 with 2 ints re defined
		
		ob2.m3();
		
	}

}
