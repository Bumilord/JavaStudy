package switch문;

import java.util.Scanner;

public class Ex01switch {

	public static void main(String[] args) {

		//숫자 1개 입력 1->1입력, 2->2입력, 3->3입력, 나머지->나머지 입력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 >> ");
		int input = sc.nextInt();
		
		//switch(값자체를 넣어주기){}
		switch(input) {
		case 1:
			System.out.println("1입력");
			// 한문장씩만 출력하기 위해 break 키워드 넣어주기
			break; //switch~case, 반복문을 나가는 키워드
			       //break를 만나는 순간 가장 가까운 조건/반복문 나감
		case 2:
			System.out.println("2입력");
			break;
		case 3:
			System.out.println("3입력");
			break;
		default:
			System.out.println("나머지입력");

		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
