package com.dao.imp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.SpecialDao;
import com.entity.Special;
import com.sqlutil.DBUtil;

public class SpecialImp implements SpecialDao{

	
	public List<Special> getAllSpecial() {
		// TODO Auto-generated method stub
		String sql = "select * from [special] ";
		Connection conn = DBUtil.open();
		List<Special> special = new ArrayList<Special>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String id = rs.getString("id").trim();
				String name = rs.getString("name").trim();
				String img = rs.getString("img").trim();
				String price = rs.getString("price").trim();
				String type = rs.getString("type").trim();
				String location = rs.getString("location").trim();
				String description = rs.getString("description").trim();
				Special n = new Special(id, name, img,price,type,location,description);
				special.add(n);
			}
		}catch (Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return special;
	}

	@Override
	public boolean setSpecial(String id, String name, String img,String price,String type,String location,String description) {
		// TODO Auto-generated method stub
		return false;
	}





}
