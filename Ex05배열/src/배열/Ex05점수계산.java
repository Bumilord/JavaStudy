package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05점수계산 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 성적 데이터를 저장할 배열 생성
		int[] array = new int[5];

		// 최고, 최저, 총합을 저장할 수 있는 변수 선언
		int max = 0;
		int min = 100;
		// min이랑 max랑 초기값을 array[0]으로 지정해도 괜찮음
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			array[i] = sc.nextInt(); // 점수 입력

			if (array[i] > max) {
				max = array[i];
			}
			if (array[i] < min) {
				min = array[i];
			}
			sum += array[i];
		}

		// 입력받은 데이터 전부 출력
		System.out.println("입력된 점수 : " + Arrays.toString(array));

		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (double) sum / array.length);

		
	}

}
