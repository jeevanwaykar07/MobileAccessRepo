package com.mobile.mservice.entity;


import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "relatedparty")
public class RelatedPartyEntity {
	private String id;
	private String name;
	private String role;
	

}
