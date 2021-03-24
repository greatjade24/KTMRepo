package db.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import db.conn.DBConn;

public class DBinsert {
	
	public void doInsert(Map<String, String> pMap) {
		
		try {
			
			// 오라클 접속하기
			Connection conn = DBConn.getDBConnection();
			
			// 오라클에 SQL쿼리를 전달하기 위한 객체
			PreparedStatement pstmt = null;
			
			// SQL 선언
			String sql = "INSERT INTO USER_INFO(USER_ID, USER_NM, EMAIL, ADDR) VALUES (";
			sql += "?, ";
			sql += "?, ";
			sql += "?, ";
			sql += "?) ";
		
			// 오라클에 전달될 SQL 쿼리를 저장하기
			pstmt = conn.prepareStatement(sql);
			
			int idx = 0; // ? 순번을 지정하기 위한 변수
			
			// 전달받는 pMap 객체의 값과 SQL 쿼리의 ?와 대입하기
			
			String user_id = pMap.get("user_id");
			System.out.println("전달받은 user_id :" + user_id);
			pstmt.setString(++idx, user_id); // 첫번쨰 ?
			
			String user_nm = pMap.get("user_nm");
			System.out.println("전달받은 user_nm :" + user_nm);
			pstmt.setString(++idx, user_nm); // 두번째 ?
			
			String email = pMap.get("email");
			System.out.println("전달받은 email :" + email);
			pstmt.setString(++idx, email); // 세번쨰 ?
			
			String addr = pMap.get("addr");
			System.out.println("전달받은 addr :" + addr);
			pstmt.setString(++idx, addr); // 네번쨰 ?
			
			// insert 쿼리 실행
			int res = pstmt.executeUpdate();
			
			if(res > 0) {
				System.out.println("데이터 등록 성공!");
			} else {
				System.out.println("데이터 등록 실패!");
			}
			
			pstmt = null;
			
			// 오라클 DB 접속 종료
			DBConn.DBClose(conn);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		}
}
