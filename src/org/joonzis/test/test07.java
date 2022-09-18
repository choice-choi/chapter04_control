package org.joonzis.test;

import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
//		Test07.java
//		Q.두 정수를 입력 받아 두 정수 사이의 모든 정수의 합계 출력하기
//		    입력 순서와 무관하게 동일한 결과를 출력 
//		 	실행 예1) //++ 사용한 폼
//			첫 번째 정수 >> 1
//			두 번째 정수 >> 10
//			1부터 10까지 모든 정수의 합은 55입니다.
//			실행 예2) // -- 사용한 폼
//			첫 번째 정수 >> 10
//			두 번째 정수 >> 1
//			1부터 10까지 모든 정수의 합은 55입니다. 

		//
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수 >> ");
		int num1 = sc.nextInt();		//1
		
		System.out.println("두 번째 정수 >> ");
		int num2 = sc.nextInt();		//10
		
		//시작 < 끝 = 증가
		//시작 > 끝 = 감소
		
		
		int total = 0;
		
		
		if(num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		
		
		
		
		
		//작은 값에서 큰 값까지
		for(int i=num1; i<=num2; i++) {
			total = total + i;
		}
		
		System.out.println(num1 + "~" + num2 + "까지의 합 = " + total);
		
		
		
		
		
		
		
	}

}
