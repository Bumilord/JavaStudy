package 은행관리프로그램;

public class Bankbook {
	// 은행관리 프로그램을 만든다고 가정!
	// 통장을 관리할 수 있는 우리만의 자료형을 만든다!

	// 1. Field(Data, 속성)
	// 잔액(money)
	private int money;
	// private : 정보 은닉을 지켜주어야 한다.

	// 2. Method(Logic, 행위, 기능)
	// 입금하다(deposit)
	public void deposit(int money) {
		this.money += money;
		// this : 현재 이 클래스를 가리키는 키워드
	}

	// 출금하다(withdraw)
	// return 없음
	// 매개변수로 정수형 하나 받아서 현재 잔액에서 빼주는 로직
	public void withdraw(int money) {
		this.money -= money;
	}

	// 잔액확인하기(showMoney)
	// return 있음!
	// 매개변수X, 현재 잔액을 리턴!
	public int showMoney() {

		return money;

	}

}
