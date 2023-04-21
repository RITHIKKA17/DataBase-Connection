package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.BikeModel;
import com.example.demo.Repository.BikeRepo;

@Service
public class BikeService {

	@Autowired
	public BikeRepo brepo;
	public BikeModel saveInfo(BikeModel bmod) {
		return brepo.save(bmod);
	}
}
