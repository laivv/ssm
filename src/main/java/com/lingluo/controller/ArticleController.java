package com.lingluo.controller;

import java.util.Calendar;
import java.util.List;
import java.io.IOException;
import java.sql.Timestamp;

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
		List<Article> articles = articleService.findByPage(page, 10);
		//Page<Article> pageData = new Page<Article>(articles, page, 10, 1, 1);
		//Result<Page<Article>> result = new Result<Page<Article>>(pageData);
//		return articles;
		logger.debug("获取文章列表数据");
		int count = articleService.count();
		PageResult result2 = new PageResult<Article>(articles,page,10,count);
		return result2;
	}
	
	@RequestMapping(value="/article/{id}", method = RequestMethod.GET)
	public Article getArticle(@PathVariable String id) throws IOException{
		Article article = articleService.findById(id);
		return article;
	}
	
	
	@RequestMapping(value="/article/add",method = RequestMethod.GET)
	public String addArticle() throws IOException{
		Article article = new Article();
		article.setTitle("测式");
		article.setCommentState(1);
		article.setContent("测试内容");
		Timestamp d = new Timestamp(System.currentTimeMillis());
		article.setCreateDate(d);
		article.setCreateUser(1);
		article.setPermission(0);
		article.setState(1);
		article.setVisitCount(0);
		article.setCategoryId(1);
		articleService.save(article);
		return "1";
		
	}
	
	
	@RequestMapping(value="/article",method = RequestMethod.POST)
	public String updateArticle(@RequestParam String id) throws IOException{
		return "1";
	}
	
}
