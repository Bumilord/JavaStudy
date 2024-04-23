package while문;

import java.util.Scanner;

public class Ex03while문예제 {

	public static void main(String[] args) {

		// 입력받는 도구 꺼내기
		Scanner sc = new Scanner(System.in);
		
		int result = 0;

		while(true) {
			// 정수 입력출력
			System.out.print("정수 입력 : ");
			// 정수 입력받기
			int num = sc.nextInt();
			
			// 입력받은 정수 누적하기
			// 누적받을 변수 선언
			result += num; // result = result+num;
			
			System.out.println("누적결과 : " + result);
			
			if(num==-1) {
				System.out.println("종료되었습니다.");
				break;
			}
			
		}
		
		
		// 다른 풀이
		
//		int num = 0;
//		int result = 0;
//		
//		while(num>=0) {
//			System.out.println("정수 입력 : ");
//			num = sc.nextInt();
//			result += num;
//			System.out.println("누적결과 : "+ result);
//			
//			
//		}
//		System.out.println("종료되었습니다.");
//		
		
		
		
		
		
		
		
		
		
		
	}

}
