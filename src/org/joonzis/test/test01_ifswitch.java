package org.joonzis.test;

import java.util.Scanner;

public class test01_ifswitch {

	public static void main(String[] args) {
//		Test01.java
//		Q. 정수를 입력 받아 "짝수", "홀수" 구분해서 출력하기
//		   3의 배수는 "3의 배수"로 출력하기

		// 1. 1~10 출력(while) (3의 배수는 제외) / 3으로 나누어 떨어지는 값은 3의 배수에 해당
//				int num = 0;
//				while(num<10) {
//					num++;
//					
//					
//					if(num % 3 != 0) {
//					System.out.println(num);
//				}
//					
//					// 2. 1~10 출력(for) (홀수만 출력)
//					// 1)
//					for(int i = 0; i<10; i++) {
//						if(i%2=0) {
//							continue;
//						}
//					}	System.out.println(i+1);
				
			
//			int num = 0;
//			num++;
//			System.out.println("정수 입력 >> "); //ln 안해도 됨
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 >> ");
		int num = sc.nextInt();
		
		
		
			// 1)
			if(num % 2 == 0) {
				System.out.println("짝수");
			}else if (num % 2 == 1) {
				System.out.println("홀수");
			}else {
				System.out.println("3의 배수");
			}
				
		
			// 2)
			if(num % 3 == 0 && num % 2 == 0) {
				System.out.println("3의 배수이면서 짝수");
			}else if(num % 3 == 0 && num % 2 == 1) {
				System.out.println("3의 배수이면서 홀수");
			}else if(num % 3 == 0 && num % 2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
			
	
		sc.close();
			
	}

}
