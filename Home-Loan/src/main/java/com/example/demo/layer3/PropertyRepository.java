package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Bank;
import com.example.demo.layer2.Customer;
import com.example.demo.layer2.Property;

@Repository
public interface PropertyRepository {
	void insertProperty(Property pobj);
	Property selectProperty(int propertyId); //R
	List<Property> selectBanks(); //RA
	
	void updateProperty(Property pobj); //U
	void deleteProperty(int propertyId);
}
