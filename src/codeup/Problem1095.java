package codeup;

import java.util.Scanner;

public class Problem1095 {
	//최소값 구하기!
	public static void main(String[] args) {
		//k개의 배열 생성
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int [] arr = new int[k];
		 
		
		//입력값 k의 수들 배열 인덱스에 넣어주기
		for(int i=0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); 
		}
		int min = arr[0]; // 최소값 담아 줄 변수
		//최소값 구해주기
		for(int i= 0; i < k; i++) {	
			if (min >= arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
		

	}

}
