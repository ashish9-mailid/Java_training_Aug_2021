package com.training.treeset;


interface I1
{
	public void add(int x,int y);
}


/*
 * class A implements I1 {
 * 
 * @Override public void add(int x, int y) { System.out.println(x+y);
 * 
 * }
 * 
 * }
 */

public class TestDemo {

	public static void main(String[] args) {
		

		I1 i1= new I1(){

			@Override
			public void add(int x, int y) {
				System.out.println(x+y);
				
			}
			
		};
		
		i1.add(12, 10);

	}

}
