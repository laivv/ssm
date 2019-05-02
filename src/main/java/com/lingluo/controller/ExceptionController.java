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
		return new ErrorResult("�������Դ������");
	}
	
	@ResponseStatus(HttpStatus.METHOD_NOT_ALLOWED)
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
	public ErrorResult methodNotAllowed(HttpRequestMethodNotSupportedException  e){
		return new ErrorResult(e.getMethod() + "���󷽷�");
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(ConversionNotSupportedException.class)
	public ErrorResult conversionNotSupported(ConversionNotSupportedException e){
		return new ErrorResult( "ת��ʧ�ܣ�" + e.getPropertyName());
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(TypeMismatchException.class)
	public ErrorResult typeMismatch(TypeMismatchException e){
		return new ErrorResult( "���Ͳ�ƥ�䣬ӦΪ��" + e.getRequiredType());
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ErrorResult argumentNotValid(MethodArgumentNotValidException e){
		return new ErrorResult("��Ч�Ĳ���");
	}
	
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public ErrorResult missingParameter(MissingServletRequestParameterException e){
		return new ErrorResult("ȱʧ�Ĳ�����" + e.getParameterName());
	}
}
