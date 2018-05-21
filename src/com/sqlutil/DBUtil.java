package com.sqlutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
	
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	static{	
		driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=demo";
		username = "sa";
		password = "123456";
	}
	
	public static Connection open(){
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url, username, password);
			System.out.println("connect success");  
			return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(PreparedStatement pstmt){
		if(pstmt!=null){
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
