package org.joonzis.test.forwhile;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
//		Test02.java
//		Q. 입력받은 구구단만 출력하기
//		ex) 4X1=4
//			4X2=8
//			4X3=12
//			4X4=16
//			...
		
		Scanner sc = new Scanner(System.in);
		System.out.println("단수 입력 >> ");
		int dan = sc.nextInt();
		
		System.out.println("<for문>");
		for(int i=1; i<=9; i++) {
			System.out.println(dan + "X" + i + "=" + (dan*i));
		}
		
		System.out.println("");
		System.out.println("<while문>");
		
		
		int num = 1;
		while(num < 10) {
			System.out.println(dan + "X" + num + "=" + (dan*num));
			num++;
		}
		
		
		sc.close();
	}
}
