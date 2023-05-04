package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.SignupModel;
import com.example.demo.Service.SignupService;

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@Service
public class SignupController {
	@Autowired
	public SignupService sserv;
	@Tag( name="Post-signup",description="Posting signup details")
	@PostMapping("/saveSign")
	public SignupModel addDetails(@RequestBody SignupModel pm)
	{
		return sserv.saveInfo(pm);
	}
	
	@Tag( name="Get-signup",description="Getting signup details")
	@GetMapping("/getSign")
	public List <SignupModel> getDetails(){
		return sserv.getInfo();
	}
	@Tag( name="Signup",description="Checking signup details")
	@PostMapping("/signup")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=sserv.checkLogin(username,password);
		return result;
	}

}
