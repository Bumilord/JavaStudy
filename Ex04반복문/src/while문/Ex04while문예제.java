package while문;

import java.util.Scanner;

public class Ex04while문예제 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int even = 0; //짝수
		int odd = 0; //홀수

		// ctrl shift f : 정렬
		// 정수 입력 출력하기 + 정수 입력받기
		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			
			if (num != -1) {
				if (num % 2 == 0) {
					++even;  //짝수라면 짝수의 개수를 +1
				} else {
					++odd;  //홀수라면 홀수의 개수를 +1
				}
				System.out.println("짝수개수 : " + even);
				System.out.println("홀수개수 : " + odd);
			} else if (num == -1) {
				System.out.println("종료되었습니다.");
				break;
			}
			
			
			//다른풀이
			
			
//				if (num % 2 == 0) {
//					++even;  
//				} else if(num % 2 ==1) {
//					++odd;  
//		     	} else if (num == -1) {
//				  System.out.println("종료되었습니다.");
//				  break;
//		        }
//				System.out.println("짝수개수 : " + even);
//				System.out.println("홀수개수 : " + odd);
			
			
			
			
			
			

		}

	}

}
