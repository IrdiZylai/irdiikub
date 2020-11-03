package com.crud.irdi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.irdi.exception.UserNotFoundException;
import com.crud.irdi.json.UserTypeObj;
import com.crud.irdi.model.UserType;
import com.crud.irdi.repository.UserTypeRepository;
import com.crud.irdi.service.UserTypeService;

@Service
public class UserTypeServiceImpl implements UserTypeService{

	@Autowired
	UserTypeRepository userTypeRepository;
	
	@Override
	public UserType getUserTypeById(Long id) {
		
		
		return userTypeRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException(id));

	}

	@Override
	public UserType saveUserType(UserTypeObj obj){
		
		UserType type = new UserType();
		type.setName(obj.getName());

 		return userTypeRepository.save(type);
	}
	

	@Override
	public UserType updateUserType(UserTypeObj obj, Long id) {
		UserType type = userTypeRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException(id));
		
		type.setName(obj.getName());
 
		
		
		return userTypeRepository.save(type);
	}

	@Override
	public void deleteById(Long id) {
		UserType type = userTypeRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException(id));
		
		userTypeRepository.delete(type);
	}

	
}
