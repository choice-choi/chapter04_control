package org.joonzis.test.ifswitch;

import java.util.Scanner;

public class Test10_1_re {
	public static void main(String[] args) {
//		Test10.java (switch문)
//		Q. Test04.java 을 switch 문으로 다시풀기
//			점수를 입력 받아 학점 출력하기
//		   100 ~ 97점 : A+ / 96 ~ 94점 : A0 / 93 ~ 90점 : A- 
//		    89 ~ 87점 : B+ / 86 ~ 84점 : B0 / 83 ~ 80점 : B-
//		    79 ~ 77점 : C+ / 76 ~ 74점 : C0 / 73 ~ 70점 : C- / 69 ~ 0점 : F
		
		Scanner sc = new Scanner(System.in);

		System.out.println("점수 입력 >> ");
		
		int score = sc.nextInt();
		
		
		
		sc.close();
	}
}
