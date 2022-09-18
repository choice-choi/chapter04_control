package org.joonzis.test.forwhile;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
//		Q.두 정수를 입력 받아 두 정수 사이의 모든 정수의 합계 출력하기
//	    입력 순서와 무관하게 동일한 결과를 출력 
//	 	실행 예1)
//		첫 번째 정수 >> 1
//		두 번째 정수 >> 10
//		1부터 10까지 모든 정수의 합은 55입니다.
//		실행 예2)
//		첫 번째 정수 >> 10
//		두 번째 정수 >> 1
//		1부터 10까지 모든 정수의 합은 55입니다.
		
		// 값 2개 입력 받고, 첫 번째 받은 값이 두 번째 값보다 크면 둘이 값 교환
		
		Scanner sc = new Scanner(System.in);
		
		int start;	// 시작 값
		int end;	// 종료 값
		int sum=0;	// 총 합
		int temp;	// 임시 변수
		
		// 1. 입력
		System.out.println("첫 번째 정수 입력 >> ");
		start = sc.nextInt();
		System.out.println("두 번째 정수 입력 >> ");
		end = sc.nextInt();
		
		// 2. start와 end 크기 비교
		// 항상 start <= end 
		// start > end 상황일 때 두 변수의 값을 교환
		if(start>end) {
			temp = start;
			start = end;
			end = temp;
		}
		
		for(int i=start; i<=end; i++) {
			sum += i;
		}
		
		System.out.println(start + "~" + end + "까지의 합 : " + sum);
		
		
		sc.close();
		
	}
}
