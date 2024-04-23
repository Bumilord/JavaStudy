package ifelse문;

import java.util.Scanner;

public class Ex04ifelse예제 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소프트웨어 설계 : ");
		int sub1 = sc.nextInt();
		
		System.out.print("소프트웨어 개발 : ");
		int sub2 = sc.nextInt();
		
		System.out.print("데이터베이스 구축 : ");
		int sub3 = sc.nextInt();
		
		System.out.print("프로그래밍 언어 활용 : ");
		int sub4 = sc.nextInt();
		
		System.out.print("정보시스템 구축 관리 : ");
		int sub5 = sc.nextInt();
		
		
		// 한 과목이라도 8개 미만인 경우 "불합격" 출력
		if(sub1<8 || sub2<8 || sub3<8 || sub4<8 || sub5<8) {
			System.out.println("불합격입니다");
		}else {
			// 총 개수가 60개 이상이면 "합격" 출력
			if(sub1+sub2+sub3+sub4+sub5 >=60) {
				System.out.println("합격입니다");
			}else {
				System.out.println("불합격입니다");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
