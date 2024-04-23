package 종합;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		int pay = 5000;
		
		int result = time < 8 ? time*pay : (pay*8)+(int)((time-8)*pay*1.5);
		
		System.out.println("총 임금은 "+result+"원 입니다.");
		
		
		
//		int pay = 5000*time;
//		
//		if(time > 8) {
//			pay = 40000+(7500*(time-8));
//		}
//		System.out.println("총 임금은 "+pay+"원 입니다.");
		
		
		
		
	}

}
