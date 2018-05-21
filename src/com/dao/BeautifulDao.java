package com.dao;

import java.util.List;

import com.entity.Beautiful;
import com.entity.News;

public interface BeautifulDao {
	public String getNameById(String id);
	public String getPrice(String id);
	public String getLocation(String id);
	public String getDescription(String id);
	public String getImg(String id);
	public String getTypes(String id);
	public List<Beautiful> getAllBeautiful();
	public boolean DelBeauById(String id);
	public boolean addBeau(Beautiful n);
}
