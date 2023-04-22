package com.example.day2.task1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClassEx1 {
	@GetMapping("/welcome")
	@ResponseBody
	public String display() {
		return "Welcome to RestAPI";
	}

}
