package org.joonzis.test;

import java.util.Scanner;

public class test02_ifswitch {

	public static void main(String[] args) {
//		Test02.java
//		Q. 필기와 실기 점수를 입력 받아 합격 유무 출력하기
//			합격기준: 필기와 실기 점수 모두 70점 이상이거나, 평균이 80 이상시 "합격" 아니면 "불합격"
//			
//			1) 필기 70이상이거나 또는 실기 70이상이거나 조건
//			2) 평균 80 이상 조건 

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("필기 점수 >> ");
		int num1 = sc.nextInt();
		System.out.println("실기 점수 >> ");
		int num2 = sc.nextInt();
		
		//평균 구하는 로직 
		double avg = (num1+num2) / 2.0;	// 필기, 실기의 평균
		
		// 1) 
		if(num1>=70 && num2>=70) {
			System.out.println("합격");
		}else if(avg >= 80) {	//평균 구하는 로직 필요
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// 2)
		if((num1>=70 && num2>=70) || (avg >= 80)) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// 3)
		if(num1>=70) {
			if(num2>=70)
			System.out.println("합격");
		}else if(avg >= 80) {	//평균 구하는 로직 필요
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		
		sc.close();
		
	}

}
