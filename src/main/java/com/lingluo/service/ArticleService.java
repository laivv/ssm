package com.lingluo.service;



import java.util.List;

import com.lingluo.model.Article;

public interface ArticleService {
	Article findById(String id);
	List<Article> findAll(int page,int size);
	boolean removeById(String id);
}
