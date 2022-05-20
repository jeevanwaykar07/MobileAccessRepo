package com.activeservice.testservice;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.activeservice.model.MobileAccessPostRequest;
import com.activeservice.service.ActivePersistService;

@ExtendWith(MockitoExtension.class)
public class ActiveServiceTest {

	@Autowired
	private ActivePersistService activePersistService;

	@Mock
	private RestTemplate restTemplate;

	@Test
	void saveData() throws Exception {
		MobileAccessPostRequest mapr = new MobileAccessPostRequest();
		URI uri = URI.create(String.format("http://%s:%s", "localhost", 8080));
		String url = uri.toString() + "save";
		ResponseEntity<MobileAccessPostRequest> resp = new ResponseEntity<MobileAccessPostRequest>(mapr, HttpStatus.OK);
		Mockito.when(restTemplate.postForEntity(url, mapr, MobileAccessPostRequest.class)).thenReturn(resp);
		activePersistService.saveData(mapr);
	}

	@Test
	void getData() throws Exception {
		MobileAccessPostRequest mapr1 = new MobileAccessPostRequest();
		URI uri = URI.create(String.format("http://%s:%s", "localhost", 8080));
		String url = uri.toString() + "getMobileData/45762155";
		
		ResponseEntity<?> respEntity = new ResponseEntity<>(
				mapr1, HttpStatus.OK);
		Mockito.when(restTemplate.postForEntity(url, mapr1, MobileAccessPostRequest.class)).thenReturn((ResponseEntity<MobileAccessPostRequest>) respEntity);
		activePersistService.getData("458796");
	}
}