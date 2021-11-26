package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Application_Details;

@Repository
public class Application_DetailsRepoImp implements Application_DetailsRepo 
{

	@Override
	public void insertApplication_Details(Application_Details Aobj) 
	{
		
		
	}

	@Override
	public Application_Details selectApplication_Details(int application_No) {
		return null;
	}

	@Override
	public List<Application_Details> selectApplication_Details() {
		return null;
	}

	@Override
	public void updateApplication_Details(Application_Details Aobj) {
		
	}

	@Override
	public void deleteApplication_Details(int application_No) {
		
	}

}
