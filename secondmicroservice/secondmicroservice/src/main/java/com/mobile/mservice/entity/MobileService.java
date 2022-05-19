package com.mobile.mservice.entity;



import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "mobileservice")
public class MobileService {
	private String name;
	private String description;
	private List<?> state;
	private Object serviceSpecification;
	private List<?> serviceCharacteristic;
	private List<?> serviceRelationship;
	private List<?> relatedParty;
	private List<?> supportingService;
	
}
