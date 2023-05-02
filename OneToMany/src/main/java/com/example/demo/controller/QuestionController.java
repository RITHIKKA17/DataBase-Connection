package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Question;
import com.example.demo.repository.Questionrepo;

@RestController
@RequestMapping("/question")
public class QuestionController {
	@Autowired
	Questionrepo qrepo;
	@PostMapping("")
	public String saveDetails(@RequestBody Question qn)
	{
		qrepo.save(qn);
		return "Data saved";
	}
	@GetMapping("")
	public List<Question> getDetails()
	{
		return qrepo.findAll();
	}
	@PutMapping("")
	public String updateDetails(@RequestBody Question qp)
	{
		qrepo.saveAndFlush(qp);
		return "Data changed";
	}
	@DeleteMapping("/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		qrepo.deleteById(id);
		return "Id "+id+" deleted";
	}

}
