package 월급관리프로그램;

public class PartTimeEmployee extends Employee {


	private int workDay;
	
	
	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno,name,pay);
		this.workDay = workDay;
	}
	
	public int getMoneyPay() {
		int moneyPay = pay*workDay;
		return moneyPay;
	}
	

	
	
	
	
	
	
}
