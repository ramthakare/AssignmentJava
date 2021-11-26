package com.example.demo.layer3;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Admin;
@Repository
public interface AdminRepo 
{
	Admin getValidation(String username,String password);
}
