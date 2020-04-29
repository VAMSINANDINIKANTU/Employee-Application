package com.employeeapp.exceptionhandler;

import java.time.LocalDateTime;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
@RestController
public class ExceptionHandlerController  extends ResponseEntityExceptionHandler{

	@Override 
	protected ResponseEntity<Object>handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) { 
	ErrorDetails apiError = new ErrorDetails(HttpStatus.BAD_REQUEST,LocalDateTime.now(),"validation failed",request.getDescription(false)); 
	return new ResponseEntity<Object>(apiError,HttpStatus.BAD_REQUEST); 
	}
	 
	@ExceptionHandler(EmployeeNotFoundException.class) 
    public ResponseEntity<ErrorDetails> handleEmployeeNotFoundException(EmployeeNotFoundException ex,WebRequest request){ 
	     ErrorDetails details=new ErrorDetails(HttpStatus.NOT_FOUND,LocalDateTime.now(),ex.getMessage(),request.getDescription(false));
	     return new ResponseEntity<ErrorDetails>(details,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleOtherException(Exception ex,WebRequest request){
	    ErrorDetails details=new ErrorDetails(HttpStatus.INTERNAL_SERVER_ERROR,LocalDateTime.now(),"some server not found",request.getDescription(false));
		return new ResponseEntity<ErrorDetails>(details,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}