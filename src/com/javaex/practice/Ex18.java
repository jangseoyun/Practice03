package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
	//18. 숫자 하나를 입력받아 아래와 같이 *가 출력되도록 프로그램 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int input = sc.nextInt();
		
		for(int y = 1; y<=input; y++) {
			for(int x = input+1; x>y; x--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int y2 = 1; y2<=input; y2++) {
			for(int x2 = 0; x2<y2; x2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		sc.close();

	}

}
