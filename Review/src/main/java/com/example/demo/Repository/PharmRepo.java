package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.PharmModel;

import jakarta.transaction.Transactional;



public interface PharmRepo extends JpaRepository<PharmModel, Integer> {
	@Query(value="select * from Drugs ",nativeQuery=true)
    public List<PharmModel> getAllData();
    
	@Query(value="select * from Drugs where id=:id",nativeQuery=true)
    public List<PharmModel> byId (@Param("id")int id);
	
	@Query(value="select * from Drugs where id between :start and :end",nativeQuery=true)
    public List<PharmModel> startEnd(@Param("start") int start,@Param("end")int end);
	
	 @Modifying
     @Transactional
     @Query(value="delete from Drugs where id=?1 and name=?2",nativeQuery = true)
     Integer deleteD(@Param("id") int pid,@Param ("name") String pname);
	 
	 @Modifying
     @Transactional
     @Query(value="update Drugs set id=:pid where name=:pname",nativeQuery=true)
     public void updateByQuery(@Param ("pid")int pid,@Param ("pname")String pname);
	 
	 @Query("select o from PharmModel o")
	 List<PharmModel> getAll();
	 
	   @Query(value="select c from PharmModel c where c.id=?1")
       public List<PharmModel> jqBYCon(@Param ("id")int sid);
}


