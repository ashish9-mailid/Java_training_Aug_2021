package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyController {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@PostMapping("/mq/publishitem")
	public Email publishItem(@RequestBody Email email)
	{
		jmsTemplate.convertAndSend("testQueue",email);
		return email;
		
	}
}
