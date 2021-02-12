package com.example.demo.entity;

import org.springframework.http.HttpStatus;

public class Response {

	private HttpStatus status;
	private String description;

	public Response(String description, HttpStatus status) {
		super();
		setDescription(description);
		this.status = status;
	}

	public Response() {
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
