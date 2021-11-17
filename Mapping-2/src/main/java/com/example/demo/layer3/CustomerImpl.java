package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Customer;


@Repository
public class CustomerImpl extends BaseRepository implements CustomerRepo{
	public CustomerImpl() {
		System.out.println("CustomerImpl ..");	
	}
//	@Override
	@Transactional
	public void insertCustomer(Customer cobj) {
		// TODO Auto-generated method stub
		super.persist(cobj); // invoking the dummy persist of the super class
	System.out.println("Customer inserted...");
		
	}

	@Override
	@Transactional
	public Customer selectCustomer(int cust_id) {
		// TODO Auto-generated method stub
		System.out.println("CustomerImpl : selecting customer by cust_id");
		
		Customer cust=super.find(Customer.class,cust_id);
		System.out.println("repo : cust "+cust);
		System.out.println("repo "+cust.getCust_Id());
		System.out.println("repo "+cust.getFirstName());
		System.out.println("repo "+cust.getMiddleName());
		System.out.println("repo "+cust.getLastName());
		System.out.println("repo "+cust.getEmail());
		System.out.println("repo "+cust.getPassword());
		System.out.println("repo "+cust.getPhoneNo());
		System.out.println("repo "+cust.getDob());
		System.out.println("repo "+cust.getNationality());
		System.out.println("repo "+cust.getAdhaarNo());
		System.out.println("repo "+cust.getAdhaarNo());
		return cust;
	}

	@Override
	public List<Customer> selectCustomers() {
		// TODO Auto-generated method stub
		List<Customer>  custList = new ArrayList<Customer>();
		
		System.out.println("CustomerImpl : selecting  All Customers.....");
		custList =  super.findAll("Customer");
		System.out.println("repo : custList ref  "+custList);
		System.out.println("repo : custList size "+custList.size());
		for(Customer cust : custList) 
		{
			System.out.println("repo : cust "+cust);
			System.out.println("repo "+cust.getFirstName());
			System.out.println("repo "+cust.getMiddleName());
			System.out.println("repo "+cust.getLastName());
			System.out.println("repo "+cust.getEmail());
			System.out.println("repo "+cust.getPassword());
			System.out.println("repo "+cust.getPhoneNo());
			System.out.println("repo "+cust.getDob());
			System.out.println("repo "+cust.getNationality());
			System.out.println("repo "+cust.getAdhaarNo());
			System.out.println("repo "+cust.getAdhaarNo());
		}
		

		return custList;
	}
	

	


}
