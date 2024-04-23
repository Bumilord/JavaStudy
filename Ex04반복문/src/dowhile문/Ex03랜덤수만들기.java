package dowhile문;

import java.util.Random;

public class Ex03랜덤수만들기 {

	public static void main(String[] args) {

		// 랜덤 수를 뽑아내는 방법
		// 1. 랜덤한 수를 추출해오는 도구 꺼내오기
		Random ran = new Random();
		// 2. 랜덤한 수 생성하는 코드작성
		// 1~9까지 추출
		//()괄호 안에 추출하고 싶은 숫자의 갯수를 적으면 범위지정 가능
		// 0부터 시작해서 추출하고 싶은 숫자의 갯수를 적기
		// 0부터 시작하기 때문에 +1을 작성함
		int ranNum = ran.nextInt(9)+1;
		System.out.println(ranNum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
