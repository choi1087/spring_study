package com.ssafy.member.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionControllerAdvice {
	private final Logger logger = LoggerFactory.getLogger(ExceptionControllerAdvice.class);
	
	@ExceptionHandler(MethodArgumentNotValidException.class)	
	public String handleValid(Exception ex) {
		logger.error("400 에러 발생 : ", ex.getMessage());
		return "error/error";
	}


}
