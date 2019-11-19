package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

@Document(indexName = "sales", type = "data")
public class Sales {

	@Id
	private Integer salesId;
	// @Field
	private String region;
	// @Field
	private String country;
	// @Field
	private Integer unitsSold;

	public Integer getSalesId() {
		return salesId;
	}

	public void setSalesId(Integer salesId) {
		this.salesId = salesId;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Integer getUnitsSold() {
		return unitsSold;
	}

	public void setUnitsSold(Integer unitsSold) {
		this.unitsSold = unitsSold;
	}

	public Sales() {
		super();
	}

	public Sales(Integer salesId, String region, String country, Integer unitsSold) {
		super();
		this.salesId = salesId;
		this.region = region;
		this.country = country;
		this.unitsSold = unitsSold;
	}

	@Override
	public String toString() {
		return "Sales [salesId=" + salesId + ", region=" + region + ", country=" + country + ", unitsSold=" + unitsSold
				+ "]";
	}

}
