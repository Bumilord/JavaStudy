package 산술연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		
		int num1 = sc.nextInt();
		int result = num1 - num1 % 100;
		
		System.out.println("결과 값 : " + result);
		
		
		// 다른방법
		
		System.out.print("정수입력 : ");
		
		int num2 = sc.nextInt();
		int result1 = num2 / 100 * 100;
		
		System.out.println("결과 값 : " + result1);

		
		
		
		
		
		
		
	}

}
