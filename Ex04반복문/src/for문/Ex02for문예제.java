package for문;

public class Ex02for문예제 {

	public static void main(String[] args) {

		
		// for문을 사용해서 96에서 73까지 출력하기
		for(int i = 96 ; i>72 ; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		// 숫자들 중에서 홀수만 출력하기
		for(int i=95; i>72 ; i-=2 ) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		//다른 풀이
		for(int i = 96 ; i>72 ; i--) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		
		
		
		
		
		
		
		
	}

}
