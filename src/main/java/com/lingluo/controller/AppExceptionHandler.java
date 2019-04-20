package com.lingluo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import com.lingluo.common.Result;

@ControllerAdvice
@ResponseBody
public class AppExceptionHandler {
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler
	public Result<?> sendExceptionResult(Exception e){
		return new Result<Object>(1,e.getMessage(),null);
	}
}
