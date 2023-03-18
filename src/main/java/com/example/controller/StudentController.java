package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
    
	@GetMapping("/students")
	public List<Student> getAllStudents() {

		return studentService.getAllStudents();
	}
    
	@GetMapping("/students/{sid}")
	public Student getStudentById(@PathVariable String sid) {

		return studentService.getStudentById(Long.parseLong(sid));
	}
    
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student s) {

		return studentService.addStudent(s);
	}
    
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student s) {

		return studentService.updateStudent(s);
	}

	@DeleteMapping("/students/{sid}")
	public ResponseEntity<HttpStatus> deleteStudentById(@PathVariable String sid) {
		try {
			studentService.deleteStudentById(Long.parseLong(sid));
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		
	}
}
