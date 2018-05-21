package com.dao;

import java.util.List;

import com.entity.Special;


public interface SpecialDao {
	public boolean setSpecial(String id,String name,String img,String price,String type,String location,String description);
	public List<Special> getAllSpecial();
	
}
