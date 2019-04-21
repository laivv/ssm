package com.lingluo.model;

import java.sql.Timestamp;

public class User {
	private int id;
	private String account;
	private String password;
	private String alias;
	private int type;
	private Timestamp createDate;
	private Timestamp lastLoginDate;
	private Timestamp currLoginDate;
	private int loginCount;
	private String email;
	private int state;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public Timestamp getLastLoginDate() {
		return lastLoginDate;
	}
	public void setLastLoginDate(Timestamp lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
	public Timestamp getCurrLoginDate() {
		return currLoginDate;
	}
	public void setCurrLoginDate(Timestamp currLoginDate) {
		this.currLoginDate = currLoginDate;
	}
	public int getLoginCount() {
		return loginCount;
	}
	public void setLoginCount(int loginCount) {
		this.loginCount = loginCount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
