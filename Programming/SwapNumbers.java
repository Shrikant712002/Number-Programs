package edu.jsp.Programming;

public class SwapNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		int c = 10;
		int d = 20;
		c = c + d;
		d = c - d;
		c = c - d;
		System.out.println("c : "+ c);
		System.out.println("d : "+ d);
	}
}
