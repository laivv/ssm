package com.lingluo.common;

public class EmptyResult extends Result<Object> {

	public EmptyResult(String msg) {
		super(CODE_SUCCESS, msg, null);
	}
	
	public EmptyResult() {
		super(CODE_SUCCESS, MESSAGE_SUCCESS, null);
	}
}
