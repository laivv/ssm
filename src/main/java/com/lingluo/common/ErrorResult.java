package com.lingluo.common;

public class ErrorResult extends Result<Object> {
	public ErrorResult(String msg) {
		super(CODE_ERROR,  msg , null);
	}
	public ErrorResult() {
		super(CODE_ERROR,  MESSAGE_ERROR , null);
	}
}
