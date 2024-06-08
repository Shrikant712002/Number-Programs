package edu.jsp.Programming;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		int temp = num;
		int count =0;
		while(temp!=0) {
			count++;
			temp=temp/10;
		}
		System.out.println(num+" has "+count+" digits");
	}
}
