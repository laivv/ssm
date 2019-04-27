package com.lingluo.dao;

import com.lingluo.model.Article;


public interface ArticleDao extends BaseDao<Article> {
	public int count();
}
