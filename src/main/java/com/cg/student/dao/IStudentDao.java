package com.cg.student.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.student.model.Student;

@Repository
public interface IStudentDao extends JpaRepository<Student, Integer> {
	

	
	

}
