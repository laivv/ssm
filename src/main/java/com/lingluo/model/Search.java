package com.lingluo.model;

import java.sql.Timestamp;

public class Search {
	private int id;
	private String name;
	private int count;
	private Timestamp createDate;
	private Timestamp lastSearchDate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public Timestamp getLastSearchDate() {
		return lastSearchDate;
	}
	public void setLastSearchDate(Timestamp lastSearchDate) {
		this.lastSearchDate = lastSearchDate;
	}
	
}
