package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
	//01. 아래의 출력결과를 예상하여 작성하세요.
		
		int index = 0;
		while(index<3) {
			System.out.println("index=" + index); //index=0 index=1 index=2 
			index++;
		}
		
		System.out.println("for문");
		for(int order=0; order<3; order++) { 
			System.out.println("order="+order); //order=0 order=1 order=2 while문과 동일
		}
	}

}
