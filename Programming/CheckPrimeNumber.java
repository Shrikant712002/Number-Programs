package edu.jsp.Programming;

import java.util.Scanner;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = sc.nextInt();
		//isPrime(num);
		boolean prime = true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is not prime number");
		}
	}
	public static void isPrime(int num) {
		int count = 0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num + " is not a prime number");
		}
		
	}
}
