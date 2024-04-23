package 종합;

public class Ex13 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";

		char[] ch = score.toCharArray(); // 알파벳담기
		int[] cnt = new int[5]; // 알파벳 카운트


		// ch 0번방이 A랑 같으면 A갯수 1 증가
		for (int i = 65; i < 71; i++) {

			if (ch[i - 65] == (char) i) {
				cnt[i - 65]++;
			}
		}
		for (int i = 65; i < 71; i++) {
			System.out.println((char) i + " : " + cnt[i - 65] + "명");
		}

	}

}
