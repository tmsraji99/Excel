package com.example.demo.model;

public class Sales {
	private String region;
	private String country;
	private Integer unitsSold;

	public Sales(String region, String country, Integer unitsSold) {
		super();
		this.region = region;
		this.country = country;
		this.unitsSold = unitsSold;
	}

	public Sales() {
		super();
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

}
