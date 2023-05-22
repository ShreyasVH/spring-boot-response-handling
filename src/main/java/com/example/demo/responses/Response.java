package com.example.demo.responses;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Response {
	private boolean success;
	private Object data;
	private String message;

	public Response(Object data) {
		this.data = data;
		this.success = true;
		this.message = "";
	}
}