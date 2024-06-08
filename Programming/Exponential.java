package edu.jsp.Programming;

import java.util.Scanner;

public class Exponential {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base value : ");
		int base = sc.nextInt();
		System.out.print("Enter the power value : ");
		int power = sc.nextInt();
		int expo = 1;
		
		for(int i=1;i<=power;i++) {
			expo = expo * base;
		}
		System.out.println(expo);
	}
}
