package edu.jsp.Programming;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 159753654;
		int temp = num;
		int rev = 0;
		while(temp!=0) {
			int last = temp%10;
			rev = rev*10+last;
			temp = temp/10;
		}
		System.out.println(rev);
	}
}
