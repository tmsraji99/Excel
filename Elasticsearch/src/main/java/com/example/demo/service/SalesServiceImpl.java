package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Sales;
import com.example.demo.repository.SalesRepositoryInf;

@Service
public class SalesServiceImpl {

	@Autowired
	private SalesRepositoryInf salesRepositoryInf;

	public Sales save(Sales sales) {
		System.out.println(sales.toString());
		return salesRepositoryInf.save(sales);

	}

	public List<Sales> getAll() {
		List<Sales> allList = new ArrayList<>();
		salesRepositoryInf.findAll().forEach(a -> allList.add(a));
		return allList;
	}

	public Sales findById(Integer id) {
		Optional<Sales> findById = salesRepositoryInf.findById(id);
		return findById.orElse(findById.get());
	}

	public Boolean deleteById(Integer id) {
		Optional<Sales> findById = salesRepositoryInf.findById(id);

		if (findById.orElse(findById.get()).equals(null))
			return false;
		else {
			salesRepositoryInf.deleteById(id);
			return true;
		}

	}

	
}
