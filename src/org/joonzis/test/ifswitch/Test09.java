package org.joonzis.test.ifswitch;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
//		Test09.java (switch문)
//		Q. 월을 입력 받아 일을 출력하기
//			실행 예)
//			월 입력 >> 10
//			출력 : 10월은 31일 까지 있습니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("월 입력 >> ");
		int month = sc.nextInt();
		
		switch(month) {
			case 2 : System.out.println(month + "월은 28일 까지 있습니다.");	
				break;
			case 4 : 
			case 6 : 
			case 9 : 
			case 11 : System.out.println(month + "월은 30일 까지 있습니다.");
				break;
			case 1 : 
			case 3 : 
			case 5 :
			case 7 : 
			case 8 : 
			case 10 :
			case 12 : System.out.println(month + "월은 31일 까지 있습니다.");
				break;
				
		}
		
		
	}
}
