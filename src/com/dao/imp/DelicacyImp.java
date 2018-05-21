package com.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



import com.dao.DelicacyDao;
import com.entity.Delicacy;
import com.sqlutil.DBUtil;


public  class DelicacyImp implements DelicacyDao {


	public List<Delicacy> getAllDelicacy() {
		// TODO Auto-generated method stub
		String sql = "select * from [delicacy] ";
		Connection conn = DBUtil.open();
		List<Delicacy> delicacy = new ArrayList<Delicacy>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String id = rs.getString("id").trim();
				String name = rs.getString("name").trim();
				String img = rs.getString("img").trim();
				String price = rs.getString("price").trim();
				String type = rs.getString("types").trim();
				String location = rs.getString("location").trim();
				String description = rs.getString("description").trim();
				Delicacy n = new Delicacy(id, name, img,price,type,location,description);
				delicacy.add(n);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return delicacy;
	}

	@Override
	public boolean setDelicacy(String id, String name, String img,String price,String type,String location,String description) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delicacyDel(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from [delicacy] where id = ?";
		Connection conn = DBUtil.open();
		boolean flag = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.executeUpdate();
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
