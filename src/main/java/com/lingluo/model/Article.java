package com.lingluo.model;

import java.sql.Timestamp;

public class Article {
	private int id;
	private String title;
	private String content;
	private int categoryId;
	private Timestamp createDate;
	private Timestamp updateDate;
	private Timestamp deleteDate;
	private int createUser;
	private int visitCount;
	private int commentState;
	private int state;
	private int permission;
	private String reminder;
	private String reminderKey;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public Timestamp getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}
	public Timestamp getDeleteDate() {
		return deleteDate;
	}
	public void setDeleteDate(Timestamp deleteDate) {
		this.deleteDate = deleteDate;
	}
	public int getCreateUser() {
		return createUser;
	}
	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}
	public int getVisitCount() {
		return visitCount;
	}
	public void setVisitCount(int visitCount) {
		this.visitCount = visitCount;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getPermission() {
		return permission;
	}
	public void setPermission(int permission) {
		this.permission = permission;
	}
	public String getReminder() {
		return reminder;
	}
	public void setReminder(String reminder) {
		this.reminder = reminder;
	}
	public String getReminderKey() {
		return reminderKey;
	}
	public void setReminderKey(String reminderKey) {
		this.reminderKey = reminderKey;
	}
	public int getCommentState() {
		return commentState;
	}
	public void setCommentState(int commentState) {
		this.commentState = commentState;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	

}
