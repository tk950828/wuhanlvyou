package com.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.BeautifulDao;
import com.entity.Beautiful;
import com.sqlutil.DBUtil;

public class BeautifulImp implements BeautifulDao {

	@Override
	public List<Beautiful> getAllBeautiful() {
		// TODO Auto-generated method stub
		String sql = "select * from [beautiful] ";
		Connection conn = DBUtil.open();
		List<Beautiful> beautiful = new ArrayList<Beautiful>();
		Statement stmt;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String id = rs.getString("id").trim();
				String name= rs.getString("name").trim();
				String price = rs.getString("price").trim();
				String location = rs.getString("location").trim();
				String description = rs.getString("description").trim();
				String img = rs.getString("img").trim();
				String types = rs.getString("types").trim();
				Beautiful b = new Beautiful(id,name,price,location,description,img,types);
				beautiful.add(b);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return beautiful;
	}

	@Override
	public String getNameById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPrice(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getLocation(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescription(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getImg(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTypes(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean DelBeauById(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from [beautiful] where id = ?";
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

	@Override
	public boolean addBeau(Beautiful n) {
		// TODO Auto-generated method stub
		String sql = "insert into [beautiful] values(?,?,?,?,?,?,?)";
		Connection conn = DBUtil.open();
		boolean flag = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, n.getId());
			pstmt.setString(2, n.getName());
			pstmt.setString(3, n.getPrice());
			pstmt.setString(4, n.getLocation());
			pstmt.setString(5, n.getDescription());
			pstmt.setString(6, n.getImg());
			pstmt.setString(7, n.getTypes());
			int rs = pstmt.executeUpdate();
			flag = true;
			DBUtil.close(pstmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag = false;
		} finally {
			DBUtil.close(conn);
		}
		return flag;
	}

}
