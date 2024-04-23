package 정렬;

import java.util.Arrays;

public class Ex01버블정렬_오름차순 {

	public static void main(String[] args) {
		// 버블정렬
		// 오름차순 정렬
		// 1. 앞에서부터 현재 원소와 바로 다음에 있는 원소 비교
		// 2. 현재원소가 다음 원소보다 크다면 원소를 교환
		// 3. 다음원소로 이동해서 해당원소와 그 다음 원소를 비교 반복

		// 배열 선언하기
		int[] array = { 1,2,3,4,5 };

		System.out.println("정렬 전 : " + Arrays.toString(array));

		// 치환, 순서를 바꾸려면 공간이 하나 더 필요하다.
		int temp = 0; // 치환을 위한 임시 공간

		// 1회차
		// 0-1 비교 / 1-2 비교 / 2-3 비교 / 3-4 비교
		
		// Q. 중간에 정렬이 완료된 경우 더 이상 정렬을 진행하지 않는 코드 작성.
		for (int j = 1; j < array.length; j++) {
			
			boolean sw = false; // n 회차에서 정렬이 한번이라도 일어나면 true
			for (int i = 0; i < array.length - j; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sw = true;
				} 
			}
			if(!sw) {
				// sw가 false일때만 실행되는 로직 (n회차에서 한번도 바뀐값이 없을 때)
				break;
			}

			System.out.println(j+"회차 : " + Arrays.toString(array));
		}

		// 2회차
		// 0-1 비교 / 1-2 비교 / 2-3 비교
//		for (int i = 0; i < 3; i++) {
//			if (array[i] > array[i + 1]) {
//				temp = array[i];
//				array[i] = array[i + 1];
//				array[i + 1] = temp;
//			}
//
//		}
//
//		System.out.println("2회차 : " + Arrays.toString(array));

	}

}
