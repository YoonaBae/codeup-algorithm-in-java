package codeup;

import java.util.Scanner;

public class Problem1168 {

	public static void main(String[] args) {
		//출생년도 나이 계산하기
		Scanner sc = new Scanner(System.in);
		int birth = sc.nextInt();
		int gender = sc.nextInt();
		
		birth = birth/10000;
		
			if (gender == 1 || gender == 2 ) {
				System.out.println(2012 - (birth + 1900) + 1);
			} else if (gender == 3 || gender == 4) {
				System.out.println(2012 - (birth + 2000) + 1);
			}
	}

}
