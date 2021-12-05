package com.example.demo.layer3;

import java.util.ArrayList;
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
		System.out.println("cus "+cus.getCust_Id());
		System.out.println("cus "+cus.getFirstName());
		System.out.println("cus "+cus.getMiddleName());
		System.out.println("cus "+cus.getLastName());
		System.out.println("cus "+cus.getAdhaarNo());
		System.out.println("cus "+cus.getEmail());
		System.out.println("cus"+cus.getNationality());
		System.out.println("cus "+cus.getPanCard());
		
	


		
		
		return cus;
	}

	@Transactional
	public List<Customer> selectCustomers() {
		List<Customer>  custList = new ArrayList<Customer>();

		System.out.println("CustomerRepositoryImpl : Selecting all customerss...");
		custList =  super.findAll("Customer");
		System.out.println("repo : custList ref  "+custList);
		System.out.println("repo : custList size "+custList.size());

		for(Customer cus : custList) {
			//System.out.println("repo: dept "+dept.getDepartmentNumber());
			System.out.println("cus"+cus.getCust_Id());
			System.out.println("cus "+cus.getFirstName());
			System.out.println("cus "+cus.getMiddleName());
			System.out.println("cus "+cus.getLastName());
			System.out.println("cus "+cus.getAdhaarNo());
			System.out.println("cus "+cus.getEmail());
			System.out.println("cus "+cus.getNationality());
			System.out.println("cus "+cus.getPanCard());
		

		}
		return custList;
	}

	@Transactional
	public void updateCustomer(Customer cobj) {
		System.out.println("CustomerRepositoryImpl : Updating Customer...");
		super.merge(cobj);
	}

	@Transactional
	public void deleteCustomer(int cust_id) {
		System.out.println("CustomerRepositoryImpl : Deleting customer");
		super.remove(Customer.class, cust_id);
		
	}

	

}
