package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	//sorting
	public List<PharmModel> sortDesc(String pname)
	{
		return prepo.findAll(Sort.by(pname).descending());
	}
	public List<PharmModel> sortAsc(String pname)
	{
		return prepo.findAll(Sort.by(pname).ascending());
	}
	//Pagination
	public List<PharmModel> paginationnData(int pageno, int pageSize)
	{
		Page<PharmModel> p=prepo.findAll(PageRequest.of(pageno, pageSize));
		return p.getContent();
	}
	public List<PharmModel> paginationAndSorting(int pageno,int pageSize,String pname)
	{
		Page<PharmModel> p=prepo.findAll(PageRequest.of(pageno, pageSize,Sort.by(pname).descending()));
		return p.getContent();
	}


}
