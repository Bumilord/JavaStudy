package 월급관리프로그램;

public class EmployeeMain {

	public static void main(String[] args) {
		
		RegularEmployee r1 = new RegularEmployee("0001", "강예진", 5000, 500);
		System.out.println(r1.print());
		System.out.println(r1.getMoneyPay());
		
		TempEmployee t1 = new TempEmployee("0002", "임경남", 4000);
		System.out.println(t1.print());
		
		
		PartTimeEmployee p1 = new PartTimeEmployee("0003", "순이", 50, 20);
		System.out.println(p1.print());
		
		
		
		
		
		
	}

}
