package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
	//08. 	 아래와 같이 구구단을 출력하세요
		
		for(int dan = 1; dan<=9; dan++) {
			for(int s = 2; s<=9; s++) {
				System.out.print(s+"*"+dan+"="+dan*s+"\t");
			}
			
			System.out.println();
		}

	}

}
