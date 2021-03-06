package com.mobile.mservice.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ResponseDto {
	
	private Exception error;
	private String message;
	private Object response;
	private int status;

}
