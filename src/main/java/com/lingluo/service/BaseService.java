package com.lingluo.service;

import java.util.List;



public interface BaseService<T> {
	public void save(T t);
	public void delete(String id);
	public void update(T t);
	public T findById(String id);
	public List<T> findByPage(int page,int index);
	public List<T> findAll();
}
