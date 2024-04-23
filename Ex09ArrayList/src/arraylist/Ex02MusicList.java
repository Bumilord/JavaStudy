package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02MusicList {

	public static void main(String[] args) {

		// 발생 오류 종류
		// 컴파일 -> 실행
		// 1. 컴파일(작성한 코드를 컴퓨터언어로 변경) 오류
		// 코드상에서 오타 , 타입 불일치 등 (컴퓨터 언어로 변경이 안되는것) => 실행이 안됨(빨강줄)

		// 2. 런타임(프로그램 실행) 오류
		// 코드 문법 자첸느 문제가 없음 / 실행을 하고 보니 오류가 발생
		// 콘솔에 출력되는 Exception 타입확인 => 어떤 오류가 발생하는지를 확인
		// => 해당 오류를 해결할 수 있는 예외처리 필수!

		Scanner sc = new Scanner(System.in);

		ArrayList<String> musicList = new ArrayList<String>();

		while (true) {
			// 노래 추가,삭제,종료 선택
			System.out.print("[1]노래 추가 [2]노래 삭제 [3]종료 >> ");
			int num = sc.nextInt();

			// 재생목록이 없을 때
			if (musicList.isEmpty()) {

				System.out.println("========== 현재 재생 목록 ==========");
				System.out.println("재생 목록이 없습니다.");
				System.out.println("================================");
			}

			// 노래 추가(재생목록이 있을 때)
			if (num == 1 && musicList.size() > 0) {
				System.out.println("========== 현재 재생 목록 ==========");
				for (int i = 0; i < musicList.size(); i++) {
					System.out.println(i + 1 + ". " + musicList.get(i));
				}
				System.out.println("================================");
			}

			// 위치 선택
			if (num == 1) {

				System.out.print("[1]마지막위치에 추가 [2]원하는 위치에 추가 >> ");
				int add = sc.nextInt();

				// 노래 추가 (1 마지막 위치, 2 원하는 위치)
				if (add == 1) {
					System.out.print("추가 할 노래 입력 : ");
					String musicName = sc.next();
					musicList.add(musicName);
					System.out.println("추가가 완료되었습니다." + "\n");

				} else if (add == 2) {
					System.out.print("추가 할 노래 입력 : ");
					String musicName = sc.next();
					System.out.print("추가 할 위치 입력 >> ");
					int num1 = sc.nextInt();
					musicList.add(num1 - 1, musicName);
					System.out.println("추가가 완료되었습니다." + "\n");

				}
			}
			// 노래 삭제
			if (num == 2 && musicList.size() > 0) {
				System.out.println("========== 현재 재생 목록 ==========");
				for (int i = 0; i < musicList.size(); i++) {
					System.out.println(i + 1 + ". " + musicList.get(i));
				}
				System.out.println("================================");

				System.out.print("[1]선택삭제 [2]전체삭제  >> ");
				int num2 = sc.nextInt();

				if (num2 == 1) {
					System.out.print("삭제할 노래 선택 >> ");
					int delete = sc.nextInt();

					musicList.remove(delete - 1);
					System.out.println("노래가 삭제되었습니다.");
				} else {
					musicList.clear();
					System.out.println("전체 list가 삭제되었습니다.");
				}

			}
			// 종료
			if (num == 3) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}

		}
	}
//	//재생목록 출력
// public static void printPlayList() {
//	 
// }
	
	
	
	
	
}
