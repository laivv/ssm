package com.lingluo.controller;

import java.util.List;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lingluo.common.Page;
import com.lingluo.common.PageResult;
import com.lingluo.common.Result;
import com.lingluo.model.Article;
import com.lingluo.service.ArticleService;

@RestController
public class ArticleController {
	private Logger logger = Logger.getLogger(getClass());
	@Autowired
	private ArticleService articleService;

	
	@RequestMapping(value="/list/{page}",method = RequestMethod.GET)
	public Result<Page<Article>> getArticles(@PathVariable int page) throws IOException{
		List<Article> articles = articleService.findAll(page, 10);
		//Page<Article> pageData = new Page<Article>(articles, page, 10, 1, 1);
		//Result<Page<Article>> result = new Result<Page<Article>>(pageData);
//		return articles;
		logger.debug("获取文章列表数据");
		PageResult result2 = new PageResult<Article>(articles,page,10,0,0);
		return result2;
	}
	
	@RequestMapping(value="/article/{id}", method = RequestMethod.GET)
	public Article getArticle(@PathVariable String id) throws IOException{
		Article article = articleService.findById(id);
		return article;
	}
	
	
	@RequestMapping(value="/article",method = RequestMethod.GET)
	public String addArticle() throws IOException{
		return "abc";
		
	}
	
	
	@RequestMapping(value="/article",method = RequestMethod.POST)
	public String updateArticle(@RequestParam String id) throws IOException{
		return "1";
	}
	
}
