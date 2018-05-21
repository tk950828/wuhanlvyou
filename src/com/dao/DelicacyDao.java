package com.dao;

import java.util.List;

import com.entity.Delicacy;

public interface DelicacyDao {
	
	public boolean setDelicacy(String id,String name,String img,String price,String type,String location,String description);
	public List<Delicacy> getAllDelicacy();
	public boolean delicacyDel(String id);
}
