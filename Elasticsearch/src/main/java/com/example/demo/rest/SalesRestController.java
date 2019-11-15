package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Sales;
import com.example.demo.service.SalesServiceImpl;

@RestController("/sales")
public class SalesRestController {

	@Autowired
	private SalesServiceImpl salesServiceImpl;

	@PostMapping("/save")
	public String salesCreate(@RequestParam("sales") Sales sales) {

		salesServiceImpl.save(sales);
		System.out.println("save");

		return "Hello";
	}
}
