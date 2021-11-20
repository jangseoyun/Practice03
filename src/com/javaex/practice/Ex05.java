package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
	//05. 아래의 출력결과를 예상하여 작성하세요
	/* 세로로 1 2 3 4 5 
	 	boolean으로 break;역할을 할 수 있는데 차이가 있다.
	 	break;를 사용할 경우 : 반복문 자체를 종료.
	 	boolean으로 false를 통해 종료할 경우 if문 밖으로 나가서
	 	이후 코드 i=i+1;을 읽는다. 따라서 i가 5가될 때까지 반복문이 돌아감 
	*/	
		int i = 1;
		boolean flag = true;
		
		while(flag) {
			if(i>=5) {
				flag = false;  // >> 종료 break;와 같음
			}
		
			System.out.println(i);
			i=i+1; //i++
		}
	}
	

}
