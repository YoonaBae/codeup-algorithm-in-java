package codeup;

import java.util.Scanner;

public class Problem1095B {
	//1095A는 최소값 구하는 방법으로 했다면 이번엔 메모 형식으로 break를 사용해서 코드 짜보자~
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] memo = new int [24];
		
		for(int i = 1; i < n; i++) {
			int x = sc.nextInt();
			memo[x] = 1; 
		}
		for(int i =1; i < memo.length; i++)
			if(memo[i]==1) {
				System.out.println(i);
				break;
			}
		

	}

}
