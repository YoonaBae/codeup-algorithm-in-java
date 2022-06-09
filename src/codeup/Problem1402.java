package codeup;

import java.util.Scanner;

public class Problem1402 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//배열 n개 입력 받기
		int n = sc.nextInt();
		int[] arr = new int[n];
		//배열에 n의 숫자들 넣기
		for (int i =0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		//거꾸로 출력
		for (int i = n-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
