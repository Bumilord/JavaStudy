package for문;

import java.util.Scanner;

public class Ex04약수구하기 {

	public static void main(String[] args) {

		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		for (int i = 1; i <= input; i++) {
			// 나누는 수(i)이 입력한 수(input)보다 작거나 같을 때 까지 검사하는 조건 입력

			if (input % i == 0) {
				// 입력받은 숫자를 입의의 숫자(1 ~ 나 자신)로 나누었을 때
				// 나머지가 0인 것이 약수
				System.out.print(i + " ");

			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
