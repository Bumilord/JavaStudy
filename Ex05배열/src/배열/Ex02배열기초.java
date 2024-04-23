package 배열;

public class Ex02배열기초 {

	public static void main(String[] args) {

		int[] numbers = new int[5];

		// 배열의 길이
		// 변수명.length;
		int length = numbers.length;
		System.out.println("배열의 길이 : " + length);

		// 배열의 각 칸을 5의 배수로 초기화하세요.
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = numbers.length * (i + 1);

			// 5라는 숫자는 배열의 길이와 같다.
			
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + "\t");
		}
		// 띄어쓰기 대신에 공간을 두기 위해서 역슬래시(enter위에 원화기호)와 탭(Tab)의 약자 t를 같이 넣는다.
		
		System.out.println();
		
		// 배열을 생성함과 동시에 데이터를 집어넣는 방법
		String[] names = {"문수현", "강예진", "조준용"};
		// 강예진 데이터 출력하기
		System.out.println(names[1]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	}

}
