package com.mobile.mservice.testservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import com.mobile.mservice.entity.MobileService;
import com.mobile.mservice.entity.RelatedPartyEntity;
import com.mobile.mservice.model.MobileAccessPostRequest;
import com.mobile.mservice.model.RelatedParty;
import com.mobile.mservice.repository.RelatedPartyRepo;
import com.mobile.mservice.repository.UserRepository;
import com.mobile.mservice.service.PersistServiceImpl;

@ExtendWith(MockitoExtension.class)
public class PersistServieImplTest {
	@Autowired
	private PersistServiceImpl persistServiceImpl;
	
	@Mock
	private RelatedPartyRepo relatedPartyRepo;
	
	@Mock
	private UserRepository userRepository;
	
	@Test
	void saveData() throws Exception{
		MobileAccessPostRequest ma = new MobileAccessPostRequest();
		MobileService ms = new MobileService();
		ms.setDescription("hi");
		ms.setName("vice");
		List<RelatedPartyEntity> related = new ArrayList<RelatedPartyEntity>();
		ma.getRelatedParty();
		ms.setRelatedParty(related);
		
		userRepository.save(ms);
		MobileAccessPostRequest mapr = new MobileAccessPostRequest();
		RelatedPartyEntity rp = new RelatedPartyEntity();
		
		rp.setName("mobile");
		rp.setRole("admin");
		relatedPartyRepo.save(rp);
		
	}
	
	@Test 
	void getData()throws Exception{
		MobileService s = new MobileService();
		Optional<MobileService> mobileAccessSaveRequest = Optional.of(s);
		userRepository.findById(14554);
	}

}
