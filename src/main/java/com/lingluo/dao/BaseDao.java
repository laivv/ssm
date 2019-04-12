package com.lingluo.dao;

import java.util.List;


public interface BaseDao<T> {
	public T queryById(String id);
	public List<T> queryAll(int page,int size);
	public boolean removeById(String id);
	public String insert(T t);
}
