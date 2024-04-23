package 이중for문;

public class Ex04공포의별찍기 {

	public static void main(String[] args) {

		for (int k = 4; k >= 0; k--) {
			for (int j = 0; j < k; j++) {
				System.out.print(" ");
			}

			for (int i = 5; i > k; i--) {
				System.out.print("*");
			}

			System.out.println();

		}
		

		
		// 다른 풀이
		
		for (int j = 1; j < 6; j++) {
			for (int i = 0; i < 5 - j; i++) {
				System.out.print(" ");
			}
			for (int i = 0; i < j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
		
		
		
//		for (int j = 0; j < 3; j++) {
//			System.out.print(" ");
//		}
//		for (int i = 5; i < 3; i--) {
//			System.out.print("*");
//		}
//		System.out.println();
//
//		for (int j = 0; j < 2; j++) {
//			System.out.print(" ");
//		}
//		for (int i = 5; i < 2; i--) {
//			System.out.print("*");
//		}
//		System.out.println();
//
//		for (int j = 0; j < 1; j++) {
//			System.out.print(" ");
//		}
//		for (int i = 5; i < 1; i--) {
//			System.out.print("*");
//		}
//		System.out.println();
//
//		for (int j = 0; j < 0; j++) {
//			System.out.print(" ");
//		}
//		for (int i = 5; i < 0; i--) {
//			System.out.print("*");
//		}
//		System.out.println();

		
		
		
	}

}
