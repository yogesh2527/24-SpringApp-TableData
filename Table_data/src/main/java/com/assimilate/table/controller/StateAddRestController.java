package com.assimilate.table.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.table.model.State;
import com.assimilate.table.service.StateAddService;
import com.assimilate.table.util.EmailUtil;

@CrossOrigin("*")
@RestController
@RequestMapping("/State/api")
public class StateAddRestController {

	@Autowired
	private StateAddService stateAddService;
	
	@Autowired
	private EmailUtil emailUtil;
	
	@PostMapping("/send")
	public String sendEmail()
	{
		
		emailUtil.sendEmail("yogeshbagade25@gmail.com", "thank you registering ", "welcome to gmail");
		
		return "sent email successfully";
	}
	
	@PostMapping("/create")
	public State addState(@RequestBody State state)
	{
		State response =stateAddService.save(state);
		
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
	
	@GetMapping("/getAll")
	public List<State> getAll()
	{
		List<State> response = stateAddService.getAll();
		
		if (response== null) {
			System.out.println("No Record in database");
			return response;
		}
		else
		{
			System.out.println("Record Found");
			return response;
		}
		
	}
	
	@GetMapping("/getAllState")
	public List<State> getAllState()
	{
		List<State> response = stateAddService.getAllState();
		return response;
	}
	
	@GetMapping("/getAllCity/{{state}}")
	public State getAllCity(@PathVariable ("state") String state)
	{
		State response = stateAddService.getStateId(state);
		
		return response;
	}
}
