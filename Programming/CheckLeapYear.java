package edu.jsp.Programming;

public class CheckLeapYear {
	public static void main(String[] args) {
		int year = 1600;
		if((year%4==0 && year%100!=0) || (year%400==0)){
			System.out.println(year+" is a leap year");
		}
		else {
			System.out.println(year+" is not leap year");
		}
	}
}
