package com.crud.irdi.service;

import com.crud.irdi.json.UserTypeObj;
import com.crud.irdi.model.UserType;

public interface UserTypeService {

	UserType getUserTypeById(Long id);
	
	UserType saveUserType(UserTypeObj obj);
	
	UserType updateUserType(UserTypeObj obj, Long id);

 
	void deleteById(Long id);

}
