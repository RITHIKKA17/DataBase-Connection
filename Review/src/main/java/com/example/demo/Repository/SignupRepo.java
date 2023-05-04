package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.SignupModel;

public interface SignupRepo extends JpaRepository<SignupModel, Integer> {
	SignupModel findByusername(String username);

}
