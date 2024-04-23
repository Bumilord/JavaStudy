package switch문;

import java.util.Scanner;

public class Ex04switch예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();
		System.out.println("--메뉴--");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >>");
		int menu = sc.nextInt();
		
		
		int change = 0; //(지역변수)계산한 잔돈을 저장할 변수 처음에는 0으로 초기화
		
		
		if(menu==1) { //콜라(1800)
			change = money - 1800; //잔돈
		} else if(menu==2) { //파워에이드(2000)
			change = money - 2000; //잔돈
		} else { //탄산수 (1200)
			change = money - 1200; //잔돈
		}
		
		if(change<0) {
			System.out.println("돈이 부족해요 ㅠㅜ");
		}else {
			System.out.println("잔돈 : "+ change);
			System.out.println("잔돈 : "+ (change/1000));
			System.out.println("잔돈 : "+ (change%1000/500));
			System.out.println("잔돈 : "+ (change%500/100));
		}
		
		
		
		

		
		
//		int cola = 1800;
//		int power = 2000;
//		int tan = 1200;
//		
//		if(num==1 && money>1800) {
//			System.out.println("잔돈 : " + (money-cola) +"원");	
//			System.out.println("천원 : " + (money-cola)/1000);
//			System.out.println("오백원 : " + (money-cola)/500);
//			System.out.println("백원 : " + (money-cola)/100);
//		}else if(num==2 && money>2000) {
//			System.out.println("잔돈 : " + (money-power) +"원");
//		}else if(num==3 && money>1200) {
//			System.out.println("잔돈 : " + (money-tan) +"원");
//		}else if(money<1800 || money<2000 || money<1200) {
//			System.out.println("돈이 부족해요 ㅠ-ㅜ");
//		}
		

		
		
		
		
		
		
		
		
		
		
	}

}
