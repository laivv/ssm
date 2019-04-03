package com.lingluo.service;



import java.util.List;

import com.lingluo.model.Article;

public interface ArticleService {
	Article getArticleById(String id);
	List<Article> getArticle(int page,int size);
	boolean removeArticleById(String id);
}
