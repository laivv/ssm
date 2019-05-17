package com.lingluo.service;

import com.lingluo.model.Article;

public interface ArticleService extends BaseService<Article> {
	public int count();
	public int countPage(int size);
}
