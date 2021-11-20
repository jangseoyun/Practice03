package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
//모르겠음
	public static void main(String[] args) {
	// 14. 13번 문제에 아래와 같이 계산식이 표시되도록 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int input = sc.nextInt();
		int i = 1;
		int sum = 0;
		
		boolean flog = true;
		
		while(flog) {
				
			if(i<=input) {
				
				System.out.print("+"+i);
				sum = sum+i++;
				
			}else {
				System.out.println();
				System.out.println("합계: "+sum);
				flog = false;
			}
			
		}
		
		sc.close();
		
	}

}
