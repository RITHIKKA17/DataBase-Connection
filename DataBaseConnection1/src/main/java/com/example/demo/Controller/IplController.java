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

import com.example.demo.Model.IplModel;
import com.example.demo.Repository.IplRepo;
import com.example.demo.Service.IplService;

@RestController
public class IplController {
	@Autowired
	public IplService iserv;
	@PostMapping("/saveinfo")
	public IplModel addDetails(@RequestBody IplModel iml)
	{
		return iserv.saveInfo(iml);
	}
	@GetMapping("/getIpl")
	public List <IplModel> getDetails(){
		return iserv.getInfo();
	}
	@PutMapping("/putIpl")
	public IplModel display(@RequestBody IplModel imlo)
	{
		return iserv.UpdateInfo(imlo);
	}
	@DeleteMapping("/deleteIpl/{playerId}")
	public String deleteDetails(@PathVariable int playerId)
	{
		iserv.deleteInfo(playerId);
		return "playerId "+playerId+" deleted";
	}
	@DeleteMapping("/del")
	public String deleteByParams(@RequestParam int playerId)
	{
		iserv.deleteInfo(playerId);
		return "playerId "+playerId+" deleted";
	}
	@GetMapping("/sortDes/{pname}")
	public List<IplModel> sortPlayer(@PathVariable("pname") String pname)
	{
		return iserv.sortDesc(pname);
	}
	//pagination
	@GetMapping("/pagination/{pno}/{psize}")
	public List<IplModel> paginationData(@PathVariable("pno") int pno,@PathVariable("psize") int psize)
	{
		return iserv.paginationnData(pno, psize);
	}
	@Autowired
	public IplRepo ir;
	@GetMapping("/saveir")
	public List<IplModel> getDetail()
	{
		return ir.getAllData();
	}
	

}
