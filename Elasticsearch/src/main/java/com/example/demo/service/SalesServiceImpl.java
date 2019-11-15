package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Sales;
import com.example.demo.repository.SalesRepositoryInf;

@Component
public class SalesServiceImpl {

	@Autowired
	private SalesRepositoryInf salesRepositoryInf;

	public void save(Sales sales) {
		salesRepositoryInf.save(sales);

	}

}
