package com.activeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.activeservice.model.MobileAccessPostRequest;

@Service
public class ActivePersistService {
	
	@Autowired
	private RestTemplate restTemplate ;


	public String saveData(MobileAccessPostRequest userDto) {
		
		HttpEntity<MobileAccessPostRequest> entity = new HttpEntity<MobileAccessPostRequest>(userDto);
		 return restTemplate.exchange(
		         "http://localhost:8080/save", HttpMethod.POST, entity, String.class).getBody();
		
	}


	public String getData(String id) {
		// TODO Auto-generated method stub
		HttpEntity<?> entity = new HttpEntity<>(id);
		 return restTemplate.exchange(
		         "http://localhost:8080/getMobileData/{id}", HttpMethod.GET, entity, String.class).getBody();
	}
	
}
