package com.spring.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.exceptions.RequestNotFoundException;
import com.spring.rest.model.Student;

@RestController
@RequestMapping("/api")
public class ApiController {
	
	// dummy function to get a list of students
	public List<Student> getStudentList() {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student("Rudra", "Mishra", "rn@gmail.com"));
		students.add(new Student("Rohini", "Dubey", "rd@gmail.com"));
		students.add(new Student("Rekha", "Bond", "rb@gmail.com"));
		return students;
	}
	
	@GetMapping("/getStudents")
	public List<Student> getStudents() {
		return getStudentList();
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable Integer studentId) {
		if(studentId >= getStudentList().size() || studentId < 0) {
			throw new RequestNotFoundException("StudentId is invalid. Student Id provided is: " + studentId.toString());
		}
		return getStudentList().get(studentId);
	}
	
}
