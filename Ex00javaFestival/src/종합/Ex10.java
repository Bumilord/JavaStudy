package 종합;

import java.util.Random;

public class Ex10 {

	public static void main(String[] args) {

		Random ran = new Random();

		int[] array = new int[8];

		int max = 0;
		int min = 100;

		System.out.print("배열에 있는 모든 값 : ");
		for (int i = 0; i < 8; i++) {
			array[i] = ran.nextInt(100) + 1;
			System.out.print(array[i] + " ");
			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}

		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		
		

	}

}
