package com.nagarro.microserves;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int customerID;
	private String customerName;
	private String customerNumber;
	
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
	public Customer(String customerName, String customerNumber) {
		super();
		this.customerName = customerName;
		this.customerNumber = customerNumber;
	}
	
	
}
