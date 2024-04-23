package while문;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);

		int cha = 0;
		
		while (true) {
			int num1 = ran.nextInt(10);
			int num2 = ran.nextInt(10);

			System.out.print(num1 + " + " + num2 + " = ");
			int input = sc.nextInt();

			if (num1 + num2 == input) {
				System.out.println("SUCCESS!");

			} else{

				System.out.println("Fail...");
				cha++;

			}
			if (cha == 5) {
				System.out.println("GAME OVER!");
				break;
			}

		}

	}

}
