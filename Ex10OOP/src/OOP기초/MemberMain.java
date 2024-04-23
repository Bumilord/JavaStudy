package OOP기초;

public class MemberMain {
	// 실행할 수 있는 공간!!
	public static void main(String[] args) {
		// 1. 클래스 설계도면을 기반으로 객체를 생성
		// 자료형 변수명 = new 자료형();
		Member m1 = new Member();

		System.out.println(m1);
		System.out.println(m1.getName());
		// field에 아무런 값도 넣지 않았을 때는 기본값이 세팅된다.
		// String --> null
		// int --> 0

		m1.setName("문수현");
		System.out.println(m1.getName());

		// 나이, id
		m1.setAge(28);
		m1.setId("anstngus");

		System.out.println(m1.getAge());
		System.out.println(m1.getId());

		// 하나의 설계도로 여러개의 객체가 생성 가능!
		// 여러분 옆자리 친구의 정보를 저장하는
		// m2 이름의 객체를 생성, 안에 저장된 데이터 모두 출력

		Member m2 = new Member();

		m2.setName("윤아현");
		m2.setAge(24);
		m2.setId("zxcv4864");

		System.out.println(m2.getName());
		System.out.println(m2.getAge());
		System.out.println(m2.getId());

		m1.kakaoTalk("여러분 안녕!");

	
		//객체 생성과 동시에 필드를 초기화하는 방법!
		//이름 : 순이 나이 : 20 아이디 : tnsdl
		Member m3 = new Member("순이",20,"tnsdl");
		System.out.println(m3.getName());
		System.out.println(m3.getAge());
		System.out.println(m3.getId());
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
