package com.example.demo.layer2;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="property2")
public class Property {
	@Id
	@GeneratedValue
	private int propertyId;
	
	
	private String propertyLoc;
	
	
	private String propertyName;
	
	private float estimatedAmt;
	

	private String typeOfEmp;
	
	
	private int retAge;
	
	
	private  String orgType;
	
	
	private  String employerName;
	
	
	private String income;
	
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "property")
	private Customer customer;
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public int getPropertyId() {
		return propertyId;
	}
	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}
	public String getPropertyLoc() {
		return propertyLoc;
	}
	public void setPropertyLoc(String propertyLoc) {
		this.propertyLoc = propertyLoc;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public float getEstimatedAmt() {
		return estimatedAmt;
	}
	public void setEstimatedAmt(float estimatedAmt) {
		this.estimatedAmt = estimatedAmt;
	}
	public String getTypeOfEmp() {
		return typeOfEmp;
	}
	public void setTypeOfEmp(String typeOfEmp) {
		this.typeOfEmp = typeOfEmp;
	}
	public int getRetAge() {
		return retAge;
	}
	public void setRetAge(int retAge) {
		this.retAge = retAge;
	}
	public String getOrgType() {
		return orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public String getIncome() {
		return income;
	}
	public void setIncome(String income) {
		this.income = income;
	}
	
	
}
