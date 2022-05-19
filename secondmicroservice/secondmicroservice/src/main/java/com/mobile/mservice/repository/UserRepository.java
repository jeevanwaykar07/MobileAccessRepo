package com.mobile.mservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mobile.mservice.entity.MobileService;
@Repository
public interface UserRepository extends CrudRepository<MobileService, Integer>{

}
