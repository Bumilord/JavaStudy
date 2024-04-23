package JDBC보충;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PhoneDAO {
   //dao - data access object
   //     데이터 접근 객체
   
   // 클래스 필드(변수)랑 메소드
   
   Connection conn;
   
   public void getConn() {
      try {
    	  // 2. 연결준비
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         
         String user = "hr";
         String pw = "hr";
         String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
         
         //지역변수 -> 전역변수로
         conn = DriverManager.getConnection(url, user, pw);
         
         if(conn != null) {
            System.out.println("연결성공");
         }else {
            System.out.println("연결 실패");
         }
         
         
         
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      }
      
      
   }

   
   //전화번호 추가 기능
   public void insertPhone(String name, String phone_num, int age) {
      
      getConn();
      
      //쿼리문 작성
      String sql = "insert into phone values(?,?,?)";
      
      //쿼리문이 지나 갈 수 있는 통로 - preparedStatement
      // connection
      try {
         PreparedStatement psmt = conn.prepareStatement(sql);
         
         psmt.setString(1, name);
         psmt.setString(2, phone_num);
         psmt.setInt(3, age);
         
         
         int row = psmt.executeUpdate(); // 실행된 행의 개수
         
         if(row>0) {
            System.out.println("insert success");
         }else {
            System.out.println("insert fail...");
         }
         
         
      } catch (SQLException e) {
         e.printStackTrace();
      }
      
      
      
      
   }
   
   
   
   
   
   
}