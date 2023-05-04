package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.SignupModel;
import com.example.demo.Repository.SignupRepo;

@Service
public class SignupService {
	@Autowired
	public SignupRepo srep;
	public SignupModel saveInfo(SignupModel ab)
	{
		return srep.save(ab);
	}
	public List <SignupModel> getInfo(){
		return srep.findAll();
	}
	public String checkLogin(String username,String password)
	{
	SignupModel user= srep.findByusername(username);
	if(user==null)
	{
		return "No user found";
	}
	else
	{
		if(user.getPassword().equals(password))
		{
			return "Signup Succesful";
		}
		else
		{
			return "Signup Failed";
		}
	}

   }
}
