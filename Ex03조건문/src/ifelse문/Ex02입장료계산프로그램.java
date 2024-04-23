package ifelse문;

import java.util.Scanner;

public class Ex02입장료계산프로그램 {

	public static void main(String[] args) {

		
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();		
		
		System.out.print("인원수를 입력하세요 : ");
		int num = sc.nextInt();	
		
		// 입장료 계산하기
		// ★★★★ 지역변수 (local variable) ★★★★
		// : {} 영역 안에서 선언된 변수는 {}영역 안에서만 사용 가능하다!
		// ----> {}중괄호 : scope(스코프)영역
		
		int result1 = num*5000/2;
		int result2 = num*5000;
		
		
		if(age<20) {
			System.out.println("총"+result1+"원입니다.");
			
		} else {
			System.out.println("총"+result2+"원입니다.");
		}
		
		
		
		
		
		
		
		
	}

}
