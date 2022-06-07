package codeup;

import java.util.Scanner;

public class Problem1169 {

	public static void main(String[] args) {
		/* 나이 계산
		 * 2012 - 18 + 1
		 * */
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		age = 2012 - age + 1;

		
		if (age < 2000) {
			age -= 1900;
			System.out.println(age+" 1");
		} else {
			age -= 2000;
			System.out.println(age+" 3");
		}
	}

}
