package com.assimilate.table.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.table.model.State;
import com.assimilate.table.repository.StateRepository;

@Service
public class StateAddServiceImpl implements StateAddService {

	@Autowired
	private StateRepository stateRepository;
	
	@Override
	public State save(State state) {
		
		State res = stateRepository.save(state);
		return res;
	}

	@Override
	public List<State> getAll() {
	
		List<State> res = stateRepository.findAll();
		return res;
	}

	@Override
	public List<State> getAllState() {
		
		List<State> res = stateRepository.findAll();
		return res;
	}

	@Override
	public State getStateId(String state) {
		
		State res = stateRepository.findByState(state);
		return res;
	}

}
