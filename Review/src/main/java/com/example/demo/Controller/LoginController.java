package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.UserModel;
import com.example.demo.Service.LoginService;

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/user")


public class LoginController {
	@Autowired
	private LoginService lser;
	//To log in:
	@Tag( name="Login-check",description="checking details in login")
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=lser.checkLogin(username,password);
		return result;
	}
	//To add users
	@Tag( name="Login-post",description="Posting details in login")
	@PostMapping("/add")
	public UserModel AddUser(@RequestBody UserModel cl)
	{
		return lser.addUser(cl);
	}

	@Tag( name="Login-get",description="Getting details in login")
	@GetMapping("/getuser")
	public List<UserModel> listAll()
	{
		return lser.getUser();
	}
	

}
