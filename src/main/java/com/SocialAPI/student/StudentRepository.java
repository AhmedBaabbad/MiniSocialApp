package com.SocialAPI.student;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StudentRepository extends CrudRepository <Student, String> {
	
	public Optional<Student> findById(String id);
	
	 @Query("SELECT t.name FROM Student t where t.id=:id")
	public Optional <String> findNameById(@Param ("id") String id);
	
	//@Query("SELECT * FROM Student t where t.id = ?1 AND t.department = ?2")
	//public Optional<Student> findByNameAndDepartment(String name, String department);
	
	//@Query("SELECT * FROM Student t where t.name = %?1%")
	//public Optional<Student> findByCriteria(String criteria);
	
	// to return list of objects through * by using Id
	/*@Query("SELECT * FROM Student t where t.id = :id")
	public Optional<Student> findById(@Param("id")String id);*/ 

}
