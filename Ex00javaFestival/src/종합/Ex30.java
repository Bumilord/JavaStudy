package 종합;

import java.util.Arrays;
import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====알파벳 빈도수 구하기=====");
		System.out.print("입력 >>");

		String str = sc.nextLine(); // 문자 입력
		String str2 = str.toLowerCase(); // 소문자로 변형
		// .toLowerCase(); : String 변수의 모든 문자를 소문자로 변환하는 메소드
		System.out.println(str);

		// 입력받은 문장을 쪼개서 배열에 담아주는 메소드
		char[] ch = str2.toCharArray();

		System.out.println(Arrays.toString(ch));

		int[] cnt = new int[26]; // 알파벳을 카운트할 변수 (방 갯수는 알파벳 갯수로)

		for (int j = 0; j < ch.length; j++) {
			// j --> 입력받은 글자 하나하나를 가져오는 과정의 for문
			for (int i = 97; i <= 122; i++) {
				// 배열에서 알파벳 하나를 가져와서 a~z까지 확인하는 반복문
				// 알파벳의 아스키코드로 반복문 작성
				if (ch[j] == i) {
					cnt[i - 97] += 1;
				}
			}
		}

		for (int i = 97; i < 123; i++) {
			System.out.println((char) i + " : " + cnt[i - 97]);
		}

	}

}
