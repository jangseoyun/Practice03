package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
	//11. 다음과 같은 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int input = sc.nextInt();
		int sum2 = 0;
		int sum1 = 0;
		
		if(input%2==0) {//짝수
			for(int i = 1; i<=input; i++) { //받은 수까지 돌리기
				if(i%2==0) {
					sum2 = sum2 + i;
				}
			}
			System.out.println("결과값: "+sum2);
		}else {
			for(int i = 1; i<=input; i++) {
				if(i%2!=0) {
					sum1 = sum1 + i;
				}
			}
			System.out.println("결과값: "+sum1);
		}
		
		sc.close();
	}

}
