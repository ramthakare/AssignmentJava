package com.example.demo.layer4;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Customer;


@Repository
public class CustomerserviceImpl implements CustomerService{

	@Override
	public void insertCustomer(Customer cobj) throws CustomerExits {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer selectCustomer(int cust_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> selectCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateCustomer(Customer cobj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(int cust_id) {
		// TODO Auto-generated method stub
		
	}

	
	

}
