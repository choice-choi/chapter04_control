package org.joonzis.test.forwhile;

import java.util.Scanner;

public class Test08_1 {
	public static void main(String[] args) {
		/*
		Test08.java
		Q.Up-Down 게임
			1 ~ 100 사이에서 임의의 숫자를 하나 결정한 뒤
			해당 숫자를 맞추는 게임
			입력 받은 숫자의 크기에 따라 "Up!", "Down!", "Answer!" 로 나눠서 출력하고
			맞출때까지 몇 번 진행했는지 횟수도 함께 출력
			실행 예)
			입력 >> 30
			Up!
			입력 >> 40
			Down!
			입력 >> 35
			Down!
			입력 >> 33
			Answer!
			총 4회만에 성공! -------count사용하여 출력
			*/
		
		int ans = 40;
		int count = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1 ~ 100 사이 숫자 입력 >> ");
			num = sc.nextInt();
			count++;
			
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
