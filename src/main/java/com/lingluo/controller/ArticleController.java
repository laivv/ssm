package com.lingluo.controller;

import java.util.Date;
import java.util.List;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	public PageResult<Article> getArticles(@PathVariable int page) throws IOException{
		List<Article> articles = articleService.findByPage(page, 10);
		logger.debug("获取文章列表数据");
		int count = articleService.count();
		return new PageResult<Article>(articles,page,10,count);
	}
	
	@RequestMapping(value="/article/{id}", method = RequestMethod.GET)
	public Result<Article> getArticle(@PathVariable String id) throws IOException{
		Article article = articleService.findById(id);
		Result<Article> result = new Result<Article>(article);
		return result;
	}
	
	
	@RequestMapping(value="/article",method = RequestMethod.PUT)
	public Result<Object> addArticle() throws IOException{
		Article article = new Article();
		article.setTitle("测式");
		article.setCommentState(1);
		article.setContent("测试内容");
		Date d = new Date(System.currentTimeMillis());
		article.setCreateDate(d);
		article.setCreateUser(1);
		article.setPermission(0);
		article.setState(1);
		article.setVisitCount(0);
		article.setCategoryId(1);
		articleService.save(article);
		return new Result<Object>(null);
	}
	
	@RequestMapping(value="/article",method = RequestMethod.POST)
	public Result<Object> updateArticle(@RequestBody Article article) throws IOException{
		articleService.update(article);
		return new Result<Object>(null);
	}
	
	
	@RequestMapping(value="/article/{id}",method = RequestMethod.DELETE)
	public Result<Object> deleteArticle(@PathVariable String id) throws IOException{
		articleService.delete(id);
		return new Result<Object>(null);
	}
	
	@RequestMapping(value="/article/add",method = RequestMethod.GET)
	public String addArticleTest() throws IOException{
		addArticle();
		return "添加成功";
	}
	
	@RequestMapping(value="/article/delete/{id}",method = RequestMethod.GET)
	public String deleteArticleTest(@PathVariable String id) throws IOException{
		deleteArticle(id);
		return "删除成功";
	}
	
//	@RequestMapping(value="/article",method = RequestMethod.POST)
//	public String updateArticle(@RequestParam String id) throws IOException{
//		return "1";
//	}
	
}
