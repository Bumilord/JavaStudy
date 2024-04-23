package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex06로또번호추첨 {

	public static void main(String[] args) {

		Random ran = new Random();
		int[] lotto = new int[5];

		System.out.println("=====로또타임=====");
		System.out.println("이번주 출력번호는요...!!두구두구두구!!!!!");

		// 0번방
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = ran.nextInt(10) + 1;

		}

		for (int j = 1; j < 5; j++) {
			// 1번방
			for (int i = 0; i < 1; i++) {
				if (lotto[i] == lotto[j]) {
					lotto[j] = ran.nextInt(10) + 1;
				}
			}

			// 2번방
			for (int i = 0; i < 2; i++) {
				if (lotto[i] == lotto[j]) {
					lotto[j] = ran.nextInt(10) + 1;
				}
			}

			// 3번방
			for (int i = 0; i < 3; i++) {
				if (lotto[i] == lotto[j]) {
					lotto[j] = ran.nextInt(10) + 1;
				}
			}

			// 4번방
			for (int i = 0; i < 4; i++) {
				if (lotto[i] == lotto[j]) {
					lotto[j] = ran.nextInt(10) + 1;
				}
			}

		}
		
		
		System.out.print(Arrays.toString(lotto));
		

		// 4-2. lotto[1]과 lotto[2]이 같은지 비교하기
		// --> 같다면 lotto[2]에 다시 랜덤한 수 부여하기

		// 5. lotto의 3번방 데이터를 랜덤한 수로 초기화
		// lotto[3] = ran.nextInt(10) + 1;

		// 5-1. lotto[0]과 lotto[3]이 같은지 비교하기
		// --> 같다면 lotto[3]에 다시 랜덤한 수 부여하기

		// 6. lotto의 4번방 데이터를 랜덤한 수로 초기화
		// lotto[4] = ran.nextInt(10) + 1;

		// 6-1. lotto[0]과 lotto[4]이 같은지 비교하기
		// --> 같다면 lotto[4]에 다시 랜덤한 수 부여하기

	}

}
