package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.IplModel;
import com.example.demo.Repository.IplRepo;

@Service
public class IplService {
	@Autowired
	public IplRepo irepo;
	public IplModel saveInfo(IplModel im)
	{
		return irepo.save(im);
	}
	public List <IplModel> getInfo(){
		return irepo.findAll();
	}
	public IplModel UpdateInfo(IplModel io)
	{
		return irepo.saveAndFlush(io);
	}
	public void deleteInfo(int playerId)
	{
		irepo.deleteById(playerId);
	}
	//sorting
	public List<IplModel> sortDesc(String pname)
	{
		return irepo.findAll(Sort.by(pname).descending());
	}
	//Pagination
	public List<IplModel> paginationnData(int pageno, int pageSize)
	{
		Page<IplModel> p=irepo.findAll(PageRequest.of(pageno, pageSize));
		return p.getContent();
	}

}
