package com.mobile.mservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.mservice.entity.MobileService;
import com.mobile.mservice.entity.RelatedPartyEntity;
import com.mobile.mservice.model.MobileAccessPostRequest;
import com.mobile.mservice.model.RelatedParty;
import com.mobile.mservice.model.ServiceCharacteristic;
import com.mobile.mservice.model.ServiceRelationship;
import com.mobile.mservice.model.ServiceSpecification;
import com.mobile.mservice.model.StateEnum;
import com.mobile.mservice.model.SupportingServiceCreatePostRequest;
import com.mobile.mservice.repository.RelatedPartyRepo;
import com.mobile.mservice.repository.UserRepository;

@Service
public class PersistServiceImpl {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RelatedPartyRepo relatedPartyRepo;

	public void saveData(MobileAccessPostRequest userDto) {
		
		MobileService mobileService = new MobileService();
		 List<SupportingServiceCreatePostRequest> supportingService = userDto.getSupportingService();
		 String description = supportingService.get(0).getDescription();
		 String name = supportingService.get(0).getName();
		 StateEnum state = supportingService.get(0).getState();
		 List<RelatedParty> relatedParty = supportingService.get(0).getRelatedParty();
		 List<ServiceCharacteristic> serviceCharacteristic = supportingService.get(0).getServiceCharacteristic();
		 List<ServiceRelationship> serviceRelationship = supportingService.get(0).getServiceRelationship();
		 ServiceSpecification serviceSpecification = supportingService.get(0).getServiceSpecification();
		 
		 mobileService.setDescription(description);
		 mobileService.setName(name);
		 mobileService.setRelatedParty(relatedParty);
		 mobileService.setServiceCharacteristic(serviceCharacteristic);
		 mobileService.setServiceRelationship(serviceRelationship);
		 mobileService.setServiceSpecification(serviceSpecification);
		 userRepository.save(mobileService);
		 
		 RelatedPartyEntity rpEntity = new RelatedPartyEntity();
		 List<RelatedParty> relatedParty2 = userDto.getRelatedParty();
		 String id = relatedParty2.get(0).getId();
		 String name2 = relatedParty2.get(0).getName();
		 String role = relatedParty2.get(0).getRole();
		 
		 rpEntity.setId(id);
		 rpEntity.setName(name2);
		 rpEntity.setRole(role);
		 
		 relatedPartyRepo.save(rpEntity);
		 
		 
	}

	public Object getData(int id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}
	

}
