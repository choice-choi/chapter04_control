package org.joonzis.test.forwhile;

public class Test04_1 {
	public static void main(String[] args) {
//		Test04.java
//		Q. 전체 구구단 출력하기_2
//		ex) 2x1 = 2 	3x1 = 3 	...		9x1 = 9
//			2x2 = 4		3x2 = 6		...		9x2 = 18
//			...
//			2x9 = 18	3x9 = 27 	...		9x9 = 81
		/*
		system.out.print

		형식(int, float, double 등)에 구애받지 않는 문자를 그대로 출력하고 싶을 때 사용한다.
		엔터 입력시 버퍼(buffer)에 \n(개행문자)는 포함 안됨.(엔터 누르는 순간 엔터는 입력 안됨)
		그래서 줄바꿈 필요 없을 때 println말고 print 사용하면 된다.
		 

		system.out.println

		print와 동일하게 형식(int, float, double 등)에 구애받지 않는 문자를 그대로 출력하고 싶을 때 사용한다.
		차이점은 엔터 입력시 버퍼(buffer)에  \n(개행문자)가 같이 들어간다. (엔터 누르는 순간 엔터도 입력된걸로 간주)
		*/
		
		for(int i=1; i<=9; i++) {
			for(int dan=2; dan<=9; dan++) {
				System.out.print(dan + "x" + i + "=" + (dan*i) + "\t");
			}
			System.out.println();
		}
		
		
	}
}
