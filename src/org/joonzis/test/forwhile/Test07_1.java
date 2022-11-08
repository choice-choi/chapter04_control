package org.joonzis.test.forwhile;

import java.util.Scanner;

public class Test07_1 {
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
		
		int start = 0;
		int end = 0;
		int sum = 0;
		
		System.out.println("첫 번째 정수 입력 >> ");
		start = sc.nextInt();
		System.out.println("두 번째 정수 입력 >> ");
		end = sc.nextInt();
		
		if(start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		
		for(int i=start; i<=end; i++) {
			sum = sum+i;
		}
		
		System.out.println(start + "~" + end + "까지의 합 : " + sum);
		
		
		sc.close();
		
	}
}
