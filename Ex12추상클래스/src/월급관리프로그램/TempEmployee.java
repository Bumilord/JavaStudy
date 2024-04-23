package 월급관리프로그램;

public class TempEmployee extends Employee {

	

	public TempEmployee(String empno, String name, int pay) {
		super(empno,name,pay);
	}

	public int getMoneyPay() {
		int moneyPay = pay / 12;
		return moneyPay;
	}

	

	
	
	
}
