package com.bookService.dao;

import java.sql.*;
import com.bookService.bean.BookBean;

public class BookDAO {
	
	private static BookDAO dao = new BookDAO();
	private BookDAO() {}
	public static BookDAO getInstance() {
		return dao;
	}
	public Connection connect() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/webdb?serverTimezone=UTC","root","1234567890");
		} catch (Exception e) {
			System.out.println("���� �߻� : "+e);
		}
		return conn;
	}
	
	public void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			}catch (Exception e) {
				System.out.println("���� �߻� : "+e);
			}
		}
		close(conn,ps);
	}
	
	public void close(Connection conn, PreparedStatement ps) {
		if(ps!=null) {
			try {
				ps.close();
			} catch (Exception e) {
				System.out.println("���� �߻� : "+e);
			}
		}
		if(conn !=null) {
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println("���� �߻� : "+e);
			}
		}
	}
	
	public void bookInsert(BookBean book) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn=connect();
			pstmt = conn.prepareStatement("insert into book values(?,?,?,?,?,?)");
			pstmt.setInt(1, book.getID());
			pstmt.setString(2,book.getName());
			pstmt.setString(3, book.getAuthor());
			pstmt.setInt(4, book.getPrice());
			pstmt.setBoolean(5, false);
			pstmt.setInt(6, 0);
			pstmt.executeUpdate();
		}catch (Exception e) {
			System.out.println("���� �߻� : "+e);
		}finally {
			close(conn,pstmt);
		}
	}
}
