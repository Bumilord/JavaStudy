package 메소드;

public class Ex01더하기 {

	public static void main(String[] args) {
		// 메소드 사용하기(main영역 안쪽에서 사용)
		// 메소드명(소괄호)
		double result = addDouble(4.2, 3.14);
		System.out.println(result);
		
		System.out.println(subNum(5, 5));
		
		
		printHello();
		
		
		

	}

	// 3. 리턴값이 없고, 매개변수도 없는 메소드 (리턴타입 자리에 void 키워드 작성)
	public static void printHello() {
		// void : 리턴값이 없을 때 리턴타입대신에 작성
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
	}
	
	
	
	
	// 2. 빼기 연산 메소드
	// 리턴타입: int , 매개변수: int 2개, 메소드명: subNum
	// 매개변수로 받아온 데이터 두개를 뺀 결과값을 돌려주는 메소드
	// 단, 큰수에서 작은수를 뺀 결과값 돌려주기
	
	public static int subNum(int num1, int num2) {
		int result = 0;
		result = num1>num2 ? num1-num2 : (num2-num1);
		return result;

	}
	
	// 다른 풀이
//	public static int subNum(int num1, int num2) {
//		int result = 0;
//		if (num1 > num2) {
//			result = num1 - num2;
//		} else {
//			result = num2 - num1;
//		}
//		return result;
//
//	}
	
	
	
	
	

	// 1. 메소드 생성(main영역 벗어나서 작성하기!)
	// 리턴타입 : double, 매개변수 : double 2개, 메소드명 : addDouble
	public static double addDouble(double num1, double num2) {
		// 메소드는 return 키워드를 만나면 데이터를 반환하고 끝난다.
		// 즉, return 키워드 위쪽에 코드 작성할것!
		double result = num1 + num2;
		return result;

	}

}
