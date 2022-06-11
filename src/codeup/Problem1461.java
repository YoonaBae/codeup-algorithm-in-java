package codeup;

import java.util.Scanner;

public class Problem1461 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int x = 1;
		//0~4
		for (int i = 0; i < n; i++) {
			for(int j=0; j < n; j++) {
				arr[i][j] = x++;
			}			
		}
		for (int i= n-1; i >= 0; i--) {
			for(int j=n-1; j>=0; j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
