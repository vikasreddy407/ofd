package com.cg.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.student.model.Student;
import com.cg.student.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@GetMapping("/studentlist")
	public List<Student> getStudentList()
	{
		List<Student> lis = service.getStudents();
		return lis;
		
	}
	
	@GetMapping("/getstudent/{id}")
	public Student getStud(@PathVariable("id") int id) {
		Student s = service.getStudent(id);
		return s;
		
	}
	
	
}
