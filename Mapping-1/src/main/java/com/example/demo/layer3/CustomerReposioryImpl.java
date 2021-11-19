package com.example.demo.layer3;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Customer;

@Repository
public class CustomerReposioryImpl extends BaseRepository implements CustomerReposiory{

	@Transactional
	public void insertCustomer(Customer cobj) {
		// TODO Auto-generated method stub
		super.persist(cobj); // invoking the dummy persist of the super class
		System.out.println("Customer inserted...");
	}

	@Override
	public List<Customer> selectCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

}
