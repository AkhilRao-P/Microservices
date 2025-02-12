package com.flm.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(exception = DepartmentNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleDepartmentNotFoundException(DepartmentNotFoundException ex) {
		ErrorMessage message = new ErrorMessage(ex.getMessage(),new Date(), HttpStatus.NOT_FOUND.name());
		return new ResponseEntity<>(message,HttpStatus.NOT_FOUND);
	}
}
