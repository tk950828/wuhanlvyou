package com.entity;

import java.util.ArrayList;
import java.util.List;

public class NewsListPage {
	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List<News> getNewsList() {
		return newsList;
	}

	public void setNewsList(List<News> newsList) {
		this.newsList = newsList;
	}

	// µ±Ç°Ò³Âë
	private int pageIndex;

	private int pageSize;

	private int pageCount;

	private List<News> newsList = new ArrayList<News>();
	
}
