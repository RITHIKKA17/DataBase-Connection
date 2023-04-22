package com.example.day2.task2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClassEx2 {
	public String name="Rithikka";
	@GetMapping("/name")
	public String display() {
		return "I am "+name;
	}

}
