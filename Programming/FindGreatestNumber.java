package edu.jsp.Programming;

public class FindGreatestNumber {
	public static void main(String[] args) {
		int a=10456,b=6,c=4510,d=78785;
		if(a>b && a>c && a>d) {
			System.out.println("a is greatest");
		}
		else if(b>c && b>d) {
			System.out.println("b is greatest");
		}
		else if(c>d) {
			System.out.println("c is greatest");
		}
		else {
			System.out.println("d is greatest");
		}
	}
}
