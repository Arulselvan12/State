package com.omrbranch.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omrbranch.entity.StateEntity;
import com.omrbranch.repository.StateRepository;
import com.omrbranch.service.StateService;

@Component

public class StateServiceImpl implements StateService{
	
	@Autowired
	StateRepository stateRepository;

	@Override
	public List<StateEntity> getStateInfo() {
		List<StateEntity> findAll = stateRepository.findAll();
		return findAll;
	}

	@Override
	public StateEntity getStateInfoById(int stateId) {
		StateEntity findByStateId = stateRepository.findByStateId(stateId);
		return findByStateId;
	}

	@Override
	public StateEntity getStateInfoByName(String stateName) {
		StateEntity findByStateName = stateRepository.findByStateName(stateName);
		return findByStateName;
	}

	

	

}
