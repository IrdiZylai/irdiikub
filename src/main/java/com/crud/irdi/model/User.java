package com.crud.irdi.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "user")
public class User implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name", nullable = false, length = 10)
	private String name;
	
	@Column(name = "surname", nullable = false, length = 10)
	private String surname;
	
	@Column(name = "age", nullable = false, length = 10)
	private Integer age;


    @ManyToOne
    @JoinColumn(name="TYPE", foreignKey = @ForeignKey(name = "user_type"), nullable = false)
    @JsonManagedReference
    private UserType type;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public UserType getType() {
		return type;
	}

	public void setType(UserType type) {
		this.type = type;
	}
 
	
}
