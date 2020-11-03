package com.crud.irdi.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.crud.irdi.json.UserTypeObj;
import com.crud.irdi.model.UserType;
import com.crud.irdi.service.UserTypeService;
import com.sun.istack.NotNull;

@CrossOrigin
@RestController
@RequestMapping("/userType")
public class UserTypeController {

	@Autowired
	UserTypeService userTypeService;
	
	@PostMapping
	public ResponseEntity<UserType> save(
			@RequestBody @Valid  UserTypeObj obj, HttpServletRequest request) {
		
 		UserType user = userTypeService.saveUserType(obj);
 
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@GetMapping(value = { "/{id}" })
	public ResponseEntity<UserType> getById(
			@PathVariable("id") @NotNull Long id) {

 		UserType type = userTypeService.getUserTypeById(id);
		
		return new ResponseEntity<>(type, HttpStatus.OK);

	}
	
	@PutMapping(value = { "/{id}" })
	public ResponseEntity<UserType> update(@PathVariable("id") Long id,
			@RequestBody  UserTypeObj obj, HttpServletRequest request) {
				
		UserType type = userTypeService.updateUserType(obj, id);
		
		return new ResponseEntity<>(type, HttpStatus.OK);
		
	}
	
	@DeleteMapping(value = { "/{id}" })
	public ResponseEntity<String> deleteById(@PathVariable("id") @NotNull Long id) {


		userTypeService.deleteById(id);
		
		return new ResponseEntity<>("ok", HttpStatus.OK);
		
	}
	
	}