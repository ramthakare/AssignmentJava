package com.example.demo.layer4;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Bank;
import com.example.demo.layer2.Customer;


@Repository
public interface CustomerService {
   void insertCustomer(Customer cobj)throws CustomerExits;;
  
	 Customer selectCustomer(int cust_id); //R
		List<Customer> selectCustomers(); //RA
		
		void updateCustomer(Customer cobj); //U
		void deleteCustomer(int cust_id); //D
}
