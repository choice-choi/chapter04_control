package org.joonzis.test;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
//		Test06.java
//		Q. 1부터 입력 받은 양수 사이의 모든 정수의 합계 출력하기
//		      입력 받은 수가 2이상이 아니면 다시 입력 받도록 처리 

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int total = 0;
		
		while(true) {
			System.out.println("2이상의 정수를 입력하세요 >> ");
			int num1 = sc.nextInt();
					
			if(num1 < 2) {
				System.out.println("***다시 입력하세요***");
				continue;
			}

			total = total + num1;
			
			System.out.println("현재 합계 : " + total);
			
		}
		
		
		
	}

}