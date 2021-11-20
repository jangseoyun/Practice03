package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
	//20. 아래와 설명에 맞는 프로그램을 작성 
		Scanner sc = new Scanner(System.in);
		
		//----------랜덤 숫자------------//
		int sample = ((int)(Math.random()*100)+1);
		System.out.println(sample);
		//----------랜덤 숫자------------//
		
		System.out.println("===========================");
		System.out.println("     [숫자맞추기 게임 시작]");
		System.out.println("===========================");
		
		boolean finish = true;

		while(finish) {
			
			System.out.print(">>");
			int input = sc.nextInt();
			
			if(sample != input) {
				if(sample>input) {
					System.out.println("더 높게");
				}else if(sample<input) {
					System.out.println("더 낮게");
				}
			}else {
				char y = 'y';
				System.out.println("맞았습니다.");
				System.out.print("게임을 종료하시겠습니까?(y/n) >>");
				char inputy = sc.next().charAt(0);

				if(inputy == y) {
					
					System.out.println("===========================");
					System.out.println("     [숫자맞추기게임 종료]");
					System.out.println("===========================");
					
					break;
					
				}else {
					continue;
				}
			}

		}
		

		sc.close();
	}

}
