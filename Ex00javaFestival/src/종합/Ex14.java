package 종합;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		// 정수 N을 입력받아서
		// N * N 배열에 숫자를 저장(스네이크)하고 출력

		// 1. 정수 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");

		int row = sc.nextInt();

		// 2. 이차원배열 생성
		int[][] array = new int[row][row];

		int num = 1;

		// 3. 입력부
		// 예를 들어서 row = 2;
		// 1 2
		// 4 3
//		array[0][0] = num++;
//		array[0][1] = num++;
		
//		array[1][1] = num++;
//		array[0][0] = num++;		
		
		
		for (int j = 0; j < array.length; j++) { //모든 행의 값을 채우는 for문
			// 행의 숫자가 홀수인지, 짝수인지 판별
			if (j % 2 == 0) {
				// 짝수행의 규칙 : 열번호가 0부터 시작해서 1씩 증가)
				for (int i = 0; i < array.length; i++) {
					array[j][i] = num++;
				}
			} else {
				// 홀수행의 규칙 : 열번호 1부터 시작해서 1씩 감소
				for (int i = array.length-1; i > -1; i--) {
					array[j][i] = num++;
				}
			}

		}

		// 4. 출력부
		// 4-1 열부분 줄이기 (하나씩 줄여보기)
//		for(int i = 0; i < 2 ; i++){
//		System.out.print(array[0][i]+"\t");
//		}
//		
//		System.out.println();
//		
//		for(int i = 0 ; i<2;i++){
//		System.out.print(array[1][i]+"\t");
//		}

		// 4-2 행부분 줄이기
		for (int j = 0; j < array.length; j++) { // j-> 행번호
			for (int i = 0; i < array.length; i++) { // i-> 열번호
				System.out.print(array[j][i] + "\t");
			}
			System.out.println();
		}

	}

}
