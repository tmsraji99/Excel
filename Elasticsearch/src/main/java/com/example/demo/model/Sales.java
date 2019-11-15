package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "Sales", type = "data")
public class Sales {

	@Id
	private Integer salesId;
	private String region;
	private String country;
	private Integer unitsSold;

}
