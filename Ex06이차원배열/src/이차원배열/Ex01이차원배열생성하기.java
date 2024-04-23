package 이차원배열;

import java.util.Arrays;

public class Ex01이차원배열생성하기 {

	public static void main(String[] args) {

		// 1. 이차원배열 생성하기(정수형 데이터 저장)
		int[][] array = new int[3][3]; // [행][열]

		System.out.println(array[1][1]);

		// 2. 이차원배열 값을 넣으면서 생성하기
		int[][] array2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		// 3. 이차원배열 안에 값 넣기
		int num = 1;

		for (int j = 0; j < array.length; j++) { // j --> 행번호
			for (int i = 0; i < array[i].length; i++) { // i --> 열번호
				array[j][i] = num++;
			}

		}

		// 4. 이차원배열 출력하기
		System.out.println(Arrays.toString(array[0]));
		System.out.println(Arrays.toString(array[1]));
		System.out.println(Arrays.toString(array[2]));

		
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				
				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}

		
		
		
		
		
	}

}
