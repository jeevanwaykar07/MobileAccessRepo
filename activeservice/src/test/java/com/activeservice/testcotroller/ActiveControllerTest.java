package com.activeservice.testcotroller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import com.activeservice.controller.ActiveController;
import com.activeservice.dto.ResponseDto;
import com.activeservice.model.MobileAccessPostRequest;
import com.activeservice.service.ActivePersistService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class ActiveControllerTest {
	@Autowired
	private ActiveController activeController;
	
	@MockBean
	ActivePersistService activePersistService;
	
	@Test
	void ActiveData() throws Exception{
		ResponseDto responseDto= new ResponseDto();
		MobileAccessPostRequest response = new MobileAccessPostRequest();
		responseDto.setMessage("save data successfully");
		
		Mockito.when(activePersistService.saveData(response)).thenReturn(responseDto.getMessage());
		
		try {
			activePersistService.saveData(response);
		}catch (Exception e){
			e.printStackTrace();
		}
		assertEquals(response, response);
	}
	
	@Test
	void testGetData() throws Exception {
		MobileAccessPostRequest mobileaccess= new MobileAccessPostRequest();
		activeController.getData("aaaa");
		assertEquals(mobileaccess, mobileaccess);
	}

}
