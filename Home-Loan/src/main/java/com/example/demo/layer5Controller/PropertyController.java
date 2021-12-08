package com.example.demo.layer5Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Property;
import com.example.demo.layer3.PropertyRepositoryImpl;

@RestController
@RequestMapping("/property")
public class PropertyController {

	@Autowired
	PropertyRepositoryImpl proRepo;
	
	@RequestMapping("/getproperty/{propertyId}")//localhost:8080/property/getproperty/27
	public Property getproperty(@PathVariable("propertyId") int x)
	{
		Property property = null;
		property=proRepo.selectProperty(x);
		
		System.out.println("controller : property : "+property.getPropertyId());
		return property;
	}
//	@RequestMapping("/getAll")//localhost:8080/cust/getAll
//	public List<Property> getloans()
//	{
//		System.out.println("getAll");
//		List<Property> propertyList;
//		propertyList=proRepo.selectPropertys();
//		return propertyList;
//	}
//	
}
