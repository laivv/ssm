package com.lingluo.controller;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.aspectj.weaver.ast.Var;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@Controller
public class HomeController {
	//ApplicationContext context= new ClassPathXmlApplicationContext("./applicationContext.xml");
	@RequestMapping("/index")
	public String index(Model model) throws IOException {
		model.addAttribute("name","HomeController传到view中的数据");
		int a = 5 / 0;
		return "index";
	}
	
}
