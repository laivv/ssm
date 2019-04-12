package com.lingluo.controller;

import java.util.List;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lingluo.model.Article;
import com.lingluo.service.ArticleService;

@RestController
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;

	
/*	@RequestMapping(value="/list/{page}.do",method = RequestMethod.GET)
	public List<Article> getArticles(@PathVariable int page) throws IOException{
		List<Article> articles = articleService.findAll(page, 10);
		return articles;
	}*/
	
	
	@ResponseBody
	@RequestMapping(value="/article/{id}.do", method = RequestMethod.GET)
	public Article getArticle(@PathVariable String id) throws IOException{
		Article article = articleService.findById(id);
		return article;
	}
	
	
	@RequestMapping(value="/article.do",method = RequestMethod.GET)
	public String addArticle(HttpServletRequest request) throws IOException{
		return "abc";
		
	}
	
	
	@RequestMapping(value="/article.do",method = RequestMethod.POST)
	public String updateArticle(@RequestParam String id) throws IOException{
		return "1";
	}
	
}
