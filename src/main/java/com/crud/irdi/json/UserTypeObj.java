package com.crud.irdi.json;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Json containing the data of UserType object")
public class UserTypeObj implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@NotBlank(message="user is blank")
	@ApiModelProperty(value = "Value for name of User", required = true, allowEmptyValue = false)
 	private String name;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
}
