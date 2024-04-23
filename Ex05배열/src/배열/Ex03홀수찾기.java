package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex03홀수찾기 {

	public static void main(String[] args) {

		Random ran = new Random();

		// 1. 정수형 데이터 5개를 저장할 수 있는 배열 선언
		int[] numbers = new int[5];

		// 2. 랜덤한 값으로 배열 초기화(1~100)
		System.out.print("array에 들어있는 홀수는 ");

		int num = 0; // 총 갯수의 누적이 필요하기 때문에 초기화문구 작성

		// 3. 홀수값만 출력하고, 총 몇 개인지 출력
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = ran.nextInt(100) + 1;
			// for문이 반복될 때 마다 랜덤수가 나와야 하기 때문에 for문 안쪽에 ran.nextInt 수식 넣기

			if (numbers[i] % 2 == 1) {
				System.out.print(numbers[i] + " ");
				num++;
				// 홀수일 경우에만 카운트 하기 때문에 if문 안에 작성
			}

		}
		System.out.println("이며,\n총 " + num + "개 입니다");
		// \n 은 엔터기능

		// 배열 안의 모든 데이터 출력하기
		//Arrays.toString(배열명)
		//System.out.println(Arrays.toString(numbers));

		
		
		
		
		
	}

}
