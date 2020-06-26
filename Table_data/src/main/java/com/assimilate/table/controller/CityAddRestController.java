package com.assimilate.table.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.table.model.City;
import com.assimilate.table.service.CityAddSerivce;

@CrossOrigin("*")
@RequestMapping("/city/api")
@RestController
public class CityAddRestController {

	@Autowired
	private CityAddSerivce cityAddService;
	
	@PostMapping("/addCity")
	public City addCity(@RequestBody City city)
	{
		City response =cityAddService.save(city);
		
		if (response== null) {
			System.out.println("State is not inserted");
			return response;
		}
		else
		{
			System.out.println("state is inserted");
			return response;
		}
	}
	
//	@GetMapping("/getCityByStateId/{stateId}")
//	public List<City> getAll( @PathVariable("stateId") int stateId )
//	{
//		List<City> response = cityAddService.getAll(stateId);
//		
//		if (response== null) {
//			System.out.println("No Record in database");
//			return response;
//		}
//		else
//		{
//			System.out.println("Record Found");
//			return response;
//		}
//		
//	}
}
