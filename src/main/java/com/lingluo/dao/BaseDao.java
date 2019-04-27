package com.lingluo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;


public interface BaseDao<T> {
	public void save(T t);
	public void delete(String id);
	public void update(T t);
	public T findById(String id);
	public List<T> findByPage(@Param("page") int page,@Param("size") int size);
	public List<T> findAll();
}
