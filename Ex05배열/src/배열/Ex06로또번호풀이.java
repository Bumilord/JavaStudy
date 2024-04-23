package 배열;

import java.util.Arrays;
import java.util.Random;

public class Ex06로또번호풀이 {

	public static void main(String[] args) {

		// 정수형 데이터 5개를 보관할 수 있는 array 배열 선언
		int[] array = new int[5];

		// 랜덤한 숫자 만드는 도구 꺼내기
		Random ran = new Random();

		System.out.println("=====로또타임=====");
		System.out.println("이번주 출력번호는요...!!두구두구두구!!!!!");
		
		// 0번방에 랜덤한 숫자 넣기
		array[0] = ran.nextInt(10) + 1;

		//////////////////////////////

		// 1번방에 랜덤한 숫자 넣기
		for (int j = 1; j < 5; j++) {
			array[j] = ran.nextInt(10) + 1;
			// 1번 방의 숫자와 0번방의 숫자 비교

			for (int i = 0; i < j; i++) {
				if (array[j] == array[i]) {
					// 중복된 수가 들어있다면 새로운 랜덤수 넣기
					
					//array[j] = ran.nextInt(10) + 1;
					//새로운 숫자를 넣었는데 또 중복이라면?
					// j의 값을 1증가시키지 말고 되돌려 다시 재검사 시킨다. 처음 for문에서 랜덤수를 다시 넣기 때문에
					// if문(중복이 되었을 때 실행되는) 안에 랜덤수식은 필요가 없다.
					j--;
				}
			}
		}

		System.out.println(Arrays.toString(array));
		
		//////////////////////////////

//		// 2번방에 랜덤한 숫자 넣기
//		array[2] = ran.nextInt(10) + 1;
//
//		// 2번방의 숫자와 0번방의 숫자 비교
//
//		for (int i = 0; i < 2; i++) {
//			if (array[2] == array[i]) {
//				// 중복된 수가 들어있다면 2번방에 새로운 랜덤수 넣기
//				array[2] = ran.nextInt(10) + 1;
//			}
//		}
//
////		// 2번방의 숫자와 1번방의 숫자 비교
////		if (array[2] == array[1]) {
////			array[2] = ran.nextInt(10) + 1;
////		}
//
//		//////////////////////////////
//
//		// 3번방에 랜덤한 숫자 넣기
//		array[3] = ran.nextInt(10) + 1;
//		for (int i = 0; i < 3; i++) {
//			if (array[3] == array[i]) {
//				array[3] = ran.nextInt(10) + 1;
//			}
//		}
//
////		if (array[3] == array[1]) {
////			array[3] = ran.nextInt(10) + 1;
////		}
////		if (array[3] == array[2]) {
////			array[3] = ran.nextInt(10) + 1;
////		}
//
//		//////////////////////////////
//
//		// 4번방에 랜덤한 숫자 넣기
//		array[4] = ran.nextInt(10) + 1;
//
//		for (int i = 0; i < 4; i++) {
//			if (array[4] == array[i]) {
//				array[4] = ran.nextInt(10) + 1;
//			}
//		}

		// 반복되는 영역만 두고 규칙을 찾은 후 삭제하기
//		if(array[4] == array[1]) {
//			array[4] = ran.nextInt(10)+1;
//		}
//		if(array[4] == array[2]) {
//			array[4] = ran.nextInt(10)+1;
//		}
//		if(array[4] == array[3]) {
//			array[4] = ran.nextInt(10)+1;
//		}

	}

}
