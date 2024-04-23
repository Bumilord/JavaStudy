package 중간시험;

import java.util.Scanner;

public class Ex03중간시험 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("단 수 입력 : ");
		int dan = sc.nextInt();
		System.out.print("어느 수 까지 출력 : ");
		int input = sc.nextInt();

		System.out.println(dan + "단");
		int num = 0;
		while (true) {
			System.out.println(dan + " * " + ++num + " = " + (dan * num));

			if (num == input) {
				break;
			}

		}

	}

}
