package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

}
