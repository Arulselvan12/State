package com.omrbranch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.omrbranch.entity.StateEntity;
import com.omrbranch.serviceimpl.StateServiceImpl;

@RestController

public class StateController {
	
	@Autowired
	StateServiceImpl stateServiceImpl;
	
	@GetMapping(value="/state")
	public List<StateEntity> getStateDetails() {
		List<StateEntity> stateInfo = stateServiceImpl.getStateInfo();
		return stateInfo;
	}
	
	@GetMapping(value="/stateId/{stateId}")
	public StateEntity getStateDetailsById(@PathVariable int stateId) {
		StateEntity stateInfoById = stateServiceImpl.getStateInfoById(stateId);
		return stateInfoById;
	}
	
	@GetMapping(value="/stateName/{stateName}")
	public StateEntity getStateDetailsByName(@PathVariable String stateName) {
		StateEntity stateInfoByName = stateServiceImpl.getStateInfoByName(stateName);
		return stateInfoByName;
	}

}
