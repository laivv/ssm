package com.lingluo.common;

public class ErrorResult<Object> extends Result<Object> {
	public ErrorResult(String msg) {
		super(CODE_ERROR,  msg , null);
	}
}
