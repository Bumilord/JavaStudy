package 조건문;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

	
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >> ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 입력 >> ");
		int num2 = sc.nextInt();
		
		int result1 = num1*(num2%10);
		int result2 = num1*(num2%100/10);
		int result3 = num1*(num2/100);
		int result4 = num1*num2;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
