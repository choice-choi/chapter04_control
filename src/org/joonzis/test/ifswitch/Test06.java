package org.joonzis.test.ifswitch;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
//		Test06.java
//		Q. 알파벳을 하나 입력 받아 대문자가 입력되면 소문자로 변환해서 출력하고, 소문자가 입력되면 대문자로 변환해서 출력하고
//		   	나머지 문자들은 그대로 출력하기
//		★아스키 코드  
//		97~122 : 소문자, 
//		65~90 : 대문자, 
//		48~57 : 숫자
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 입력 >> ");
		char ch = sc.next().charAt(0);
		// str이 가리키고 있는 문자열에서 0번째에 있는 문자를
		// char타입으로 변환한다는 의미가 되겠다.
		// 그러니까 안녕하세요 에서 0번째(맨 첫 번째)문자인 '안'만 가져오는 것
		
		if(ch>='A' && ch<='Z') {
			System.out.println(ch+=32);
		}else if(ch>='a' && ch<='z'){
			System.out.println(ch-=32);
		}else {
			System.out.println(ch);
		}
		
		
	}
}
