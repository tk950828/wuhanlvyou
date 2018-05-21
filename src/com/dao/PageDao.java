package com.dao;

import com.entity.NewsListPage;

public interface PageDao {
	public NewsListPage getNewsListPage(int pageSize, int pageIndex);
}
