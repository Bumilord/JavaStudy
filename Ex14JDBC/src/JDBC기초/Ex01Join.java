package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex01Join {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자 입출력 구간
		System.out.print("ID 입력 : ");
		String id = sc.next();

		System.out.print("PW 입력 : ");
		String pw = sc.next();

		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("나이 : ");
		int age = sc.nextInt();

		// JDBC(Java Database Connectivity)
		// : JDBC 인터페이스 사용
		// JDBC 등록 경로
		// C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib

		PreparedStatement psmt = null;
		Connection conn = null;
		try {
			// 1. 드라이버 로딩
			// JDBC 드라이버란?
			// : Java에서 제공해주는 인터페이스들을 데이터베이스 회사에서
			// 상속 받아서 로직을 구현한 클래스 파일들의 모음
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// --> 반드시 프로젝트에 jar 파일 넣어주기!
			// jar파일 등록!
			// 프로젝트 우클릭 -> build path -> configure build path
			// -> libraries 탭 선택 -> class path 선택
			// -> 우측에 add external jars(외부에 있는 파일이기 때문에) 버튼 선택
			// -> 원하는 jar파일 경로 찾아서 선택 --> apply and close

			// 2. 데이터베이스 연결
			// 준비물 3가지 필요!
			// 1) 연결 경로
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 2) user name
			String user = "hr";
			// 3) pass word
			String password = "12345";

			conn = DriverManager.getConnection(url, user, password);
			// Connection 이란?
			// :데이터베이스에 접속하기 위한 모든 메소드를 가진 인터페이스
			// --> 앞으로 DB와 하는 모든 통신은 conn을 통해서만 이루어짐!

			// DB 연결에 성공/실패 판별
			if (conn != null) {
				System.out.println("DB연결 성공!");
			} else {
				System.out.println("DB연결 실패!");
			}

			// 3. Query문(SQL구문) 전송
			// 3-1) SQL문 작성
			String sql = "INSERT INTO DATAMEMBER VALUES(?,?,?,?)";
			// ? 인자
			// : 사용자로부터 어떤 데이터가 들어올지 모를 때 사용
			// : 지정한 데이터 공간만큼 비워놓고 실행하기 전까지 대기하는 것
			
			// sql  -- Java 에서 인식 가능한 쿼리문이다.
			// conn.prepareStatement(sql) ==> DB에서도 인식가능하게끔 바꿔서 통로에 올려주겠다!
			psmt = conn.prepareStatement(sql);

			// ? 인자 채우는 작업 (!반드시 쿼리문 실행 전에 할 것!)
			// 데이터 바인딩 작업
			// 물음표 인덱스는 1번부터 시작!!
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			// 4. sql문 실행
			int row = psmt.executeUpdate(); // --> 실행
			// executeUpdate() : insert, delete, update에만 사용한다.

			// 5. 결과를 이용한 작업처리
			// : 사용자에게 회원가입에 성공했는지 실패했는지 보여주는 작업
			if (row > 0) {
				System.out.println("회원가입 성공! :) ");
			} else {
				System.out.println("회원가입 실패 :( ");
			}

		} catch (Exception e) {
			// 모든 예외상황 Exception 상속 받는다!
			// --> Exception e = new ClassNotFoundException();
			// --> Up캐스팅이 일어난다!

			e.printStackTrace();
			// 예외상황이 왜 발생했고, 어디서 문제가 났는지 출력해주는 코드
			// --> 개발할 때 사용, 배포할때는 삭제하는 것이 좋음

		} finally {
			// finally : 위쪽에서 예외상황이 발생하더라도 반드시 한번은 들어오는 구간
			// 6. DB 연결 종료 --> 자원 반납
			// *** 자원반납은 항상 사용한 순서의 반대로 반납한다! 통로 -> 수레 -> 연결 이면 수레 반납 -> 통로 반납
			try {
				if (psmt != null)
					psmt.close();

				if (conn != null)
					conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
