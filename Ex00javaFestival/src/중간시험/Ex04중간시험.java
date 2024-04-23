package 중간시험;

public class Ex04중간시험 {

	public static void main(String[] args) {
		

		
		int sum = 0;
		for(int num = 1; num<101 ; num++) {
			
			if(num%2==0) {
				sum -= num;
				System.out.print(-num + " ");
				
			}else {
				sum += num;
				System.out.print(num + " ");
			}
		}
		System.out.println();
		System.out.println("결과 : " + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
