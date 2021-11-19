package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Customer;

@Repository
public interface CustomerReposiory {
   void insertCustomer(Customer cobj);
   List<Customer> selectCustomers();
}
