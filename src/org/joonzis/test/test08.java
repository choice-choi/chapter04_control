package org.joonzis.test;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
//		Test08.java
//		Q.Up-Down 게임
//			1 ~ 100 사이에서 임의의 숫자를 하나 결정한 뒤
//			해당 숫자를 맞추는 게임
//			입력 받은 숫자의 크기에 따라 "Up!", "Down!", "Answer!" 로 나눠서 출력하고
//			맞출때까지 몇 번 진행했는지 횟수도 함께 출력
//			실행 예)
//			입력 >> 30
//			Up!
//			입력 >> 40
//			Down!
//			입력 >> 35
//			Down!
//			입력 >> 33
//			Answer!
//			총 4회만에 성공!  	-------count사용하여 출력
		Scanner sc = new Scanner(System.in);//입력받아야함으로 스캐너 필요
		
		int ans = 72;	//정답
		int count = 0;	//횟수
		int num = 0;	//입력 값
		
		
		while(true) {
			System.out.print("1~100 사이의 숫자 입력 >> ");
			num = sc.nextInt();//80입력할경우 down나와야하는 출력으로 만들 예정
			count++;
			
			if(num > ans) {
				System.out.println("Down!!");
			}else if(num < ans) {
				System.out.println("Up!!");
			}else {
				System.out.println("Answer!!");
				System.out.println(count + "회 만에 성공!");
				break;
			}
			
		}
		
		
		
		
		
		
		
	}

}
