package com.assimilate.table.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.table.model.City;
import com.assimilate.table.repository.CityRepository;

@Service
public class CityAddServiceimpl implements CityAddSerivce {

	@Autowired
	private CityRepository cityRepository;
	
	@Override
	public City save(City city) {
		
		City res = cityRepository.save(city);
		
		return res;
	}

//	@Override
//	public List<City> getAll(int stateId) {
//		
//		List<City> res = cityRepository.findByStatefk(stateId);
//		return res;
//	}

}
