package edu.jsp.Programming;

import java.util.Scanner;

public class FormatOfCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character : ");
		char ch = sc.next().charAt(0);
		if(ch>='0' && ch<='9') {
			System.out.println(ch+" is a number");
		}
		else if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')) {
			System.out.println(ch+" is an alphabet");
		}
		else {
			System.out.println(ch+" is a special character");
		}
	}
}
