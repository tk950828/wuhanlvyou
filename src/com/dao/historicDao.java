package com.dao;

import java.util.List;

import com.entity.HistoryMessage;

public interface historicDao {
	public HistoryMessage getMessageById(int id);
	public List<HistoryMessage> getAllMessage();
	public boolean insertMessage(int id,String title,String user,String date,String text);
	public boolean delMessageById(int id);
	public boolean addHistory(HistoryMessage h);
}
