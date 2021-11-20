package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
	//16.아래와 설명에 맞는 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int input = sc.nextInt();
		
		int quo = input/5;
		System.out.println("5의배수의 개수: "+quo);
		
		int sum = 0;
		
		for(int i = 1; i<=input; i++) {
			if(5*i<=input) {
				sum = sum+5*i;
			}
		}
		System.out.println("5의배수의 합: "+sum);

		sc.close();
		
	}

}
