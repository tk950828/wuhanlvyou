package com.entity;

public class HistoryMessage {
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public HistoryMessage(String title, String user, String date, String text) {
		// TODO Auto-generated constructor stub
		this.date = date;
		this.text = text;
		this.title = title;
		this.user = user;
	}
	public HistoryMessage(String id, String user, String title,
			String date, String text) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.user = user;
		this.title = title;
		this.date = date;
		this.text = text;
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
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	private String id;
	private String user;
	private String text;
	private String date;
	private String title;
}
