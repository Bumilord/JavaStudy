package 이차원배열;

public class Ex02이차원배열 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int num = 21;

		// 이차원배열에 값 넣기

		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 5; i++) {
				array[i][j] = num++;
			}
		}

		// 이차원배열 출력

		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {

				System.out.print(array[j][i] + " ");
			}
			System.out.println();
		}

		
		
		
		
		
	}

}
