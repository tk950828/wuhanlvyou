package com.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.historicDao;
import com.entity.HistoryMessage;
import com.entity.News;
import com.sqlutil.DBUtil;

public class HistoricImp implements historicDao {

	@Override
	public HistoryMessage getMessageById(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from [historic] where id = ?";
		Connection conn = DBUtil.open();
		HistoryMessage h = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				String title = rs.getString("title").trim();
				String user = rs.getString("upuser").trim();
				String date = rs.getString("date").trim();
				String text = rs.getString("text").trim();
				h = new HistoryMessage(title,user,date,text);
			}
			DBUtil.close(pstmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.close(conn);
		}
		return h;
	}

	@Override
	public boolean insertMessage(int id, String title, String user,
			String date, String text) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delMessageById(int id) {
		// TODO Auto-generated method stub
		String sql = "delete from [historic] where id = ?";
		Connection conn = DBUtil.open();
		boolean flag = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
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
	public boolean addHistory(HistoryMessage h) {
		// TODO Auto-generated method stub
		String sql = "insert into [historic] values(?,?,?,?,?,?)";
		Connection conn = DBUtil.open();
		boolean flag = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, h.getId());
			pstmt.setString(2, h.getTitle());
			pstmt.setString(3, h.getUser());
			pstmt.setString(4, h.getDate());
			pstmt.setString(5, h.getText());
			pstmt.setString(6, "");
			pstmt.executeUpdate();
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

	@Override
	public List<HistoryMessage> getAllMessage() {
		// TODO Auto-generated method stub
		String sql = "select * from [historic] ";
		Connection conn = DBUtil.open();
		List<HistoryMessage> h = new ArrayList<HistoryMessage>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String id = rs.getString("id").trim();
				String title = rs.getString("title").trim();
				String user = rs.getString("upuser").trim();
				String date = rs.getString("date").trim();
				String text = rs.getString("text").trim();
				HistoryMessage n = new HistoryMessage(id, user, title, date, text);
				h.add(n);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			DBUtil.close(conn);
		}
		return h;
	}

}
