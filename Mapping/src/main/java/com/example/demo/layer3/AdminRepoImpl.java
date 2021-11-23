package com.example.demo.layer3;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Admin;
@Repository
public class AdminRepoImpl implements AdminRepo
{
	public AdminRepoImpl() {
		System.out.println("AdminRepoImpl ..");	
}

	@Override
	public Admin getValidation(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
