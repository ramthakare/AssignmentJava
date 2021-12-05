package com.example.demo.layer3;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Application_Details;

@Repository
public class Application_DetailsRepoImp extends BaseRepository implements Application_DetailsRepo 
{

	@Transactional
	public void insertApplication_Details(Application_Details Aobj) 
	{
		super.persist(Aobj);
		System.out.println("Application_Details insert");
		
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
