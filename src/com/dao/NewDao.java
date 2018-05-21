package com.dao;

import java.util.List;

import com.entity.News;

public interface NewDao {
	public String getUserById(String id);
	public String getNewsText(String id);
	public String getNewsDate(String id);
	public boolean setNews(String id,String user,String newsText,String newsDate,String url);
	public List<News> getAllNews();
	public News getNewsById(String id);
	public List<News> getNewsList(int pageSize,int pageIndex);
	public int getNewsCount();
	public boolean DelNewsById(String id);
	public boolean addNews(News n);
}
