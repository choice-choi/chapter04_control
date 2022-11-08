package org.joonzis.test.forwhile;

public class Test03_1 {
	public static void main(String[] args) {
//		Test03.java
//		Q. 전체 구구단 출력하기_1
//		ex) 2x1 = 2
//			2x2 = 4
//			...
//			9x9 = 81
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "X" + j + "=" + (i*j));
			}
		}
		
		
	}
}
