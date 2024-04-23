package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DAO {
	// DAO : Data Access Object
	// DB에 관련된 기능들을 전부 가지고 있는 클래스

	Connection conn = null;
	PreparedStatement psmt = null;

	// 연결
	public void conn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			//우리팀 주소
			//jdbc:oracle:thin:project-db-campus.smhrd.com:1524:xe

			String user = "hr";
			//campus_24SW_DD_p1_1

			String password = "12345";
			//smhrd1

			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 닫기
	public void dbClose() {

		try {
			if (psmt != null)
				psmt.close();

			if (conn != null)
				conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 회원 가입 기능
	public int insertUser(String id, String pw, String name, int age) {
		String sql = "INSERT INTO DATAMEMBER VALUES(?,?,?,?)";
		int row = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;

	}

	// 로그인 기능
	public String loginUser(String inputId, String inputPw) {
		String sql = "select age, name from datamember where id = ? and pw = ?";
		ResultSet rs = null;
		// ResultSet : select 절을 통한 테이블 형식 데이터를 받아 올 수 있는 타입

		String name = "";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inputId);
			psmt.setString(2, inputPw);

			// executeQuery --> 쿼리문을 통해서 테이블에 있는 데이터에 영향을 끼치지 않을 때 사용 되어진다.
			rs = psmt.executeQuery();

			// rs.next() : 다음행에 데이터가 있는지 확인하는 기능
			if (rs.next()) {
				// rs.getString(2) : 결과데이터 중 두번째 컬럼에 있는 데이터를 문자열로 받아오겠다!
				name = rs.getString(2);
				// System.out.println("이름 출력 : "+name);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return name;

	}

	// 전체회원 조회
	public ArrayList<DTO> searchMember() {
		String sql = "select * from datamember";
		ResultSet rs = null;

		// 사용자정보 전부 Ex02회원관리로 넘기기
		// 힌트1. ArrayList
		// 힌트2. id, pw, name, age를 다룰 수 있는 class 생성
		DTO dto = null;

		// DTO를 담아줄 ArrayList 생성
		ArrayList<DTO> list = new ArrayList<DTO>();
		try {
			// 메소드 안에서 바로 DB연결
			conn();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {

				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				int age = rs.getInt(4);
				// 조회해온 결과(rs)에 담겨있는 데이터(id,pw,name,age)를 DTO에 옮겨서 하나로 묶어줌
				dto = new DTO(id, pw, name, age);

				// ArrayList를 이용해서 모든 회원을 하나로 묶어주기
				list.add(dto);

//				System.out.println("ID : " + id + " PW : " + pw + " NAME : " + name + " AGE : " + age);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			dbClose();
		}

		return list;

	}

	// 회원 정보 수정
	public int upDateUser(String name, String id) {
		String sql = "UPDATE DATAMEMBER SET NAME = ? WHERE ID = ?";
		int row = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			psmt.setString(2, id);

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;

	}

	// 회원 정보 삭제
	public int deleteUser(String id) {
		String sql = "DELETE FROM DATAMEMBER WHERE ID = ?";
		int row = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return row;

	}

}