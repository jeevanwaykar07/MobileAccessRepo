package com.mobile.mservice.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "servicerelationship")
public class ServiceRelationshipEntity {
	private String type;
	private Object service;
	

}
