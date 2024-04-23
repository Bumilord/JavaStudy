package arraylist;

import java.util.ArrayList;

public class Ex01ArrayList활용 {

	public static void main(String[] args) {
		
		//1. ArrayList 생성
		//                      <데이터타입>(ArrayList의 기본 크기, 생략 시 크기 10으로 지정됨)
		
		//ArrayList<데이터타입(필수작성)> 변수명 = new ArrayList<데이터 타입>();
		ArrayList<String> al = new ArrayList<String>();
		
		//2. 데이터 삽입(맨 뒤에 추가)
		al.add("Hello");
		al.add("Java");
		al.add("Database");
		
		
		//3. 데이터의 개수 확인
		int size = al.size();
		System.out.println("데이터 개수 : "+size);
		
		
		//4. 데이터 삽입(중간에 (특정 인덱스에) 추가)
		al.add(2, "Python");
		System.out.println("데이터 개수 : "+ al.size());
		
		// al.add(5, "Javascript"); 
		// size 보다 큰 위치에는 추가 불가능
		// 4 인덱스가 비어있는 상태로 다음 인덱스에 데이터를 넣을 수 없음
		
		//5. 특정 위치(인덱스)의 데이터 가져오기
		String data0 = al.get(0);   //  -> 변수에 담는 방법
		System.out.println(data0);
		
		String data1 = al.get(1);
		System.out.println(data1);
		
		System.out.println(al.get(2));  //  -> 출력문에 바로 작성
		System.out.println(al.get(3));
		// 데이터를 가져오는건 그냥 가져오는 것이기 때문에
		// 출력을 위해서는 변수에 담아주거나 출력문 안에 작성해야 한다.
		
		//System.out.println(al.get(4));  범위 벗어남, 오류.
		
		
		// 일반 for문으로 묶기
		for(int i = 0; i < al.size() ; i++) {
			System.out.println(al.get(i));
		}
		
		// for~each문 : 배열, arraylist (순서가 있는 자료 구조) 다룰 때 사용
		// 0번 인덱스의 데이터부터 차례대로 꺼내주는 형태
		// for(ArrayList안의 데이터를 가지고 오는데 필요한 변수이름을 작성 : arrayList(배열) 레퍼런스 변수이름)
	
		for(String s :al) {
			System.out.println(s);
		}
		
		int[] arr = {1,2,3,4};
		for(int i:arr) {
			System.out.println(i);
		}
		
		//6. 데이터 삭제(특정 위치 데이터 삭제)
		al.remove(1);
		for(String s :al) {
			System.out.println(s);
		}
		
		//7. 데이터 삭제(전부 삭제)
		al.clear();
		System.out.println(al.size());
		
		
		
		
		
		
		
		
	}

}
