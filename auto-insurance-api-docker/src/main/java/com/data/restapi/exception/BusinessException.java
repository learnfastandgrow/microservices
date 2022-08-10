package com.data.restapi.exception;

public class BusinessException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BusinessException(String errorMesssage) {
		super(errorMesssage);
	}

}
