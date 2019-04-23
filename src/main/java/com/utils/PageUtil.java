package com.utils;

import java.util.List;
import java.util.Map;

public class PageUtil {
	
	private static final long serialVersionUID = 1L;
	
	private int totalCount;
	private int pageSize;
	private int totalPage;
	private int currPage;
	private List<?> list;
	   
	public PageUtil(List<?> list,int totalCount,Map<String,Object> map) {
		this.currPage = (Integer)map.get("page");
		this.pageSize = (Integer)map.get("limit");
		this.totalPage = totalCount / pageSize + totalCount % pageSize == 0 ? 0 : 1; 
		this.totalCount = totalCount; 
		this.list = list;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public List<?> getList() {
		return list;
	}
	public void setList(List<?> list) {
		this.list = list;
	}
	
	
}
