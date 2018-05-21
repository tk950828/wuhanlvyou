package com.entity;

public class News {
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getNewsText() {
		return newsText;
	}
	public void setNewsText(String newsText) {
		this.newsText = newsText;
	}
	public String getNewsDate() {
		return newsDate;
	}
	public void setNewsDate(String newsDate) {
		this.newsDate = newsDate;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	private String id;
	private String user;
	private String newsText;
	private String newsDate;
	private String url;
	private String detail;
	
	public News (String user,String newsText,String newsDate,String detail){
		this.newsText = newsText;
		this.newsDate = newsDate;
		this.user = user;
		this.detail = detail;
	}
	
	public News (String id,String user,String newsText,String newsDate,String url){
		this.id = id;
		this.newsText = newsText;
		this.newsDate = newsDate;
		this.user = user;
		this.url = url;
		
	}
	
	public News (String id,String user,String newsText,String newsDate,String detail,String url){
		this.id = id;
		this.newsText = newsText;
		this.newsDate = newsDate;
		this.user = user;
		this.url = url;
		this.detail = detail;
		
	}
}
