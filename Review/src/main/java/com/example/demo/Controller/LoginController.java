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
@RestController
@RequestMapping("/user")


public class LoginController {
	@Autowired
	private LoginService lser;
	//To log in:
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=lser.checkLogin(username,password);
		return result;
	}
	//To add users
	@PostMapping("/add")
	public UserModel AddUser(@RequestBody UserModel cl)
	{
		return lser.addUser(cl);
	}

	@GetMapping("/getuser")
	public List<UserModel> listAll()
	{
		return lser.getUser();
	}
	//To reset Password
	@PostMapping("/reset")
	public String resetPassword(@RequestBody Map<String,String> resetData)
	{
		String username = resetData.get("username");
		String Password = resetData.get("Password");
		String newPassword = resetData.get("newPassword");
		
		String result = lser.resetPassword(username, Password, newPassword);
		
		return result;
	}

}
