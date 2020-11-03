package com.crud.irdi.enums;

public enum CrudErrors {
	
	USER_NOT_FOUND(404),
	GENERIC_ERROR(9999);

	private int code;

	public int getCode() {
		return code;
	}

	private CrudErrors(int code) {
		this.code = code;
	}

	

}
