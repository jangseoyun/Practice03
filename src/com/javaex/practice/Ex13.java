package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
	//13. 아래와 설명에 맞는 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int input = sc.nextInt();
		
		int sum = 0;
		int i = 1;
		boolean flog = true;
		
		while(flog) {
			
			if(i<=input) {
				sum = sum+i++;
			}else {
				System.out.print("합계: "+sum);
				flog = false;
			}
			
		}

		
		sc.close();

	}

}
