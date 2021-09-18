package com.cg.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cg.student.dao.IStudentDao;
import com.cg.student.model.Student;
@Service
public class StudentService {
	@Autowired
    IStudentDao dao ;
	public List<Student> getStudents(){
		List<Student> lis = dao.findAll();
		return lis;
		
	}
public Student getStudent(int id) {
	Optional<Student> opt = dao.findById(id);
	Student s = opt.get();
	return s;
	
	
}

}
