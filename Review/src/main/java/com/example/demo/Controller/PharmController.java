package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.PharmModel;
import com.example.demo.Service.PharmService;

@RestController
public class PharmController {
	@Autowired
	public PharmService pserv;
	@PostMapping("/savePharm")
	public PharmModel addDetails(@RequestBody PharmModel phm)
	{
		return pserv.saveInfo(phm);
	}
	@GetMapping("/getPharm")
	public List <PharmModel> getDetails(){
		return pserv.getInfo();
	}
	@PutMapping("/updatePharm")
	public PharmModel display(@RequestBody PharmModel pm)
	{
		return pserv.UpdateInfo(pm);
	}
	@DeleteMapping("/deletePharm/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		pserv.deleteInfo(id);
		return "Id "+id+" deleted";
	}
	@DeleteMapping("/del")
	public String deleteByParams(@RequestParam int id)
	{
		pserv.deleteInfo(id);
		return "Id "+id+" deleted";
	}

}
