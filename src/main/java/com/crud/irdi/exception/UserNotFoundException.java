package com.crud.irdi.exception;

public class UserNotFoundException extends RuntimeException {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = -4153035737461351504L;
	
	private long id;

	public UserNotFoundException(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
}
