package 다중ifelse문;

import java.util.Scanner;

public class Ex02string비교 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 입력 >> ");
		String input = sc.next();
		
		
		// 비교연산자 ( == , !=) => 기본타입(Primitive Type)을 사용할 때만 쓰는것
		// boolean, char, byte, short, int, long, float, double
		// equals 라는 기능 사용
		if(input.equals("A")) {
			// 다른지를 비교하려면 !(Not)을 앞에 붙이기 
			// !input.equals("A")
			System.out.println("A입력!");
		}else if(input.equals("B")) {
			System.out.println("B입력!");
		}else if(input.equals("C")) {
			System.out.println("C입력!");
		}else {
			System.out.println("A,B 외 입력!");
		}
		
		System.out.println("프로그램 종료!");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
