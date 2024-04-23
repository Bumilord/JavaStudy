package 메소드;

import java.util.Scanner;

public class Ex02계산기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력 : ");
		int num2 = sc.nextInt();
		char op = '*';
		System.out.println(car(num1, num2, op));
		
		
		
		
	}
	
	// private : 다른 클래스에서 사용할 수 없게 막는 접근제한자
	public static int car(int num1, int num2, char op) {
		int result = 0;
		// op가 어떤 모양인지에 따라서 연산이 달라져야함!
		// op값을 비교 판별해야한다.
		if (op == '+') {
			result = num1 +num2;
		} else if (op == '-') {
			result = num1 > num2 ? num1 - num2 : num2 - num1;
		} else if (op == '*') {
			result = num1*num2;
		} else if (op == '/') {
			result = num1 / num2;
		}
		
		return result;
		
	}
	
	
	
	
	

}
