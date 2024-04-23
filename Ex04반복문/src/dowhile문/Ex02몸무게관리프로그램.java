package dowhile문;

import java.util.Scanner;

public class Ex02몸무게관리프로그램 {

	public static void main(String[] args) {

		// 입력도구
		Scanner sc = new Scanner(System.in);

		// 현재 몸무게
		System.out.print("현재몸무게 : ");
		int weight1 = sc.nextInt();
		// 목표 몸무게
		System.out.print("목표몸무게 : ");
		int weight2 = sc.nextInt();

		// 주차별 감량 몸무게
		int week = 0;
		
		//다른 풀이
		//int week = 1;
		//System.out.print(week + "주차 감량 몸무게 : ");
		//week++;
		
		do {
			System.out.print(++week + "주차 감량 몸무게 : ");
			int loss = sc.nextInt();
			//감량 몸무게가 현재 몸무게에 누적되어야 함
			weight1 -= loss;
			
			//do문 안에서 탈출 조건을 주기 위해 if 사용, break;입력
			if (weight1 <= weight2) {
				System.out.print(weight1 + "kg 달성!! 축하합니다!!");
				break;
			}

		} while (true);

	}

}
