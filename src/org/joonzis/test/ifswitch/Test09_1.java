package org.joonzis.test.ifswitch;

import java.util.Scanner;

public class Test09_1 {
	public static void main(String[] args) {
//		Test09.java (switch문)
//		Q. 월을 입력 받아 일을 출력하기
//			실행 예)
//			월 입력 >> 10
//			출력 : 10월은 31일 까지 있습니다.
		//- case 끝에 있는 break는 다음 case를 실행하지 않고 switch문을 빠져나가기 위해 필요하다.
		
		Scanner sc = new Scanner(System.in);
		
		int month = 0;
		System.out.println("월 입력 >> ");
		month = sc.nextInt();
		
		switch(month) {
		case 2: 
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
		case 1 : 
		case 3 : 
		case 5 :
		case 7 : 
		case 8 : 
		case 10 :
		case 12 : 
			System.out.println(month + "월은 31일 까지 있습니다.");
			break;
		}
		
		
	}
}
