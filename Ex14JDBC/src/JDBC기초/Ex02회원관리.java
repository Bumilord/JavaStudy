package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex02회원관리 {

	public static void main(String[] args) {
		// 디자인 패턴 : 계속해서 같은 문제가 발생해서, 이런 문제를 해결하고자
		//            형식, 규칙을 지정해놓은 것
		// MVC 패턴
		// Model : 데이터를 조작, 저장하기 위한 코드들의 모음 (ex.DTO)
		// View : 사용자에게 직접 보여지는 부분  (ex.회원관리)
		// Controller : 실제 기능이 일어나는 부분 (ex.DAO)
		
		
		DAO dao = new DAO();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1.로그인 2.회원가입 3.회원전체 조회 4.회원정보 수정 5.회원삭제 6.프로그램 종료");
			int menu = sc.nextInt();

			if (menu == 1) {
				// 로그인
				try {
					System.out.print("로그인할 ID입력 >> ");
					String inputId = sc.next();
					System.out.print("로그인할 PW입력 >> ");
					String inputPw = sc.next();

					dao.conn();

					// 2. 로그인 쿼리문 실행
					// select name from datamember where id = ? and pw = ?
					// ooo님 환영합니다.

					String name = dao.loginUser(inputId, inputPw);
					// name == "" 로그인실패
					// name != "" 로그인성공
					if (name.equals("")) {
						System.out.println("로그인 실패");
					} else {
						System.out.println("로그인 성공");
						System.out.println(name + "님 환영합니다");
					}

				} catch (Exception e) {

				} finally {
					dao.dbClose();
				}

			} else if (menu == 2) {
				// 회원가입
				try {
					System.out.print("ID 입력 : ");
					String id = sc.next();

					System.out.print("PW 입력 : ");
					String pw = sc.next();

					System.out.print("이름 : ");
					String name = sc.next();

					System.out.print("나이 : ");
					int age = sc.nextInt();

					dao.conn();

					int row = dao.insertUser(id, pw, name, age);

					if (row > 0) {
						System.out.println("회원가입 성공! :) ");
					} else {
						System.out.println("회원가입 실패 :( ");
					}
				} catch (Exception e) {

				} finally {
					dao.dbClose();
				}

			} else if (menu == 3) {
				// 회원전체 조회
				try {
					// select * from datamember

					ArrayList<DTO> resultList = dao.searchMember();
					System.out.println("ID \t PW \t NAME \t AGE");

					for (DTO d : resultList) {
						System.out.print(d.getId() + "\t");
						System.out.print(d.getPw() + "\t");
						System.out.print(d.getName() + "\t");
						System.out.println(d.getAge());
					}
				} catch (Exception e) {

				}

			} else if (menu == 4) {
				// 회원정보 수정 --> UPDATE구문
				// 회원 아이디를 입력받아서 회원의 name을 수정해주세요
				System.out.print("변경시킬 회원 ID 입력 : ");
				String id = sc.next();

				System.out.print("변경할 이름 입력 : ");
				String name = sc.next();

				// DB에 접근해서 id를 가진 회원의 name을 다른 name으로 바꿔주기!
				try {
					dao.conn();

					// 2. 통로 안에 쿼리문을 실행시키기
					int row = dao.upDateUser(name, id);

					if (row > 0) {
						System.out.println("정보 수정 성공! :) ");
					} else {
						System.out.println("정보 변경 실패 :( ");
					}

				} catch (Exception e) {
					e.printStackTrace();

					// 3. 연결정보 닫아주기!!(역순으로)
				} finally {
					dao.dbClose();

				}

			} else if (menu == 5) {
				// 회원삭제
				System.out.print("삭제할 회원 ID 입력 : ");
				String id = sc.next();

				try {
					dao.conn();
					int row = dao.deleteUser(id);

					if (row > 0) {
						System.out.println("삭제 성공! :) ");
					} else {
						System.out.println("삭제 실패 :( ");
					}

				} catch (Exception e) {
					e.printStackTrace();

					// 3. 연결정보 닫아주기!!(역순으로)
				} finally {
					dao.dbClose();

				}

			} else if (menu == 6) {
				// 프로그램 종료
				break;
			}

		}

	}

}
