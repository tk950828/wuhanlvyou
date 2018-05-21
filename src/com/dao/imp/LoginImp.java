package com.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dao.LoginDao;
import com.entity.LeaveMessage;
import com.sqlutil.DBUtil;

public class LoginImp implements LoginDao {

	@Override
	public boolean isUserExisted(String user, String psw) {
		// TODO Auto-generated method stub
		String sql = "select * from [user] where id = ? and psw = ?";
		Connection conn = DBUtil.open();
		boolean flag = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user);
			pstmt.setString(2, psw);
			pstmt.executeQuery();
			
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

}
