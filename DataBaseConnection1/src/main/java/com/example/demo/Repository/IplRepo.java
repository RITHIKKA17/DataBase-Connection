package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.IplModel;
@Repository

public interface IplRepo extends JpaRepository<IplModel, Integer> {
	@Query(value="select * from IPL", nativeQuery = true)
	public List<IplModel> getAllData();
	
	@Query(value="select * fro IPL where playerId between :start and :end", nativeQuery = true)
	List<IplModel> startEnd(@Param("start")int start , @Param("end")int end);
	
}
