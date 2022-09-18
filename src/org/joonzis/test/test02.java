package org.joonzis.test;

public class test02 {

	public static void main(String[] args) {
//		Test02.java
//		Q. 입력받은 구구단만 출력하기
//		ex) 4X1=4
//			4X2=8
//			4X3=12
//			4X4=16
//			...


		
//		int num = 1;
//		num++;
//		System.out.println(num<10);
//		
//				While(num < 10) {
//					System.out.println(4 * num);
//					num++;
//				}
		int dan = 4;  
		
		for(int num = 1; num < 10; num++) {
			System.out.println( dan + "X" + num + "=" + (dan * num));
		}
				
				//1씩 증가 : num++; / num=num+1; / num+=1;
				//2씩 증가 : num=num+2; / num+=2;
				

		
				
//				int num = 0; //초기화
//				// while을 이용하여 정수 0~9까지 총 10회 반복하여 출력하기
//				while(num <= 9) {
//					System.out.println(num);
//					num++; //num=num+1;
//				}

				
//				// 1. 1~10 출력(while) (3의 배수는 제외) / 3으로 나누어 떨어지는 값은 3의 배수에 해당
//				int num = 0;
//				while(num<10) {
//					num++;
//					
//					
//					if(num % 3 != 0) {
//					System.out.println(num);
//				}
				
	}

}
