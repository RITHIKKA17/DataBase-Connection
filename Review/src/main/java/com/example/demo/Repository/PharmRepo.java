package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.PharmModel;

public interface PharmRepo extends JpaRepository<PharmModel, Integer> {

}
