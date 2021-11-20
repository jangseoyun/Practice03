package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
	//19. 아래와 같이 은행 프로그램을 작성하세요
		
		Scanner sc = new Scanner(System.in);
		
			int deposit = 0;
		
			while(true) {
				System.out.println("-----------------------------");
				System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
				System.out.println("-----------------------------");
				
				System.out.print("선택>");
				int num = sc.nextInt();
				
				if(num == 1) {
					
					System.out.print("예금액>");
					int input1 = sc.nextInt();
					deposit = deposit+input1;
					
				}else if(num == 2) {
					
					System.out.print("출금액>");
					int input2 = sc.nextInt();
					deposit = deposit-input2;
					
				}else if(num == 3) {
					
					System.out.println("잔고액>"+deposit);
					
				}else if(num == 4){
					
					System.out.print("프로그램 종료");
					break;
					
				}else {
					
					System.out.println("다시입력해주세요");
					
				}
				
				System.out.println();
				
				
				
				
				
				
				
			}
		
		
		
			
		sc.close();

	}

}
