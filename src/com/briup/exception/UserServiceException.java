package com.briup.exception;

public class UserServiceException extends Exception{
	private static final long serialVersionUID = 1L;

	public UserServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UserServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
