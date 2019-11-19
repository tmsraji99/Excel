package com.example.demo.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Sales;
import com.example.demo.service.SalesServiceImpl;

@RestController
public class SalesRestController {

	@Autowired
	private SalesServiceImpl salesServiceImpl;

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ResponseEntity<Sales> salesCreate(@RequestBody Sales sales) {
		System.out.println("controller  " + sales.toString());
		Sales sales1 = salesServiceImpl.save(sales);
		System.out.println(sales1.toString());
		if (sales1.equals(null))
			return new ResponseEntity<>(sales, HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<>(sales, HttpStatus.OK);
	}

	@RequestMapping(value = "/getAll", method = RequestMethod.GET)
	public ResponseEntity<?> getAll() {
		List<Sales> sales = salesServiceImpl.getAll();
		if (sales.size() == 0 || sales.equals(null))
			return new ResponseEntity<>(sales, HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<>(sales, HttpStatus.OK);
	}

	@RequestMapping(value = "/getbyId/{id}", method = RequestMethod.GET)
	public ResponseEntity<Sales> getById(@PathVariable(value = "id", required = true) Integer id) {
		System.out.println(id);
		Sales object = salesServiceImpl.findById(id);
		if (object.equals(null))
			return new ResponseEntity<>(object, HttpStatus.UNPROCESSABLE_ENTITY);
		else
			return new ResponseEntity<>(object, HttpStatus.OK);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deletebyId(@PathParam(value = "id") Integer id) {

		Boolean value = salesServiceImpl.deleteById(id);
		if (value)
			return new ResponseEntity<>("Succcess", HttpStatus.OK);
		else
			return new ResponseEntity<>("no user", HttpStatus.UNPROCESSABLE_ENTITY);
	}

}