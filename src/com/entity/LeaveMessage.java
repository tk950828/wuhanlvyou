package com.entity;

public class LeaveMessage {
	private String id;
	private String user;
	private String phone;
	private String sex;
	private String message;
	public LeaveMessage(String id, String user, String phone, String sex,
			String message) {
		this.id = id;
		this.user = user;
		this.phone = phone;
		this.sex = sex;
		this.message = message;
		// TODO Auto-generated constructor stub
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
