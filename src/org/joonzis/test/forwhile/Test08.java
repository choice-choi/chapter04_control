package org.joonzis.test.forwhile;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int count = 0;	// 횟수
		int ans = 17;	// 정답
		int num=0;

		while(true) {
			System.out.print("1~100 사이의 숫자 입력 >> ");
			num = sc.nextInt();	// 숫자 입력
			count++;	// 횟수 증가
			
			if(num > ans) {
				System.out.println("Down!");
			}else if(num < ans) {
				System.out.println("Up!");
			}else {
				System.out.println("Answer!");
				System.out.println("총 "+ count+"회 만에 성공!");
				break;
			}
		}
		
		
		
		
		
		sc.close();
	}
}
