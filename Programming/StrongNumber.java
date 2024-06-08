package edu.jsp.Programming;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		while(temp!=0) {
			int last = temp%10;
			sum+=factorial(last);
			temp=temp/10;
		}
		if(num==sum) {
			System.out.println(num+" is a strong number");
		}
		else {
			System.out.println(num+" is not a strong number");
		}
	}
	public static int factorial(int num) {
		int fact = 1;
		for(int i=num;i>=1;i--) {
			fact*=i;
		}
		return fact;
	}
}
