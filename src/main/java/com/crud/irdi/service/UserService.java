package com.crud.irdi.service;


import com.crud.irdi.json.UserObj;
import com.crud.irdi.model.User;

public interface UserService {

	User getUserById(Long id);
	
	User saveUser(UserObj obj);
	
	User updateUser(UserObj obj, Long id);

 
	void deleteById(Long id);

}
