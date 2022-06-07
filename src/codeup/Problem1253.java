package codeup;

import java.util.Scanner;

public class Problem1253 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
			
			if (a <= b) {
				for (int i = a; i <= b; ++i) {
					System.out.println(i);
				}
			
			} else if (a >= b) {
				for (int j = b; j <= a; ++j) {
					System.out.println(j);
				}
				
			}
			

	}

}
