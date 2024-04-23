package 이차원배열;

public class Ex03이차원배열스네이크 {

	public static void main(String[] args) {

		// 이차원배열 생성
		int[][] array = new int[5][5];

		// 이차원배열 값 넣기
		int num = 21;

		// 0, 2, 4 ----> 증가 (행의 인덱스가 짝수일 때)
		// 1, 3 증가 <---- (행의 인덱스가 홀수일 때)
		for (int j = 0; j <= 4; j++) { // j--> 행 번호

			// 행이 홀수인지 짝수인지 판별
			if (j % 2 == 0) {
				// 행이 짝수일 때
				for (int i = 0; i < 5; i++) {
					array[j][i] = num++; // 21~25
				}

			} else {
				// 행이 홀수일 때
				for (int i = 4; i >= 0; i--) {
					array[j][i] = num++; // 26~30
				}

			}

		}

//		for (int i = 0; i < 5; i++) {
//			array[2][i] = num++; // 31~35
//		}
//
//		for (int i = 4; i >= 0; i--) {
//			array[3][i] = num++; // 36~40
//		}
//
//		for (int i = 0; i < 5; i++) {
//			array[4][i] = num++; // 41 ~45
//		}

		
		
		
		// 이차원배열 출력
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array[j].length; i++) {
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

		
		
		
		
		
		
	}

}
