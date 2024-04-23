package 닌텐도게임;

public class GameMain {

	public static void main(String[] args) {
		// 게임을 실행 할 공간
		
		//게임 칩 가져오기
		DongGame d = new DongGame();
		// 게임칩 끼워서 실행하기
		insert(d);
		
		PokemonGame p = new PokemonGame();
		insert(p);
		
		
		MarioGame m = new MarioGame();
		insert(m);
		
		
	}
	// 게입칩을 끼워서 실행하는 기능
	private static void insert(GameChip game) {
		// 모든 게입칩들(PokemonGame, MarioGame)들은 DongGame을 상속 받아
		// DongGame 자료형으로 자동 형변환이 가능!
		// DongGame game = new PokemonGame();
		// DongGame game = MarioGame();
		// DongGame game = DongGame();
		
		game.run();
	}
	
	
	
	
	// 메소드 오버로딩 기법으로 해결하는 방법
//	private static void insert(MarioGame m) {
//		m.run();
//	}
//
//	private static void insert(PokemonGame p) {
//		p.run();
//	}
	
	
	
	
	
}
