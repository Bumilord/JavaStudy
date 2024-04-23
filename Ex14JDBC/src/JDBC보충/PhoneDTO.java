package JDBC보충;

public class PhoneDTO {

	   //date transfer object
	   //데이터 변환 객체
	   //주로 데이터베이스의 컬럼과 맞춰서 작성
	   // 필드 - 캡슐화- 외부로부터 함부로 접근x
	   
	   private String name;
	   private String phone_num;
	   private int age;
	   
	   
	   
	   // 생성자 - 생성할때 실행되는 코드
	   // 생성자는 클래스명과 똑같이 생겼다.
	   public PhoneDTO(String name, String phone_num, int age) {
	      super();
	      this.name = name;
	      this.phone_num = phone_num;
	      this.age = age;
	   }
	   
	   
	   
	   public String getName() {
	      return name;

	   }
}