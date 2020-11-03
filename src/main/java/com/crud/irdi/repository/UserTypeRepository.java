package com.crud.irdi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.crud.irdi.model.UserType;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long>, JpaSpecificationExecutor<UserType>  {

}
