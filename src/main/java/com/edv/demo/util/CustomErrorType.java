package com.edv.demo.util;

public class CustomErrorType {
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public CustomErrorType(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}
	
}
