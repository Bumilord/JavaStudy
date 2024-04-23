package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex04가장큰수찾기 {

	public static void main(String[] args) {

		Random ran = new Random();

		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 array를 선언
		int[] array = new int[5];

		// 2. 배열 안의 모든 데이터를 임의의 값으로 초기화 (1~10)
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(10) + 1;
		}

		// 3. 가장 큰 값을 저장할 변수 max 선언
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			// 4. max와 배열안에 들어있는 값 비교(0번 인덱스부터 차근차근)
			if (array[i] > max) {
				// 5. 만약 배열안에 들어있는 값이 max보다 크다면
				// max를 배열안에 들어있는 값으로 변경
				max = array[i];
			}
		}

		
		// 6. 배열 안의 모든 데이터 출력하기
		System.out.println("배열 안에 들어있는 값 : " + Arrays.toString(array));

		
		// 7. 가장 큰 값 출력하기
		System.out.println("가장 큰 값은 " + max + "입니다.");

		
		
	}

}
