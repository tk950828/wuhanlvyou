package com.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.LeaveDao;
import com.entity.Beautiful;
import com.entity.LeaveMessage;
import com.sqlutil.DBUtil;

public class LeaveImp implements LeaveDao {

	@Override
	public boolean insertLeaveMessage(String user, String phone, String sex,
			String message) {
		// TODO Auto-generated method stub
		String sql = "insert into leavemessage values(?,?,?,?,?)";
		Connection conn = DBUtil.open();
		boolean flag = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user);
			pstmt.setString(2, phone);
			pstmt.setString(3, sex);
			pstmt.setString(4, message);
			pstmt.setString(5, "");
			pstmt.executeUpdate();
			DBUtil.close(pstmt);
			flag = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			DBUtil.close(conn);
		}
		return flag;
	}

	@Override
	public List<LeaveMessage> getAllmessage() {
		// TODO Auto-generated method stub
		String sql = "select * from [leavemessage] ";
		Connection conn = DBUtil.open();
		List<LeaveMessage> LeaveMessage = new ArrayList<LeaveMessage>();
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String id = rs.getString(1).trim();
				String user= rs.getString(2).trim();
				String phone = rs.getString(3).trim();
				String sex = rs.getString(4).trim();
				String message = rs.getString(5).trim();
				LeaveMessage b = new LeaveMessage(id,user,phone,sex,message);
				LeaveMessage.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return LeaveMessage;
	}

	@Override
	public boolean delMessage(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from [leavemessage] where leaveid = ?";
		Connection conn = DBUtil.open();
		boolean flag = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeQuery();
			flag = true;
			DBUtil.close(pstmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		}  finally {
			DBUtil.close(conn);
		}
		return flag;
	}

}
