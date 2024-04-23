package for문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("n 입력 : ");
		int input = sc.nextInt();

		int result = 1;
		for (int i = 0; i < input; i++) {
			result += i;
			System.out.print(result + " ");

		}

//		0+1 = 1
//		1+1 = 2
//		2+2 = 4
//		4+3 = 7
//		7+4 = 11
//		11+5 = 16

	}

}
