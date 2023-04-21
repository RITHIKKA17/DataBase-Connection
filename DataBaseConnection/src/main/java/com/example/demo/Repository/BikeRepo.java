package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.BikeModel;

public interface BikeRepo extends JpaRepository<BikeModel, Integer> {

}
