package com.assimilate.table.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.table.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

	State findByState(String state);

}
