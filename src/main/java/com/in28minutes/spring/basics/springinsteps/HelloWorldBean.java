package com.in28minutes.spring.basics.springinsteps;

public class HelloWorldBean {
	
	private String message;
	
	public HelloWorldBean(String message) {
		this.message =message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
