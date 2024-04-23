package 상품등록;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ArrayList 생성
		ArrayList<Product> pr = new ArrayList<Product>();

		System.out.print("물건 개수 입력 : ");
		int input = sc.nextInt();

		for (int i = 0; i < input; i++) {
			System.out.print(i + 1 + ") 물건 이름 : ");
			String name = sc.next();

			System.out.print(i + 1 + ") 단가 : ");
			int unitPrice = sc.nextInt();

			System.out.print(i + 1 + ") 수량 : ");
			int amount = sc.nextInt();

			System.out.println();

			pr.add(new Product(name, unitPrice, amount));

		}

		System.out.println("제품명\t단가\t수량");

		int total = 0;

		// pr.get(인덱스번호).getName() ;
		
		for (Product p : pr) {
			total += p.getUnitPrice() * p.getAmount();
			System.out.println(p.getName() + "\t" + p.getUnitPrice() + "원\t" + p.getAmount() + "개");
		}

		System.out.println("총 금액 : " + total + "원");

	}

}
