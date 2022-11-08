package org.joonzis.test.forwhile;

public class Test05_1 {
	public static void main(String[] args) {
//		Test05.java
//		Q. 1 ~ 100 사이의 모든 정수 합계 출력하기
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
	}
}
