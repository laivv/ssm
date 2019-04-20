package com.lingluo.common;

import java.util.List;

public class PageResult<T> extends Result<T> {

	public PageResult(int code, String msg,List<T> list,int pageIndex,int pageSize,int pageCount,int count) {
		super(code, msg, (T) new Page<T>(list, pageIndex, pageSize, pageCount, count));
	}
	
	public PageResult(List<T> list,int pageIndex,int pageSize,int pageCount,int count) {
		this(CODE_SUCCESS, MESSAGE_SUCCESS,list, pageIndex, pageSize, pageCount, count);
	}
}
