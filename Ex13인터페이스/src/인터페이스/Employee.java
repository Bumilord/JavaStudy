package 인터페이스;

public abstract class Employee {
	
	protected String empno;
	protected String name;
	protected int pay;
		
	
	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public abstract int getMoneyPay();
	
	// print - 사번 : 이름 : 연봉 리턴
		public String print() {
			String print = empno+" : "+name+" : "+pay;
			return print;
		}
	

}
