package com.crud.irdi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.irdi.exception.ApiErrorResponse;
import com.crud.irdi.json.UserObj;
import com.crud.irdi.model.User;
import com.crud.irdi.service.UserService;
import com.sun.istack.NotNull;

import org.springframework.beans.factory.annotation.Autowired;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping
	public ResponseEntity<User> save(
			@RequestBody @Valid  UserObj obj, HttpServletRequest request) {
		
 		User user = userService.saveUser(obj);
 
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@GetMapping(value = { "/{id}" })
	public ResponseEntity<User> getById(
			@PathVariable("id") @NotNull Long id) {

 		User user = userService.getUserById(id);
		
		return new ResponseEntity<>(user, HttpStatus.OK);

	}
	
	@PutMapping(value = { "/{id}" })
	public ResponseEntity<User> update(@PathVariable("id") Long id,
			@RequestBody  UserObj obj, HttpServletRequest request){
				
		User user = userService.updateUser(obj, id);
		
		return new ResponseEntity<>(user, HttpStatus.OK);
		
	}
	
	@DeleteMapping(value = { "/{id}" })
	public ResponseEntity<String> deleteById(@PathVariable("id") @NotNull Long id){


		userService.deleteById(id);
		
		return new ResponseEntity<>("ok", HttpStatus.OK);
		
	}
}
