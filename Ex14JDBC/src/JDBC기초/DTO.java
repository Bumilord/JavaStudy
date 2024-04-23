package JDBC기초;

public class DTO {

	// Data Transfer Object : 데이터를 이동할 수 있게 하는 나만의 자료형

	// 1. 필드
	// Table 마다 한개씩 생성
	// DB에 있는 Table의 컬럼을 필드로 가진다.
	private String id;
	private String pw;
	private String name;
	private int age;

	// 2. 메소드
	public DTO(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
