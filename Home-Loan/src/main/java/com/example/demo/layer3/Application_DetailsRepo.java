package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Application_Details;
import com.example.demo.layer2.Customer;
@Repository
public interface Application_DetailsRepo {
	void insertApplication_Details(Application_Details Aobj);
	  
	Application_Details selectApplication_Details(int application_No); //R
		List<Application_Details> selectApplication_Details(); //RA
		
		void updateApplication_Details(Application_Details Aobj); //U
		void deleteApplication_Details(int application_No); //D
}
