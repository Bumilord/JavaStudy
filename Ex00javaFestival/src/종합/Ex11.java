package 종합;

public class Ex11 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 3;
		boolean result = isDivide(num1, num2);
		System.out.println("결과확인 : "+ result);
		
		
		
		
		
		
		
		
		

	}

	private static boolean isDivide(int num1, int num2) {
		boolean result = false ;
		
		if(num1%num2 == 0) {
			result = true;
			
		}
		
		return result;
	}

}
