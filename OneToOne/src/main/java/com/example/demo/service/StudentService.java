package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.StudentDetails;
import com.example.demo.repository.StudentDetailsRepo;
@Service
public class StudentService {
	@Autowired
	public StudentDetailsRepo srepo;
	public StudentDetails saveInfo(StudentDetails pmodel)
	{
		return srepo.save(pmodel);
	}
	public List <StudentDetails> getInfo(){
		return srepo.findAll();
	}
	public StudentDetails updateInfo(StudentDetails pmod)
	{
		return srepo.saveAndFlush(pmod);
	}
	public void deleteInfo(int id)
	{
		srepo.deleteById(id);
	}

}
