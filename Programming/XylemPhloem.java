package edu.jsp.random;

import java.util.Scanner;

public class XylemPhloem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");//65212
		int num = sc.nextInt();
		int temp = num;
		int fl = temp%10;
		int mid = 0;
		temp/=10;
		while(temp>9) {
			int last = temp%10;
			mid = mid+last;
			temp/=10;
		}
		fl+=temp;
		if(fl==mid) {
			System.out.println("num is xylem...");
		}
		else {
			System.out.println("num is phloem...");
		}
	}
}
