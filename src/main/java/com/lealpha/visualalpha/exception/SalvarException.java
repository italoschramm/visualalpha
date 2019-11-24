package com.lealpha.visualalpha.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
public class SalvarException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SalvarException(String message) {
		super(message);
	}

}
