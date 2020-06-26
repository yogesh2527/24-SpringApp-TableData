package com.assimilate.table.service;

import java.util.List;

import com.assimilate.table.model.State;

public interface StateAddService {

	State save(State state);

	List<State> getAll();

	List<State> getAllState();

	State getStateId(String state);

}
