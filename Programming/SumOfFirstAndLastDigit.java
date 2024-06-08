package edu.jsp.Programming;

public class SumOfFirstAndLastDigit {
	public static void main(String[] args) {
		int num = 823456;
		int temp = num;
		int last = temp%10;
		while(temp>9) {
			temp=temp/10;
		}
		int sum = last+temp;
		System.out.println(sum);
	}
}
