package com.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.NewDao;
import com.entity.HistoryMessage;
import com.entity.News;
import com.sqlutil.DBUtil;

public class NewImp implements NewDao {

	@Override
	public String getUserById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNewsText(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNewsDate(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean setNews(String id, String user, String newsText,
			String newsDate, String url) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<News> getAllNews() {
		// TODO Auto-generated method stub
		String sql = "select * from [news] ";
		Connection conn = DBUtil.open();
		List<News> news = new ArrayList<News>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String id = rs.getString("id").trim();
				String user = rs.getString("upuser").trim();
				String newstext = rs.getString("newstext").trim();
				String newsdate = rs.getString("newsdate").trim();
				String url = rs.getString("url");
				News n = new News(id, user, newstext, newsdate, url);
				news.add(n);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			DBUtil.close(conn);
		}
		return news;
	}

	@Override
	public News getNewsById(String id) {
		// TODO Auto-generated method stub
		String sql = "select * from [news] where id = ?";
		Connection conn = DBUtil.open();
		News n = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				String newstext = rs.getString("newstext").trim();
				String user = rs.getString("upuser").trim();
				String date = rs.getString("newsdate").trim();
				String detail = rs.getString("detail").trim();
				n = new News(user,newstext,date,detail);
				n.setId(id);
			}
			DBUtil.close(pstmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  finally {
			DBUtil.close(conn);
		}
		return n;
	}

	@Override
	public List<News> getNewsList(int pageSize, int pageIndex) {
		// TODO Auto-generated method stub
		String max = pageSize*pageIndex +"";
		String min = (pageIndex-1)*pageSize + 1 + "";
//		System.out.println(max+min);
		String sql = "SELECT * FROM [news] where id between "+min+" and "+max+"";
		Connection conn = DBUtil.open();
		List<News> news = new ArrayList<News>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				String id = rs.getString("id").trim();
				String user = rs.getString("upuser").trim();
				String newstext = rs.getString("newstext").trim();
				String newsdate = rs.getString("newsdate").trim();
				String url = rs.getString("url");
				News n = new News(id, user, newstext, newsdate, url);
				news.add(n);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
			DBUtil.close(conn);
		}
		return news;
	}
	
	@Override
	public int getNewsCount() {
		// TODO Auto-generated method stub
		String sql = "SELECT COUNT(*) FROM [news] ";
		Connection conn = DBUtil.open();
		Statement stmt;
		int count = -1;
		try {
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()){
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return count;
	}
	
	@Override
	public boolean DelNewsById(String id) {
		// TODO Auto-generated method stub
		String sql = "delete from [news] where id = ?";
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
	public boolean addNews(News n) {
		// TODO Auto-generated method stub
		String sql = "insert into [news] values(?,?,?,?,?,?,?)";
		Connection conn = DBUtil.open();
		boolean flag = false;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, n.getId());
			pstmt.setString(2, n.getUser());
			pstmt.setString(3, n.getNewsText());
			pstmt.setString(4, n.getNewsDate());
			pstmt.setString(5, "01.html");
			pstmt.setString(6, n.getDetail());
			pstmt.setString(7, "");
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
