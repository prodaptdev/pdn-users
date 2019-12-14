package com.prodapt.app.exception;

public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public UserNotFoundException(Integer userId) {
		super("User id "+userId+" does not exists");
	}

}
