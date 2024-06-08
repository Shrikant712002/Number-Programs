package edu.jsp.Programming;

public class AmstrongNumber {
	public static void main(String[] args) {
		int num=1634,temp=num,sum=0;
		int digits =count(num);
		while(temp!=0) {
			int last = temp%10;
			sum = sum + expo(last, digits);
			temp = temp/10;
		}
		if(num==sum) {
			System.out.println(num+" is an armstrong number");
		}
		else {
			System.out.println(num+ " is not an armstrong number");
		}
		
	}
	public static int expo(int base,int power) {
		int prod = 1;
		for(int i=1;i<=power;i++) {
			prod = prod *base;
		}
		return prod;
	}
	public static int count(int num) {
		int temp2=num;
		int count=0;
		while(temp2!=0){
			count++;
			temp2=temp2/10;
		}
		return count;
	}
}
