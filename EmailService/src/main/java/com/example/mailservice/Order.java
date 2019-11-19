package com.example.mailservice;

public class Order {

	private String fName;
	private String lName;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Order(String fName, String lName) {
		super();
		this.fName = fName;
		this.lName = lName;
	}

	public Order() {
		super();
	}

	@Override
	public String toString() {
		return "Order [fName=" + fName + ", lName=" + lName + "]";
	}

}
