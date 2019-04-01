package com.lingluo.controller;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.aspectj.weaver.ast.Var;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Controller
public class HomeController {
	//ApplicationContext context= new ClassPathXmlApplicationContext("./applicationContext.xml");
	@RequestMapping("/index.do")
	public void index(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.sendRedirect("/index.jsp");
	}
	
	@ResponseBody
	@RequestMapping("/index/{json}.do")
	public String index(@PathVariable String json)  {
		return json;
	}
}