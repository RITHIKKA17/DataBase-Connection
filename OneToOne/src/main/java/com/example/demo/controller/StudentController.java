package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.StudentDetails;
import com.example.demo.service.StudentService;

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@Service
public class StudentController {
	@Autowired
	public StudentService serv;
	@Tag(name="Post", description="Posting details")
	@PostMapping("/add")
	public StudentDetails addDetails(@RequestBody StudentDetails phm)
	{
		return serv.saveInfo(phm);
	}
	@Tag(name="Get", description="Getting details")
	@GetMapping("/get")
	public List <StudentDetails> getDetails(){
		return serv.getInfo();
	}
	@Tag(name="Update", description="Updating details")
	@PutMapping("/update")
	public StudentDetails updateDetails(@RequestBody StudentDetails ob)
	{
		return serv.updateInfo(ob);
	}
	@Tag(name="Delete", description="Deleting details")
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		serv.deleteInfo(id);
		return "Id "+id+" deleted";
	}

}
