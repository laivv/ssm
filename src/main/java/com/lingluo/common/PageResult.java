package com.lingluo.common;

import java.util.List;

public class PageResult<T> extends Result<T> {

	public PageResult(int code, String msg,List<T> list,int pageIndex,int pageSize,int dataCount) {
		super(code, msg, (T) new Page<T>(list, pageIndex, pageSize, (int) Math.ceil((((double)dataCount) /pageSize)), dataCount));
	}
	
	public PageResult(List<T> list,int pageIndex,int pageSize,int dataCount) {
		this(CODE_SUCCESS, MESSAGE_SUCCESS,list, pageIndex, pageSize,dataCount);
	}
}
