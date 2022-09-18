package org.joonzis.test.forwhile;

public class Test04 {
	public static void main(String[] args) {
//		Test04.java
//		Q. 전체 구구단 출력하기_2
//		ex) 2x1 = 2 	3x1 = 3 	...		9x1 = 9
//			2x2 = 4		3x2 = 6		...		9x2 = 18
//			...
//			2x9 = 18	3x9 = 27 	...		9x9 = 81
		
		
		for(int num=1; num<=9; num++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.print(dan + "X" + num + "=" + (dan*num) + "\t");
			}
			System.out.println();
		}
		
		
		
		
	}
}
