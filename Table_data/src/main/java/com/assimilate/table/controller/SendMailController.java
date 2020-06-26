package com.assimilate.table.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.table.model.SendMail;
import com.assimilate.table.util.EmailUtil;

@RestController
@RequestMapping("/api")
public class SendMailController {

	private EmailUtil emailUtil;
	
    @PostMapping("/sendMail")
	public void sendMail(@RequestBody SendMail sendMail)
	{
		
    
	 emailUtil.saveMail(sendMail);
		
		
	}
	
}
