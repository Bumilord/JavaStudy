package 다중ifelse문;

import java.util.Scanner;

public class Ex01다중ifelse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int input = sc.nextInt();
		
		
		
		// 입력받은 값이 90점이상이면 "A학점"
		if(input>=90) {
			System.out.println("A학점입니다");
		}else if(input>=80) {
			// 80점이상 90미만 "B학점"
			System.out.println("B학점입니다");
		}else if(input>=70) {
			// 70점이상 80미만 "C학점"
			System.out.println("C학점입니다");
		}else{
			// 70미만인 경우 "F학점"
			System.out.println("F학점입니다");
		}
		
		
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
