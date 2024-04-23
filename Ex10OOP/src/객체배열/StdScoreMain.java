package 객체배열;

import java.util.Scanner;

public class StdScoreMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StdScore[] stdArr = new StdScore[3];
		
	
		
		for(int i = 0 ; i < stdArr.length ; i++){
			System.out.print(i+1+"번째 학생의 이름을 입력하세요. >> ");
			String name = sc.next();
			System.out.print(i+1+"번째 학생의 Java점수를 입력하세요. >> ");
			int scoreJava = sc.nextInt();
			System.out.print(i+1+"번째 학생의 Web점수를 입력하세요. >> ");
			int scoreWeb = sc.nextInt();
			System.out.print(i+1+"번째 학생의 Android점수를 입력하세요. >> ");
			int scoreAndroid = sc.nextInt();
			System.out.println();
			
			//배열에 저장
			stdArr[i] = new StdScore(name, scoreJava, scoreWeb, scoreAndroid);
			
		}
			
		for(StdScore s:stdArr) {
		int total = s.getScoreJava()+s.getScoreWeb()+s.getScoreAndroid();
		int avg = total/3;
		

		System.out.println(s.getName()+"님의 총점은 "+total+"점, "+"평균은 "+avg+"점 입니다.");
		
		
		}
	}

}
