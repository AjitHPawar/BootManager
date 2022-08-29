package com.spring.SpringAllModule.controller;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.client.HttpServerErrorException.InternalServerError;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import exceptions.RecordNotSavedEsception;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = RecordNotSavedEsception.class)
	public ResponseEntity<Object> recordNotSavedException(RecordNotSavedEsception recordNotSavedEsception) {
		return new ResponseEntity<Object>("Record Not Saved . please look into this ",
				HttpStatus.BAD_REQUEST.EXPECTATION_FAILED);
	}
	
	@ExceptionHandler(value = EmptyResultDataAccessException.class)
	public ResponseEntity<Object> emptyResultDataAccessException(EmptyResultDataAccessException recordNotSavedEsception) {
		return new ResponseEntity<Object>("EmptyResultDataAccessException . please look into this ",
				HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = InternalServerError.class)
	public ResponseEntity<Object> internalServerError(InternalServerError recordNotSavedEsception) {
		return new ResponseEntity<Object>("Internal Server Error . please look into this ",
				HttpStatus.BAD_REQUEST.EXPECTATION_FAILED);
	}
	
	
	
	
}
