package org.joonzis.test.ifswitch;

import java.util.Scanner;

public class Test02_1 {
	public static void main(String[] args) {
//		Test02.java
//		Q. 필기와 실기 점수를 입력 받아 합격 유무 출력하기
//			합격기준: 필기와 실기 점수 모두 70점 이상이거나, 평균이 80 이상시 "합격" 아니면 "불합격"
		
		Scanner sc = new Scanner(System.in);

		System.out.println("필기 점수 입력 >>");
		int a = sc.nextInt();
		
		System.out.println("실기 점수 입력 >>");
		int b = sc.nextInt();
		
		double avg = (a+b) / 2.0;
		
		if((a >= 70 && b >=70) || avg >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		sc.close();
	}
}
