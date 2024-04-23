package 메소드;

import java.util.Scanner;

public class Ex05완전수 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("num1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("num2 입력 : ");
		int num2 = sc.nextInt();
		boolean divisor = isDivisor(num1, num2);
		System.out.println(divisor);

		
		// 자신을 제외한 약수의 합
		System.out.println(getSum(7));
		System.out.println(getSum(6));

	}

	private static boolean isDivisor(int num1, int num2) {
		// num2가 num1의 약수인지 확인
		// 맞으면 true, 틀리면 false

		boolean result = false;

		if (num1 % num2 == 0) {
			result = true;

		}

		return result;
	}

	// 2. 자신을 제외한 약수의 총합을 구하는 메소드
	// 메소드명 : getSum
	// 매개변수 : int 한개
	// 리턴 타입 : int
	// 로직 -> 자신을 제외한 약수의 총합을 구하도록!
	private static int getSum(int num) {

		int result = 0;
		// 1. 입력된 숫자의 약수 구하기 --> 1~num까지 숫자 중에서 num을 제외한 범위
		// 2. 나 자신을 제외한 약수의 합을 구한 --> result에 누적
		for (int i = 1; i < num; i++) {
			// * 기존 로직
			// if(num%i ==0) {

			// **메소드 호출한 로직
			// 메소드 구조 안에 메소드를 새롭게 만들 수는 없으나
			// 메소드를 호출해서 사용하는 것은 가능하다!
			if (isDivisor(num, i) == true) {
				// i는 num의 약수이다.

				result += i;
			}

		}
		return result;

	}

}
