package 인터페이스;

public class Child extends Employee implements Temp, Temp2 {

	
	public Child(String empno, String name, int pay) {
		super(empno, name, pay);
	}

	@Override
	public void temp() {
		
	}

	@Override
	public int getMoneyPay() {
		return 0;
	}

}
