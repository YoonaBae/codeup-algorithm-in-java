package codeup;

import java.util.Scanner;

public class Problem1212 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
//		if (a < (c+b) && b < (a+c) && c < (a+b)) {
//			System.out.println("yes");
//		} else {
//			System.out.println("no");
//		}
		if (c > a && c> b)
		{
			if(a+b > c) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}	
		else if (b > a && b > c) {
			if(a+c > b) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		} 
		else 
		{
			if(c+b > a) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
		
	}	

}
