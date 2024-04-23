package 조건문;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int pay = 5000;
		
		// System.out.println((pay*8)+((time-8)*pay*1.5));
		
		if(time<=8) {
			System.out.println("총 임금은 "+ pay*8 + "원 입니다.");
		} else if(time>8){
			System.out.println("총 임금은 "+ (int)((pay*8)+((time-8)*pay*1.5)) + "원 입니다.");
		}
		
		
	
		
		
		
		
		
	}
	

}
