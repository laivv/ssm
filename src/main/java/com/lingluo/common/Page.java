package com.lingluo.common;

import java.util.List;

public class Page<T> {
	private List<T> list;
	private int pageIndex ;
	private int pageSize;
	private int pageCount;
	private int dataCount;
	public Page(List<T> list, int pageIndex, int pageSize, int pageCount, int dataCount) {
		super();
		this.list = list;
		this.pageIndex = pageIndex;
		this.pageSize = pageSize;
		this.pageCount = pageCount;
		this.dataCount = dataCount;
	}
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
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
	public int getDataCount() {
		return dataCount;
	}
	public void setDataCount(int count) {
		this.dataCount = count;
	}
		
}
