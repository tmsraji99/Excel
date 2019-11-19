package com.example.mailservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	private SimpleOrderManager simpleOrderManager;

	@PostMapping("/send")
	public String emailSending() {
		simpleOrderManager.sendEmail();
		return "ok";
	}
}
