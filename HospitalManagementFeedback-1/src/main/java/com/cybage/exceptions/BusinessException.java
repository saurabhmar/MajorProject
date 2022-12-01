package com.cybage.exceptions;

public class BusinessException extends Exception {

	private static final long serialVersionUID = -471257064274266683L;

	public BusinessException() {
		super();
	}

	public BusinessException(final String message) {
		super(message);
	}

}
