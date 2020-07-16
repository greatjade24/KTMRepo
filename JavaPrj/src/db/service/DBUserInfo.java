package db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.conn.DBConn;

public class DBUserInfo {

   public List<Map<String, String>> getUserInfo() {
      
      // DB조회 결과를 저장하기 위한 List와 Map을 활용한 데이터 구조
      List<Map<String, String>> rList = null;
      
      try {
         
         // 오라클 접속하기
         Connection conn = DBConn.getDBConnection();
         
         // 오라클에 SQL쿼리를 전달하기 위해 객체
         PreparedStatement pstmt = null;
         
         // SQL 선언
         String sql = "SELECT USER_ID, USER_NM, EMAIL, ADDR, REG_DT FROM USER_INFO";
         
         // 오라클에 전달될 SQL 쿼리를 저장하기
         pstmt = conn.prepareStatement(sql);
         
         // SQL 조회 쿼리를 실행하고, rs 변수에 결과를 저장하기
         // ResultSet 객체는 Map 자료 구조(키와 값으로 구성)를 오라클에 적합하도록 구현한 자바 객체
         // ResultSet 객체는 DB로부터 출력되는 레코드의 수가 2개이상이면, 자동으로 List배열에 Map 구조를 저장함
         ResultSet rs = pstmt.executeQuery(sql);
         
         // 테이블 조회 결과를 저장하기 위한 데이터 구조를 메모리에 올리기
         rList = new ArrayList<Map<String, String>>();
         
         while (rs.next()) {
            
            // 테이블의 레코드 한줄마다 rMap 객체에 저장
            Map<String, String> rMap = new HashMap<String, String>();
            
            // 회원 아이디
            String user_id = rs.getString("USER_ID");
            System.out.println("user_id : " + user_id);
            
            rMap.put("user_id", user_id);
            
            // 회원 이름
            String user_nm = rs.getString("User_NM");
            System.out.println("user_nm : " + user_nm);
            
            rMap.put("user_nm", user_nm);
            
            // 이메일주소
            String email = rs.getString("EMAIL");
            System.out.println("email : " + email);
            
            rMap.put("email", email);
            
            // 집주소
            String addr = rs.getString("ADDR");
            System.out.println("addr : " + addr);
            
            rMap.put("addr", addr);
            
            // 회원 가입일
            String reg_dt = rs.getString("REG_DT");
            System.out.println("reg_dt : " + reg_dt);
            
            rMap.put("reg_dt", reg_dt);
            
            rList.add(rMap);
            
            //사용이 끝나면 메모리 비우기
            rMap = null;
         }
         
         // 오라클로부터 전달받은 결과는 사용이 끝나면 메모리를 해제해야함
         // 해제하지 않으면 오라클 DB에 계속 연결이 유지되고 있어 DB의 성능이 떨어짐
         rs.close();
         
         // 오라클 DB 접속 종료
         DBConn.DBClose(conn);
         
      } catch (Exception e) {
         System.out.println(e.toString());
      }
      
      return rList;
      
   }
}