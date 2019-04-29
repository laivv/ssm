package com.lingluo.controller;

import org.springframework.beans.ConversionNotSupportedException;
import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.multiaction.NoSuchRequestHandlingMethodException;

import com.lingluo.common.ErrorResult;
import com.lingluo.common.Result;

@ControllerAdvice
@ResponseBody
public class ExceptionController {
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler
	public ErrorResult sendExceptionResult(Exception e){
		return new ErrorResult(e.getMessage());
	}
	
	@ResponseStatus(HttpStatus.NOT_FOUND)
	@ExceptionHandler(NoSuchRequestHandlingMethodException.class)
	public ErrorResult notFound(NoSuchRequestHandlingMethodException  e){
		return new ErrorResult("请求的资源不存在");
	}
	
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public Result<Object> methodNotAllowed(HttpRequestMethodNotSupportedException  e){
		return new Result<Object>(1, "不支持" + e.getMethod() + "请求方法", null);
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ConversionNotSupportedException.class)
	public Result<Object> conversionNotSupported(ConversionNotSupportedException e){
		return new Result<Object>(1, "转换失败：" + e.getPropertyName(), null);
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(TypeMismatchException.class)
	public Result<Object> typeMismatch(TypeMismatchException e){
		return new Result<Object>(1, "类型不匹配，应为：" + e.getRequiredType(), null);
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Result<Object> argumentNotValid(MethodArgumentNotValidException e){
		return new Result<Object>(1, "无效的参数", null);
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public Result<Object> missingParameter(MissingServletRequestParameterException e){
		return new Result<Object>(1, "缺失的参数：" + e.getParameterName(), null);
	}
}
