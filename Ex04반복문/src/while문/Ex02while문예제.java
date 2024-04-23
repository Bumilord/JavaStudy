package while문;

import java.util.Scanner;

public class Ex02while문예제 {

	public static void main(String[] args) {

		// 입력 받은 수가 10보다 작을 경우 입력 반복

		// 1. 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);

		int num = 0;

		while (num < 10) {
			// 2. 정수 입력 : 출력하기
			System.out.print("정수 입력 : ");
			// 3. 정수 입력받기
			num = sc.nextInt();
		}
		// 2~3 구간이 반복! 10보다 큰 수를 입력하면 종료!
		System.out.println("종료되었습니다.");

		
		// 무한반복문 방식
		while(true) {
			System.out.print("정수 입력 : ");
			int num1 = sc.nextInt();
			
			if(num1 >= 10) {
				System.out.println("종류되었습니다.");
				break;
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
