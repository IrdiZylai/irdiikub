package com.crud.irdi.json;

import java.io.Serializable;
import javax.validation.constraints.NotBlank;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
 

@ApiModel(description = "Json containing the data of User object")
public class UserObj implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@NotBlank(message="user is blank")
	@ApiModelProperty(value = "Value for name of User", required = true, allowEmptyValue = false)
 	private String name;
	
 	private String surname;
	
 	private Integer age;

    private Integer userTypeId;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getUserTypeId() {
		return userTypeId;
	}

	public void setUserTypeId(Integer userTypeId) {
		this.userTypeId = userTypeId;
	}

	
	
}
