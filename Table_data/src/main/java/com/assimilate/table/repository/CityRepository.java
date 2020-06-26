package com.assimilate.table.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.table.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

//	List<City> findByStatefk(int stateId);



}
