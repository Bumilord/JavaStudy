package 객체배열;

public class PersonMain {

	public static void main(String[] args) {

		Person p1 = new Person("문수현",28);
		Person p2 = new Person("순이",7);
		
		
		//Person 타입의 객체 2개를 저장할 수 있는 배열을 생성
		Person[] arrPerson = new Person[2];
		
		arrPerson[0] = p1;  // 객체가 저장되는 게 아니고 객체를 찾아갈 수 있는 참조값만 저장이 됨
		arrPerson[1] = p2;
		
		System.out.println(arrPerson[0].getName());
		System.out.println(arrPerson[0].getAge());
		
		// 0번과 1번에 저장되어있는 Person의 이름과 나이
		// ~(이름)의 나이는 ~~입니다. 
		// 반복문 사용
		
		for(int i = 0 ; i < arrPerson.length; i++) {
		System.out.println(arrPerson[i].getName()+"의 나이는 "+arrPerson[i].getAge()+"입니다.");
		}
		
		
		
		
	}

}
