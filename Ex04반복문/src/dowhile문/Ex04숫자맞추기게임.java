package dowhile문;

import java.util.Random;
import java.util.Scanner;

public class Ex04숫자맞추기게임 {

	public static void main(String[] args) {

		// 랜덤숫자 도구 꺼내오기
		Random ran = new Random();
		// 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 1과 100 사이의 랜덤숫자 변수에 담기
		int ranNum = ran.nextInt(100) + 1;

		System.out.println("===== 1부터 100 사이 숫자 맞추기 게임! ======");

		do {
			// 1과 100 사이의 정수를 입력하세요 출력
			System.out.print("1과 100사이의 정수를 입력하세요 >>");
			// 숫자 입력 받기
			int num = sc.nextInt();

			// 입력한 숫자가 더 작다면 "더 큰 수를 입력하세요"를 출력
			// 입력한 숫자가 더 크다면 "더 작은 수를 입력하세요"를 출력
			if (ranNum < num) {
				System.out.println("더 작은 수를 입력하세요");
			} else if (ranNum > num) {
				System.out.println("더 큰 수를 입력하세요");
			} else {
				System.out.println(ranNum + " 정답입니다!!");
				// else if (ranNum == num) {
				// System.out.println(ranNum + " 정답입니다!!");
				break;
			}
		} while (true);

	}

}
