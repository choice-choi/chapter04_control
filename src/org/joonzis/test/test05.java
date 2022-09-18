package org.joonzis.test;

public class test05 {

	public static void main(String[] args) {
//		Test05.java
//		Q. 1 ~ 100 사이의 모든 정수 합계 출력하기 


		int sum = 0;	// 누적 데이터 저장 변수
		for(int i=1; i<=100; i++) {
			sum = sum + i;	//누적 방법 1
//			sum += i;		//누적 방법 2
		}
		
		System.out.println(sum);
		
		
		
//		오답
//		int i = 1;
//
//		if(i < 101) {
//			for(int i=0 ; i < n ; i++ ) {	// 변수를 for문 안에서 선언&초기화 해도 된다.
//				sum = sum + i;	// sum에 i를 더한다. sum += i
//			System.out.println(n+(n+1)+(n+2)+```+(n+(n+1));
//			}
//		}
		

		
////		2) 답
//		int total = 0;	// 누적 데이터 저장 변수
//		int start = 1;
//		int end = 100;
//		
//		
//		for(int i=start; i<=end; i++) {
//			sum = sum + i;	//누적 방법 1
////			sum += i;		//누적 방법 2
//		}
//		
//		System.out.println(sum);
		
		
		
		// 1부터 100사이의 모든 정수 중 "짝수"의 합과 "홀수"의 합을 각각 구하여 출력하시오
		int sumOdd = 0;		// 홀수 합 변수
		int sumEven = 0; 	// 짝수 합 변수
		
		for(int j=0; j<=100; j++) {
//			sum = sum + j;
//		}if(sumOdd % 3 == 0) {
//			System.out.println(sumOdd);
//		}else(sumEven % 2 == 0) {
//			System.out.println(sumEven);
//		}

		if(j%2==0) {
			//짝수
			sumEven = sumEven + j;
		}else {
			//홀수
			sumOdd = sumOdd + j;
		}
		System.out.println("1~100 사이의 정수 중 짝수의 합은 = " + sumEven );
		System.out.println("1~100 사이의 정수 중 홀수의 합은 = " + sumOdd);
		}	
			
		
		
	}

}
