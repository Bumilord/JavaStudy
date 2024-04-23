package 삼항연산자;

import java.util.Scanner;

public class Ex05삼항연산자 {
	public static void main(String[] args) {
		
		
		// 변수 i와 j가 가지고 있는 값이
		// 같으면 => "같다" 를 출력
		// 다르면 => "다르다"를 출력
		int i = 3;
		int j = 10;
		
		String result = (i==j)?"같다":"다르다";
		System.out.println(result);	
				
		System.out.println((i==j)?"같다":"다르다");		
				
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int input = sc.nextInt();
		
		String result1 = (input%2==0)?"짝수":"홀수";
		
		System.out.println(input+"는(은) " + result1 + "입니다.");

		
		
		
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		int result2 = (num1 > num2)? num1-num2 : num2-num1;
		
		System.out.println("두 수의 차 : " + result2);
		
		
		
		System.out.print("농구공의 개수를 입력하세요 : ");
		int ball = sc.nextInt();
		int result3 = (ball%5==0)? ball/5 : ball/5+1;
		
		
		System.out.println("필요한 상자의 수 : " + result3);
		
		
		
		System.out.print("노동시간을 입력하세요 : ");
		int num4 = sc.nextInt();
		int pay = 9000;
		
		
		
		double result4 = num4 < 8 ? num4*pay : (pay*8)+(num4-8)*pay*1.5;
		
		System.out.println("총 임금은 "+(int)result4+"원 입니다");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
