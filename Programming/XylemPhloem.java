package edu.jsp.Programming;

public class XylemPhloem {
	public static void main(String[] args) {
		int num = 65212;
		int temp = num;
		int mid = 0;
		int last = temp%10;
		temp = temp/10;
		
		while(temp>9) {
			int last1 = temp%10;
			mid = mid+last;
			temp = temp/10;
		}
		int sum = last+temp;
		if(sum==mid) {
			System.out.println("Xylem");
		}
		else {
			System.out.println("Phloem");
		}
		
	}
}
