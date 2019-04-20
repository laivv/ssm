package com.lingluo.common;

public class Result<T> {
	public static final String MESSAGE_SUCCESS = "³É¹¦";
	public static final String MESSAGE_ERROR = "Ê§°Ü";
	public static final int CODE_SUCCESS = 0;
	public static final int CODE_ERROR = 1;
	private int code;
	private String msg;
	private T data;

	public Result(int code, String msg, T data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}
	
	public Result(T data){
		this(CODE_SUCCESS, MESSAGE_SUCCESS,data);
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
}
