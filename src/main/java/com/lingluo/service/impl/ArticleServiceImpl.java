package com.lingluo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lingluo.dao.ArticleDao;
import com.lingluo.model.Article;
import com.lingluo.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDao articleDao;
	
	public Article findById(String id) {
		
		return articleDao.findById(id);
	}
	
	@Override
	public int countPage(int size){
		double dataCount = articleDao.count();
		int pageCount = (int) Math.ceil( dataCount / size);
		return pageCount;
	}
	
	@Override
	public List<Article> findByPage(int page, int size) {
		int offset = (page - 1) *size;
		return articleDao.findByPage(offset, size);
	}

	@Override
	public void delete(String id) {
		articleDao.delete(id);
	}

	@Override
	public void save(Article t) {
		articleDao.save(t);
		
	}

	@Override
	public void update(Article t) {
		articleDao.update(t);
		
	}

	@Override
	public List<Article> findAll() {
		return articleDao.findAll();
	}

	@Override
	public int count() {
		return articleDao.count();
	}

}
