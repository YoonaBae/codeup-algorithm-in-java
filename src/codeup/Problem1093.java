package codeup;

import java.util.Scanner;

public class Problem1093 {
	/* 1.무작위로 번호 지정해서 부르기.
	 * 2.학생들 번호는 1~23...
	 * 3.여러 번 불린 번호를 다른 배열변수에 저장하면 될듯...?
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] std = new int [24];
		int [] sum = new int [24];
		
		for(int i = 1; i <= n; i++) {
			std[i] = sc.nextInt(); 
		}
		for(int i = 1; i <= n; i++) {
			sum[std[i]] ++;			
		}
		for(int i = 1; i <= std.length-1;i++) {
			System.out.println(i+"의 개수 =" +sum[i]);
		}
	}

}
