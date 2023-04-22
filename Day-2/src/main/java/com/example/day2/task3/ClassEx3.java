package com.example.day2.task3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClassEx3 {
	@Value("${colourname}")
	public String colour;
	@GetMapping("/colour")
	@ResponseBody
	public String display() {
		return "My favourite colour is "+colour;
	}

}
