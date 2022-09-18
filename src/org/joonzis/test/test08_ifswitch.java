package org.joonzis.test;

import java.util.Scanner;

public class test08_ifswitch {

	public static void main(String[] args) {
		

//		Test08.java (switch문)
//		Q. 권한을 출력하기
//			3 수준 : 실행, 쓰기, 읽기 / 2수준 : 쓰기, 읽기 / 1수준 : 읽기
//			실행 예)
//			수준입력 >> 3
//			출력 : 실행, 쓰기, 읽기
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수준 입력 >> ");
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println("읽기");
		}
		
		if(num == 2) {
			System.out.println("쓰기, 읽기");
		}
		
		if(num == 3) {
			System.out.println("실행, 쓰기, 읽기");
		}
		
		
		
//		2)
//		if(num == 1) {
//			System.out.println("읽기");
//		}else if(num == 2) {
//			System.out.println("쓰기, 읽기");
//		}else if(num == 3) {
//			System.out.println("실행, 쓰기, 읽기");
//		}
		
		
		
//		3)
//		switch (num) {
//		case 1:System.out.println("읽기");
//			break;
//		case 2:System.out.println("쓰기, 읽기");
//			break;
//		case 3:System.out.println("실행, 쓰기, 읽기");
//			break;
//		}
		
		
//		4)
//		switch (num) {
//		case 3:System.out.print("실행, ");
//		case 2:System.out.print("쓰기, ");
//		case 1:System.out.print("읽기");
//			break;
//		}



		
		
		
		
		sc.close();
		
	}

}
