package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Customer;

@Repository
public interface CustomerRepo 
{
	void insertCustomer(Customer cobj);
	Customer selectCustomer(int cust_id); //R
	List<Customer> selectCustomers();
}
