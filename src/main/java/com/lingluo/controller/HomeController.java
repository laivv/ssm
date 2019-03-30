package com.lingluo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

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