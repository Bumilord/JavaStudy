package for문;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		int result = num;
		int sum = 0;
		
		while(result > 0) {
			sum += result % 10; //sum = sum+(result%10);
			result = result/10; 
		}
		System.out.println("합은 "+ sum + "입니다.");
		
		
		
		
		
		
		
		
	}

}
