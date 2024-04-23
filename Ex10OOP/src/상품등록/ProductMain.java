package 상품등록;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("등록할 상품 종류 : ");
		int input = sc.nextInt();

		// 입력한 갯수만큼 배열 생성
		Product[] pr = new Product[input];

		for (int i = 0; i < pr.length; i++) {
			System.out.print(i + 1 + ") 물건 이름 : ");
			String name = sc.next();

			System.out.print(i + 1 + ") 단가 : ");
			int unitPrice = sc.nextInt();

			System.out.print(i + 1 + ") 수량 : ");
			int amount = sc.nextInt();

			System.out.println();

			pr[i] = new Product(name, unitPrice, amount);

		}
		int total = 0; // 총금액 <= 각 상품에 대한 총금액() 누적
		System.out.println("제품명\t단가\t수량");
		for (int i = 0; i < pr.length; i++) {
			total += pr[i].getUnitPrice() * pr[i].getAmount();

			System.out.println(pr[i].getName() + "\t" + pr[i].getUnitPrice() + "원\t" + pr[i].getAmount() + "개");
		}
		System.out.println("총 금액 : " + total + "원");

		
		
		// for ~each문
		// int total = 0;
		// for(Product p : pr) {
		//     total += p.getUnitPrice() * p.getAmount() ;
		//     System.out.println(p.getName()+"\t"+p.getUnitPrice()+"원\t"+p.getAmount()+"개");
		// }

	}

}
