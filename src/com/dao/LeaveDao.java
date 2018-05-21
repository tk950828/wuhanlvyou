package com.dao;

import java.util.List;

import com.entity.LeaveMessage;

public interface LeaveDao {
	public boolean insertLeaveMessage(String user,String phone,String sex,String message);
	public List<LeaveMessage> getAllmessage();
	public boolean delMessage(String id);
}
