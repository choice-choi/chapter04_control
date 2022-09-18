package org.joonzis.ex;

public class Ex07_continue {

	public static void main(String[] args) {
		// 1. 1~10 출력(while) (3의 배수는 제외) / 3으로 나누어 떨어지는 값은 3의 배수에 해당
		int num = 0;
		while(num<10) {
			num++;
			
			
			if(num % 3 != 0) {
			System.out.println(num);
		}
			/*
			if(num % 3 == 0) {
				
			}else {
				
			}System.out.println(num);
			*/

			
			/*
			if(num % 3 == 0) {
				continue;
			}
			System.out.println(num);
		}
			*/
			
			
			// 2. 1~10 출력(for) (홀수만 출력)
			// 1)
			for(int i = 0; i<10; i++) {
				if(i%2=0) {
					continue;
				}
			}	System.out.println(i+1);
		
			
			
			// 2)
			for(int i = 1; i=10; i++) {
				System.out.println(i);
			}
			
			
			
	}

}
