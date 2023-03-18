package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(long sid) {
		
		return studentRepository.findById(sid).orElse(null);
	}

	@Override
	public Student addStudent(Student s) {
		
		return studentRepository.save(s);
	}

	@Override
	public Student updateStudent(Student s) {
		
		return studentRepository.save(s);
	}

	@Override
	public void deleteStudentById(long sid) {
		Student s=studentRepository.getReferenceById(sid);
		studentRepository.delete(s);
		
	}

	
    
}
