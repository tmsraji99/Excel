package com.example.demo.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Sales;

@Repository
public interface SalesRepositoryInf extends ElasticsearchRepository<Sales, Integer> {

}
