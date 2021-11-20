package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
	//15. 아래와 설명에 맞는 프로그램을 작성하세요

		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int input = sc.nextInt();
		
		for(int i = 1; i<=input; i++ ) {
			if(input%i==0) {
				System.out.println(i);
			}
		}
		 
		sc.close();
		
		
		
	}

}
