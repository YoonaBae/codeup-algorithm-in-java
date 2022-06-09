package codeup;

import java.util.Scanner;

public class Problem1094 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int [n];
		//1.입력받기
		for (int i = 0; arr.length > i; i++) {
			arr[i] = sc.nextInt();
		}
		//2.거꾸로 출력
		for (int i = n-1; i >= 0; i--) {
			System.out.print(arr[i]+" ");
		}	
	}
}
