package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.BikeModel;
import com.example.demo.Service.BikeService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
public class BikeController {
	@Autowired
	public BikeService bserv;
	@Tag(name="Post",description="Posting details")
	@PostMapping("/savebike")
	public BikeModel addDetails(@RequestBody BikeModel bobj) {
		return bserv.saveInfo(bobj);
	}

}
