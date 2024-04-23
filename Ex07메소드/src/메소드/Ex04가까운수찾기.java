package 메소드;

import java.util.Scanner;

public class Ex04가까운수찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 입력 : ");
		int num2 = sc.nextInt();
		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);
		
		

	}

	private static int close10(int num1, int num2) {
		// ex) 5와 9를 봤을 때 10에 가까운 수를 찾기 위해서는
		// 10-5=5 / 10-9=1 ---> 결과값이 더 작은수가 10과 가깝다고 판단!
		// 11과 15중에 10에 가까운수를 찾으려고
		// 10-11=-1 / 10-15=-5 ---> 더 작은수가 10과 가깝다고 판단XXXX

		// -1, -5에서 -를 뗄 수 있는 방법은?
		// 1) 큰수에서 작은수를 빼는 방법(if문이 많아진다)
		// 2) 제곱 ---> -1*-1 = 1 / -5*-5 = 25

		// 1. 자바에서 제곱 만드는 방법
		// if((10-num1)*(10-num1)) < (10-num2)*(10-num2)) {
		// 2. 절대값 구하는 방법
		// if(Math.abs(10-num1) < Math.abs(10-num2) {
		
		int result = 0;
		// 더 간단한 풀이
		// if((10-num1)*(10-num1)) < (10-num2)*(10-num2)) {
		// result = num1;
		// } else if((10-num1)*(10-num1)) > (10-num2)*(10-num2)) {
		// result = num2;
		// } else {
		// result = 0;
		// }

		int dis1 = 10 - num1;
		int dis2 = 10 - num2;
		// 10과의 거리는 음수가 나오면 안되기 때문에 양수가 되는 조건식 작성
		if (dis1 < 0) {
			dis1 *= -1;
		}
		if (dis2 < 0) {
			dis2 *= -1;
		}

		if (dis1 > dis2) {
			result = num2;
		} else if (dis1 < dis2) {
			result = num1;
		} else {
			result = 0;
		}

		return result;

		
		
	}

}
