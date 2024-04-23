package OOP기초;

public class Member {
	// 나만의 자료형 설계도!!
	// main method 포함 XXX
	
	// OOP(Object Oriented Programming)
	
	// 1. Field(Data, 속성)
	// 이름
	// 접근제한자는 : private default protected public
	// private : 현재 클래스 안에서만 접근가능
	// default : 같은 패키지 안에서만 접근가능
	// protected : 같은 패키지 안에 있거나 상속관계에 있는 경우 접근가능
	// public : 어디에서든 접근 가능 => 아무나 접근해서 값을 변경 혹은 사용할 수 있음
	//접근제한자를 따로 작성하지 않으면 default
	
	private String name;
	// 나이
	private int age;
	// 아이디
	private String id;
	
	
	// 2. method(Logic, 행위, 기능)
	
	// +필수 메서드 => 생성자(constructor)
	//접근제한자 메서드이름(클래스 이름과 동일하게)(매개변수){필드초기화구문}
	//객체 생성시 사용하는 메서드
	public Member(String name, int age, String id) {
		//초기화구문
		this.name = name;
		this.age = age;
		this.id = id;
	}
	//매개변수가 들어가지 않고 로직이 따로 없는 구조 => 기본 생성자
	//클래스안에 생성자를 아무것도 작성하지 않았을 경우에는 컴파일 시 컴파일러가 자동으로 생성
	public Member() {
		
	}
	
	
	//각 필드에 접근할 수 있는 메서드(규칙) => getter 메서드
	//필드 하나하나 따로 접근가능
	//접근제한자 데이터타입 메소드이름
	public String getName() {
		return name;
	}
	
	//alt+shift+s
	public int getAge() {
		return age;
	}
	
	public String getId() {
		return id;
	}
	
	// 각 필드에 저장된 값을 수정 or 초기화 하는 메서드
	// => setter 메서드
	//접근제한자 반환타입(void) 메소드명(수정할 값을 작성-매개변수){
	//  필드 = 수정할 값 }
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	
	
	// 카카오톡 메세지 보내기
	public void kakaoTalk(String msg) {
		System.out.println(name+"님이 "+ msg +"를 전송합니다.");
	}
	
	// 기프티콘 보내기
	public void gift() {
		System.out.println(name+"님이 선물을 보냅니다.");
	}
	
	
	
	
	
	
	

}
