package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.IplModel;

public interface IplRepo extends JpaRepository<IplModel, Integer> {

}
