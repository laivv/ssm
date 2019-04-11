package com.lingluo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lingluo.model.Article;
import com.lingluo.service.ArticleService;

@Controller
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;

	@RequestMapping(value="/list/{page}.do",method = RequestMethod.GET)
	public void getArticles(@PathVariable int page ,HttpServletResponse response) throws IOException{
		Article article = articleService.getArticleById("abc");
		System.out.print(article);
		System.out.print(article.getContent());
	    response.sendRedirect("/list.jsp");
	}
	
	@RequestMapping(value="/article/{id}.do", method = RequestMethod.GET)
	public void getArticle(@PathVariable String id,HttpServletResponse response) throws IOException{
		response.sendRedirect("/article.jsp");
	}
	
	
	@RequestMapping(value="/article.do",method = RequestMethod.PUT)
	public void addArticle(HttpServletRequest request, HttpServletResponse response) throws IOException{
		response.sendRedirect("/index.jsp");
	}
	
	@ResponseBody
	@RequestMapping(value="/article.do",method = RequestMethod.POST)
	public String updateArticle(@RequestParam String id) throws IOException{
		return "abc";
	}
	
}
