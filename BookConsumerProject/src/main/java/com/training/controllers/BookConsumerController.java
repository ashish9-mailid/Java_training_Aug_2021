package com.training.controllers;



import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.training.bean.Book;

@RequestMapping("/storeconsumer")
@RestController
public class BookConsumerController {

	@Autowired
	private RestTemplate restTemplate;
	
	String producerUrl = "http://localhost:8082/store/getbook/isbn/{isbn}";
	
	//localhost:8083/storeconsumer/getpbook/isbn/2345/qty/10 
	@GetMapping("/getpbook/isbn/{isbn}/qty/{qty}")
	public Book getBookServiceForQtyAndAmount(@PathVariable("isbn") String isbn,@PathVariable("qty") long qty)
	{
		//RestTemplate restTemplate = new RestTemplate();
		Map<String,String> uriMap=new HashMap<>();
		uriMap.put("isbn", isbn);
		
		Book bookReceived = restTemplate.getForObject(producerUrl, Book.class, uriMap);
		//System.out.println(bookReceived);
		bookReceived.setQty(qty);
		bookReceived.setAmount(qty * bookReceived.getPrice());
				
		return bookReceived;
	}
	
		
	@GetMapping("helloconsumer")
	public String sayConsumerHello()
	{
		return "Hello Consumer Service";
	}
}
