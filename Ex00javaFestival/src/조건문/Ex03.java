package 조건문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		
		// 반올림은 0~4 면 내림 5~9면 올림
		// 0~4에 5를 더하면 십의 자리 숫자가 안바뀜
		// 5~9에 5를 더하면 십의자리 숫자가 바뀜
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		int result = (input+5)/10*10;
		System.out.print("반올림 수 : "+result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
