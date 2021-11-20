package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
	// 12. 팩토리얼은 다음과 같이 정의된다. 숫자를 1개 입력받아 팩토리얼 값을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int input = sc.nextInt();
		int mul = 1;
		int i = 1;
		boolean flog = true;
		
		while(flog) {
			
			if(i<=input) {
				mul = mul*i++;
			}else {
				System.out.print("결과값: "+mul);
				flog = false;
			}
			
		}
		
		sc.close();

	}

}
