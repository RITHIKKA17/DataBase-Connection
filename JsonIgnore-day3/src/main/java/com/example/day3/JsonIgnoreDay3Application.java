package com.example.day3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class JsonIgnoreDay3Application {

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(JsonIgnoreDay3Application.class, args);
		Person p = new Person(1,"Rithikka","18");
		ObjectMapper o=new ObjectMapper();
		String json = o.writeValueAsString(p);
		System.out.print(json);
	}

}
