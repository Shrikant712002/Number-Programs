package edu.jsp.Programming;

public class PerfectNumber {
	public static void main(String[] args) {
		int sum = 0;
		int num = 10;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		if(sum==num) {
			System.out.println(num+" is perfect number");
		}
		else {
			System.out.println(num+" is not perfect number");
		}
	}
}
