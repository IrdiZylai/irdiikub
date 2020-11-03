package com.crud.irdi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.irdi.exception.UserNotFoundException;
import com.crud.irdi.json.UserObj;
import com.crud.irdi.model.User;
import com.crud.irdi.model.UserType;
import com.crud.irdi.repository.UserRepository;
import com.crud.irdi.repository.UserTypeRepository;
import com.crud.irdi.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserTypeRepository userTypeRepository;
	
	@Override
	public User saveUser(UserObj obj) {

		User user = new User();
		user.setName(obj.getName());
		user.setSurname(obj.getSurname());
		user.setAge(obj.getAge());
		
		UserType type = userTypeRepository.findById(obj.getUserTypeId().longValue())
				.orElseThrow(() -> new UserNotFoundException(obj.getUserTypeId().longValue()));
		
		user.setType(type);
 		return userRepository.save(user);
	}

	@Override
	public User getUserById(Long id) {
		
		return userRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException(id));
	}

	@Override
	public User updateUser(UserObj obj, Long id) {

		User user = userRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException(id));
		
		UserType type = userTypeRepository.findById(obj.getUserTypeId().longValue())
				.orElseThrow(() -> new UserNotFoundException(obj.getUserTypeId().longValue()));
		
		user.setName(obj.getName());
		user.setSurname(obj.getSurname());
		user.setAge(obj.getAge());
		user.setType(type);	
		
		
		return userRepository.save(user);
	}

	public void deleteById(Long id) {

		User user = userRepository.findById(id)
				.orElseThrow(() -> new UserNotFoundException(id));
		userRepository.delete(user);
	}


}