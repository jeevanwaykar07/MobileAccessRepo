package com.mobile.mservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.mservice.constant.Constant;
import com.mobile.mservice.dto.ResponseDto;
import com.mobile.mservice.model.MobileAccessPostRequest;
import com.mobile.mservice.service.PersistServiceImpl;


@RestController
public class Persistcontroller {
	
	@Autowired
	private PersistServiceImpl persistServiceImpl;

	@GetMapping("hi")
	public String getName() {
		return "Jeevan";
	}

	@PostMapping("save")
	public ResponseEntity<?> persistData(@RequestBody MobileAccessPostRequest userDto) {
		ResponseDto response = new ResponseDto();
		try {
		 persistServiceImpl.saveData(userDto);

		response.setMessage("from persist MS data save successfully");
		response.setStatus(Constant.SUCCESS);
		}catch(Exception e)
		{
			e.printStackTrace();
			response.setMessage("from persist MS Failed to save data");
			response.setStatus(Constant.ERROR);
			response.setError(e);
			
		}
		return ResponseEntity.ok(response);

	}
	
	@GetMapping("getData/{id}")
	public ResponseEntity<?> persistData(@RequestParam int id) {
		ResponseDto response = new ResponseDto();
		try {
			
			Object mobileAccessget = persistServiceImpl.getData(id);
			
			response.setMessage("successfully");
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
