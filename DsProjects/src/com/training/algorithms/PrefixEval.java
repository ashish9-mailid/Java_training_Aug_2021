package com.training.algorithms;

import com.training.arrays.MyStack;

public class PrefixEval {

	public static void main(String[] args) {
		String expn = "*8-84";
		
		String revExpn = reverse(expn); // 54*3+
		System.out.println(revExpn);
		
		// Stack
		MyStack<Integer> expnStack = new MyStack<>();
		expnStack.push(999);
		
		for(int i=0;i<revExpn.length();i++)
		{
			char ch = revExpn.charAt(i);
			//if(ch>='0' && ch <='9')
			if(Character.isDigit(ch))
				expnStack.push((int)(ch-'0'));
			else
			{
			int ch1=(int) expnStack.pop(); 
			//System.out.println(ch1);
			int ch2=(int) expnStack.pop();
			//System.out.println(ch2);
			int result = eval(ch1,ch2,ch);
			expnStack.push(result);
			}
			
		}
		System.out.println(expnStack.pop());

	}

	private static int eval(int ch1, int ch2, char ch) { // 4 - '0'   5
			
		switch(ch)
		{
		case '+':	return ch1+ch2;
		case '-':	return ch1-ch2;
		case '*':	return ch1*ch2;
		case '/':	return ch1/ch2;
					
		}
		return 0;
		
	}

	private static String reverse(String expn) {
		/*
		 * String rev=""; for(int i=expn.length()-1;i>=0;i--) rev+=expn.charAt(i);
		 */
		
		StringBuilder sb = new StringBuilder(expn);
		return sb.reverse().toString();
	}

}
