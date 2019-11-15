package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.sender.Sender;

@RestController
public class SalesController {
	@Autowired
	Sender jmsProducer;

	@RequestMapping(value = "/produce")
	public String produce(@RequestParam("msg") String msg) {
		jmsProducer.send(msg);
		return "Ok";
	}
}
