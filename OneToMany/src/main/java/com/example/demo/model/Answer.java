package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Answer {
	@Id
	private int ano;
	private String answer;
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	

}
