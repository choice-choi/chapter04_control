package org.joonzis.test.forwhile;

import java.util.Scanner;

public class Test06_1 {
	public static void main(String[] args) {
//		Test06.java
//		Q. 1부터 입력 받은 양수 사이의 모든 정수의 합계 출력하기
//		      입력 받은 수가 2이상이 아니면 다시 입력 받도록 처리
		
		Scanner sc = new Scanner(System.in);
		
		int selNum = 0;
		int sum = 0;
		
		// 방법 1) 
		System.out.println("2이상 정수 입력 >>");
		selNum = sc.nextInt();
		
		while(selNum < 2) {		//2이상이 아니어서 다시 입력 받는 코드
			System.out.println("2이상으로 다시 입력하시오");
			selNum = sc.nextInt();
		}
		
		for(int i=1; i<=selNum; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 " + selNum + "까지의 합은 : " + sum);
		
		System.out.println("----------------------");
		
		// 방법 2)
		int selNum1 = 0;
		int sum1 = 0;
		
		while(true) {
			System.out.println("2이상 정수 입력 >>");
			selNum1 = sc.nextInt();
			if(selNum1 >= 2) {
				break;
			}
		}
		
		
		for(int i=1; i<=selNum; i++) {
			sum1 = sum1 + i;
		}
		System.out.println("1부터 " + selNum1 + "까지의 합은 : " + sum1);
		
		System.out.println("----------------------");
		
		// 방법 3) -- do-while 사용
		int selNum2 = 0;
		int sum2 = 0;
		
		do {
			System.out.println("2 이상의 정수 입력 >> ");
			selNum2 = sc.nextInt();
		}while(selNum2 < 2);
		
		
		for(int i=1; i<=selNum2; i++) {
			sum2 += i;
		}
		
		System.out.println("1부터 " + selNum2 + "까지의 합은 : " + sum2);
		
		
		sc.close();
	}
}
