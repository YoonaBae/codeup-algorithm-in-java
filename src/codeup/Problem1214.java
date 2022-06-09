package codeup;

import java.util.Scanner;

public class Problem1214 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		
		if (month == 2) {
			  if ((year%4 == 0 && year%100 != 0) || year%400 == 0)
			System.out.println("29");
		      else 
			System.out.println("28");
		
		} else if (month <= 7 && month%2 !=0) 
			System.out.println("31");
		  else if (month >= 8 && month%2 == 0)
			System.out.println("31");
		  else 
			  System.out.println("30");
	}

}
