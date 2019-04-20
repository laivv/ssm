package com.lingluo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;


public interface BaseDao<T> {
	public T queryById(String id);
	public List<T> queryAll(@Param("page") int page,@Param("size") int size);
	public boolean removeById(String id);
	public String insert(T t);
}
