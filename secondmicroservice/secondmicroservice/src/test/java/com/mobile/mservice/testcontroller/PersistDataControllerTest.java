package com.mobile.mservice.testcontroller;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.mobile.mservice.controller.Persistcontroller;
import com.mobile.mservice.dto.ResponseDto;
import com.mobile.mservice.entity.MobileService;
import com.mobile.mservice.model.MobileAccessPostRequest;
import com.mobile.mservice.service.PersistServiceImpl;

@RunWith(SpringRunner.class)
@WebMvcTest
public class PersistDataControllerTest {

	@Autowired
	private Persistcontroller persistcontroller;
	
	@MockBean
	private PersistServiceImpl persistServiceImpl;
	
	@Test
	void saveData() throws Exception {
		
		MobileAccessPostRequest save = new MobileAccessPostRequest();
		MobileService ms = new MobileService();
		//Mockito.when(persistServiceImpl.saveData(save)).thenReturn(ms);
		persistcontroller.persistData(save);
}
	@Test
	void testGetData() throws Exception {
		ResponseDto s = new ResponseDto();
	 s.setMessage("success");
		Mockito.when(persistServiceImpl.getData(123456)).thenReturn(s.getMessage());
		persistcontroller.persistData(123456);
	}
}