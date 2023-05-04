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
import com.example.demo.Repository.PharmRepo;
import com.example.demo.Service.PharmService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class PharmController {
	@Autowired
	public PharmService pserv;
	@Tag( name="Post",description="Posting details")
	@PostMapping("/savePharm")
	public PharmModel addDetails(@RequestBody PharmModel phm)
	{
		return pserv.saveInfo(phm);
	}
	@Tag( name="Get",description="Getting details")
	@GetMapping("/getPharm")
	public List <PharmModel> getDetails(){
		return pserv.getInfo();
	}
	@Tag( name="Update",description="Updating details")
	@PutMapping("/updatePharm")
	public PharmModel display(@RequestBody PharmModel pm)
	{
		return pserv.UpdateInfo(pm);
	}
	@Tag( name="Delete-1",description="Deleting details by Pathvariable")
	@DeleteMapping("/deletePharm/{id}")
	public String deleteDetails(@PathVariable int id)
	{
		pserv.deleteInfo(id);
		return "Id "+id+" deleted";
	}
	@Tag( name="Delete-2",description="Deleting details by RequestParam")
	@DeleteMapping("/del")
	public String deleteByParams(@RequestParam int id)
	{
		pserv.deleteInfo(id);
		return "Id "+id+" deleted";
	}
	@Tag( name="Sort-descending",description="Sorting details in descending order")
	@GetMapping("/sortDes/{pname}")
	public List<PharmModel> sortPlayer(@PathVariable("pname") String pname)
	{
		return pserv.sortDesc(pname);
	}
	@Tag( name="Sort-ascending",description="Sorting details in ascending order")
	@GetMapping("/sortAsc/{pname}")
	public List<PharmModel> sort(@PathVariable("pname") String pname)
	{
		return pserv.sortAsc(pname);
	}
	//pagination
	@Tag( name="Pagination",description="Pagination details")
	@GetMapping("/pagination/{pno}/{psize}")
	public List<PharmModel> paginationData(@PathVariable("pno") int pno,@PathVariable("psize") int psize)
	{
		return pserv.paginationnData(pno, psize);
	}
	@Tag( name="Pagination and Sorting",description="Pagination and sorting details")
	@GetMapping("/paginationsort/{pno}/{psize}/{pname}")
	public List<PharmModel>paginationAndSorting(@PathVariable("pno")int pno,@PathVariable("psize")int psize,@PathVariable("pname")String pname)
	{
		return pserv.paginationAndSorting(pno,psize,pname);
		
	}
	//queries
	@Autowired
	public PharmRepo ir;

	@Tag( name="Native query-1",description="Getting details")
	@GetMapping("/saveir")
	public List<PharmModel> getD()
	{
		return ir.getAllData();
	}

	@Tag( name="Native query-2",description="Getting details by id")
	@GetMapping("byName/{id}")
	public List<PharmModel> getName(@PathVariable ("id") int pid )
	{
		return ir.byId(pid);
	}
	
	@Tag( name="Native query-3",description="Getting details by start end method")
	@GetMapping("startend/{start}/{end}")
	public List<PharmModel> getStart(@PathVariable ("start")int start,@PathVariable ("end")int end)
	{
		return ir.startEnd(start, end);
	}
	
	@Tag( name="Native query-4",description="Deleting details by id and name")
	@DeleteMapping("/del/{id}/{name}")
	public String delD(@PathVariable ("id") int id,@PathVariable ("name")String name)
	{
		ir.deleteD(id, name);
		return "deleted";
	}
	
	@Tag( name="Native query-5",description="Posting details")
	@PutMapping("updatee/{pid}/{pname}")
	public void updateQue(@PathVariable("pid")int pid,@PathVariable("pname") String pname)
	{
		ir.updateByQuery(pid, pname);
	}
	
	@Tag( name="JPQL-1",description="Getting details by methods")
	@GetMapping("/getAll")
	public List<PharmModel> getAllDetails()
	{
		return ir.getAll();
	}
	
	@Tag( name="JPQL-2",description="Getting details by id")
	@GetMapping("/upp/{id}")
	public List<PharmModel> jpqUp(@PathVariable ("id") int id)
	{
		return ir.jqBYCon(id);
	}
}
