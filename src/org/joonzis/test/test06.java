package org.joonzis.test;

import java.util.Scanner;

public class test06 {

	public static void main(String[] args) {
//		Test06.java
//		Q. 1부터 입력 받은 양수 사이의 모든 정수의 합계 출력하기
//		      입력 받은 수가 2이상이 아니면 다시 입력 받도록 처리 

		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int selNum = 0;
		
		while(true) {
			System.out.println("2이상의 정수를 입력하세요 >> ");
			selNum = sc.nextInt();
					
			if(selNum >= 2) {
				break;
			}
		}
		System.out.println(selNum);
		
		
		do {
			System.out.println("2이상의 정수를 입력하세요 >> ");
			selNum = sc.nextInt();
			System.out.println(selNum);
		}while(selNum < 2);
		
		for(int i=1; i<=selNum; i++) {
			sum = sum + i;
		}
		System.out.println("1부터 " + selNum + "까지의 합은 : " + sum);
	}
}
