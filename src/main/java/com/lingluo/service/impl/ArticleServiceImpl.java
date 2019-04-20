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
		
		return articleDao.queryById(id);
	}

	@Override
	public List<Article> findAll(int page, int size) {
		page = page < 1 ? 1 : page;
		int pageIndex = (page - 1) *size;
		return articleDao.queryAll(pageIndex, size);
	}

	@Override
	public boolean removeById(String id) {
		return true;
	}

}
