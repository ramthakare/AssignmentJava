package com.example.demo.layer5Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Customer;

import com.example.demo.layer3.CustomerReposioryImpl;

@RestController
@RequestMapping("/cust")
public class CustomerController {

	@Autowired
	CustomerReposioryImpl cusRepo;
	
	@GetMapping("/getCust/{x}")//localhost:8080/cust/getCust
	public Customer getCust(@PathVariable int x)
	{
		Customer cust = null;
		cust=cusRepo.selectCustomer(x);
		
		System.out.println("controller : cust : "+cust.getCust_Id());
		return cust;
	}
//	@RequestMapping("/getAll")//localhost:8080/cust/getAll
//	public List<Customer> getCusts()
//	{
//		System.out.println("getAll");
//		List<Customer> custList;
//		custList=cusRepo.selectCustomers();
//		return custList;
//	}
	
}
