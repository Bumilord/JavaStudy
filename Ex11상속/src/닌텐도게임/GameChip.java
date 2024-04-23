package 닌텐도게임;

public abstract class GameChip {
	// 닌텐도에 들어갈 수 있는 게임의 공통의 부모클래스
	// 1. 추상 클래스
	// - 추상메소드를 하나라도 가지고 있다면 반드시 추상클래스가 되어야한다.
	// - abstract 키워드를 사용해서 선언한다.
	// - 추상클래스도 일반메소드 가지고 있을 수 있다.
	
	public abstract void run();
	// 2. 추상메소드
	// - {}가 없는 메소드
	// 선언(틀 : 리턴타입, 매개변스, 메소드명)은 작성이 되어있으나
	//    로직이 구현되어 있지 않은 메소드
	// - abstract 키워드를 사용해서 선언한다.
	
	public void test() {
		System.out.println("테스트용 메소드");
	}
	
	
	

}
