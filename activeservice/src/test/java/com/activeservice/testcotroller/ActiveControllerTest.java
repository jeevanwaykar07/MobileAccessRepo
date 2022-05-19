package com.activeservice.testcotroller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.activeservice.constant.Constant;
import com.activeservice.controller.ActiveController;
import com.activeservice.dto.ResponseDto;
import com.activeservice.model.MobileAccessPostRequest;
import com.activeservice.service.ActivePersistService;

@SpringBootTest
public class ActiveControllerTest {
	@InjectMocks
	ActiveController activeController;
	
	@Mock
	ActivePersistService activePersistService;
	
	@Test
	void ActiveData() throws Exception{
		ResponseDto responseDto= new ResponseDto();
		MobileAccessPostRequest response = new MobileAccessPostRequest();
		
		responseDto.setMessage("save data successfully");
		responseDto.setStatus(Constant.SUCCESS);
		
		response.setName("voicemail");
		response.setDescription("active mobile data");
		//response.setRelatedParty(Arrays.asList(1, "data",2 ,"mobile data"));
		//when(activePersistService.saveData(response)).thenReturn(response);
		
	}
	
	

}
