package com.spring.rest.controller.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spring.rest.exceptions.RequestNotFoundException;
import com.spring.rest.model.error.RequestNotFoundClass;

@ControllerAdvice
public class ApiExceptionHandler {
	
	@ExceptionHandler
	public ResponseEntity<RequestNotFoundClass> handleError(RequestNotFoundException exception) {
		RequestNotFoundClass error = new RequestNotFoundClass();
		error.setErrorCode(HttpStatus.NOT_FOUND.value());
		error.setMessage(exception.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<RequestNotFoundClass> handleError(Exception exception) {
		RequestNotFoundClass error = new RequestNotFoundClass();
		error.setErrorCode(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exception.getMessage());
		error.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
}
