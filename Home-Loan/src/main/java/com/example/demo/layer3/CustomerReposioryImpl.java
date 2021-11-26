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

	@Transactional
	public Customer selectCustomer(int cust_id) {
		System.out.println("CustomerRepositoryImpl : selecting customer  by cust_id");
		Customer cus = super.find(Customer.class, cust_id);
		System.out.println("repo : cus "+cus);
		System.out.println("dept "+cus.getCust_Id());
		System.out.println("dept "+cus.getFirstName());
		System.out.println("dept "+cus.getMiddleName());
		System.out.println("dept "+cus.getLastName());
		System.out.println("dept "+cus.getAdhaarNo());
		System.out.println("dept "+cus.getEmail());
		System.out.println("dept "+cus.getNationality());
		System.out.println("dept "+cus.getPanCard());
	


		
		
		return cus;
	}

	@Transactional
	public List<Customer> selectCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void updateCustomer(Customer cobj) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public void deleteCustomer(int cust_id) {
		// TODO Auto-generated method stub
		
	}

	

}
