package 이중for문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("행 개수 : ");
		int num = sc.nextInt();

		for (int j = 1; j < num+1; j++) {
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
