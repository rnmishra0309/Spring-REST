package com.spring.rest.model.error;

public class RequestNotFoundClass {
	
	private Integer errorCode;
	
	private String message;
	
	private Long timeStamp;
	
	public RequestNotFoundClass() {
		
	}

	public RequestNotFoundClass(Integer errorCode, String message, Long timeStamp) {
		this.errorCode = errorCode;
		this.message = message;
		this.timeStamp = timeStamp;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
	
}
