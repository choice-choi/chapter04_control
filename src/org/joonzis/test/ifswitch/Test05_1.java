package org.joonzis.test.ifswitch;

import java.util.Scanner;

public class Test05_1 {
	public static void main(String[] args) {
//		Test05.java
//		Q. 문자를 하나 입력 받아 "대문자", "소문자", "아라비아 숫자", "일반 문자" 구분해서 출력하기
//		     아스키 코드표 참고
		
		// 문자를 입력할 때
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자입력>>");
		
		char ch = sc.next().charAt(0); 
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자");
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println("소문자");
		}else if(ch >= '0' && ch <= '9') {
			System.out.println("아라비아 숫자");
		}else {
			System.out.println("일반 문자");
		}
		
		sc.close();
	}
}
