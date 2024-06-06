package com.omrbranch.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.omrbranch.entity.StateEntity;

@Service

public interface StateService {
	
	List<StateEntity> getStateInfo();
	
	StateEntity getStateInfoById(int stateId);
	
	StateEntity getStateInfoByName(String stateName);

}
