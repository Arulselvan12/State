package com.omrbranch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.omrbranch.entity.StateEntity;


@Repository

public interface StateRepository extends JpaRepository<StateEntity, Integer>{
	
	StateEntity findByStateId(int stateId);
	
	StateEntity findByStateName(String stateName);

}
