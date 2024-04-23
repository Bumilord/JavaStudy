package 월급관리프로그램;

public class RegularEmployee extends Employee {

	
	private int bonus;
	
	// 생성자 메소드
	public RegularEmployee(String empno, String name, int pay, int bonus) {
		super(empno,name,pay);
		this.bonus = bonus;
	}

	// 월급여 계산 후 리턴
	public int getMoneyPay() {
		int moneyPay = (pay+bonus)/12;
		return moneyPay;
	}
	
	
	
	
	
	
	
	
	
	
}
