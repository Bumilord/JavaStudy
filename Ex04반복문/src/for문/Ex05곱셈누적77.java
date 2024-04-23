package for문;

public class Ex05곱셈누적77 {

	public static void main(String[] args) {

		// for문
		// for(초기화구문 ; 검사조건 ; 반복 후 작업){
		// 실행문장
		// }
		// 초기화 구문은 맨 처음에만 적용됨

		int j = 1;
		int sum = 0;

		// i : 앞자리 수(77~1)
		for (int i = 77; i > 0; i--) {
			sum += i * j;  
			// sum = sum + (i*j)
			
			j++;   // j : 뒷자리 수(1~77)

		}
		System.out.println(sum);

		
		
		
		
		
		
	}

}
