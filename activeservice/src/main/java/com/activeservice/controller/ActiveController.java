package com.activeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.activeservice.constant.Constant;
import com.activeservice.dto.ResponseDto;
import com.activeservice.model.MobileAccessPostRequest;
import com.activeservice.service.ActivePersistService;


@RestController
public class ActiveController {
	
	@Autowired
	private ActivePersistService activePersistService;
	
	
	
	@PostMapping("active-save-data")
	public ResponseEntity<?> ActiveData(@RequestBody MobileAccessPostRequest userDto,@RequestHeader("content-type") String contentType) {
		ResponseDto response = new ResponseDto();
		
		if(contentType==null) {
			response.setMessage("Request Header should not empty");
			response.setStatus(Constant.Header);
		}
		else {
		try {
		
			activePersistService.saveData(userDto);
			
			response.setMessage("data save successfully");
			response.setStatus(Constant.SUCCESS);
			//response.setResponse(usr);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response.setMessage("Failed to save data");
			response.setStatus(Constant.ERROR);
			response.setError(e);
		}
		}
		
		return ResponseEntity.ok(response);
		
	}
	@GetMapping("getData/{Id}")
	public ResponseEntity<?> getData(@RequestParam String id) {
		ResponseDto response = new ResponseDto();
		
		try {
		
			Object mobileAccessget = activePersistService.getData(id);
			
			response.setMessage("data save successfully");
			response.setStatus(Constant.SUCCESS);
			response.setResponse(mobileAccessget);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			response.setMessage("Failed to gat data");
			response.setStatus(Constant.ERROR);
			response.setError(e);
		}
		
		return ResponseEntity.ok(response);
		
	}
}
