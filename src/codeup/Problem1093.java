package codeup;

import java.util.Scanner;

public class Problem1093 {
	/* 1.무작위로 번호 지정해서 부르기.
	 * 2.학생들 번호는 1~23...
	 * 3.불린 번호를 다른 변수에 저장하면 될듯...?
	 * */
	public static void main(String[] args) {
		int[]std = new int[24]; // 1~24의 배열 변수가 필요 0필요없음
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 예)10

		for(int i = 1; i <= n; i++) {//   인덱스0 1 2 3 4 5 6 7 8 9 10
			int x =sc.nextInt(); // 입력된 n 들 예)1 3 2 2 5 6 7 4 5 9 
			std[x] +=1 ;         //              1 2 1 1 
		}
		
		for(int i = 1; i < std.length; i++) {
			System.out.println(std[i]);
		}
 	}

}
