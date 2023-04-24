package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.PharmModel;
import com.example.demo.Repository.PharmRepo;

@Service
public class PharmService {
	@Autowired
	public PharmRepo prepo;
	public PharmModel saveInfo(PharmModel pmodel)
	{
		return prepo.save(pmodel);
	}
	public List <PharmModel> getInfo(){
		return prepo.findAll();
	}
	public PharmModel UpdateInfo(PharmModel io)
	{
		return prepo.saveAndFlush(io);
	}
	public void deleteInfo(int id)
	{
		prepo.deleteById(id);
	}

}
