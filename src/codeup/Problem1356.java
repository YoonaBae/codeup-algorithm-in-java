package codeup;

import java.util.Scanner;

public class Problem1356 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 1 || i == n || j == 1 || j == n) {
				 System.out.print("*");
			}	else {
				System.out.println(" ");
			}
			System.out.println();
		}
	}	
  }

}
