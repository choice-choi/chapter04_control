package org.joonzis.test.forwhile;

public class Test03 {
	public static void main(String[] args) {
//		Test03.java
//		Q. 전체 구구단 출력하기_1
//		ex) 2x1 = 2
//			2x2 = 4
//			...
//			9x9 = 81
		
		
		for(int dan=2; dan<=9; dan++) {
			for(int num=1; num<=9; num++) {
				System.out.println(dan + "X" + num + "=" + (dan*num));
			}
		}
		
		
	}
}
