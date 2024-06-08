package edu.jsp.Programming;

import java.util.Scanner;

public class FactorialOfGivenNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number : ");
		int num = sc.nextInt();
		int fact = 1;
		for(int i=num;i>=1;i--) {
			fact *=i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
	}
}
