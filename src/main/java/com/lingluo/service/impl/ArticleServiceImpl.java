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
	
	public Article getArticleById(String id) {
		
		return articleDao.queryById(id);
	}

	@Override
	public List<Article> getArticle(int page, int size) {
		
		return articleDao.queryAll(page, size);
	}

	@Override
	public boolean removeArticleById(String id) {
		return true;
	}

}
