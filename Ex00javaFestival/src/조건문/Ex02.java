package 조건문;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int cash = sc.nextInt();

		
		System.out.println();
		System.out.println("잔돈 : " + cash + "원");
		
		
		System.out.println("10000원 : "+ (cash/10000) + "개");
		System.out.println("5000원 : "+ (cash%10000/5000) + "개");
		System.out.println("1000원 : "+ (cash%5000/1000) + "개");
		System.out.println("500원 : "+ (cash%1000/500) + "개");
		System.out.println("100원 : "+ (cash%500/100) + "개");
		

		
		
		
		
		
		
		
		
		
		
	}
}
