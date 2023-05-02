package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Answer;

public interface Answerrepo extends JpaRepository<Answer, Integer> {

}
