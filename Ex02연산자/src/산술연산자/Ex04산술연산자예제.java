package 산술연산자;

import java.util.Scanner;

public class Ex04산술연산자예제 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력: ");
		int input = sc.nextInt();
		
		int hour = input/3600;
		int min = (input%3600)/60;
		// int min = (input/60) - hour*60;
		int sec = input % 60;
		
		System.out.print(hour + "시 " + min + "분 " + sec + "초");
		
		
		
		
		
	}

}
