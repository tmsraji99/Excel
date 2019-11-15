package com.example.demo.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.example.demo.model.Sales;

public interface SalesRepositoryInf extends ElasticsearchRepository<Sales, Integer> {

}
