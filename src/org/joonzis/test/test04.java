package org.joonzis.test;

public class test04 {

	public static void main(String[] args) {
//		Test04.java
//		Q. 전체 구구단 출력하기_2
//		ex) 2x1 = 2 	3x1 = 3 	...		9x1 = 9
//			2x2 = 4		3x2 = 6		...		9x2 = 18
//			...
//			2x9 = 18	3x9 = 27 	...		9x9 = 81

		

		
//		작은 for문 옆으로 만들기
		
		for(int num=1; num<=9; num++) {

			for(int i=2; i<=9; i++) {
			System.out.print(i + "X" + num + "=" + (i * num) + "\t");	//ln쓰면 밑으로 내려감
			}
			System.out.println(); 	//enter줌
		}
		
		
		
	}

}
