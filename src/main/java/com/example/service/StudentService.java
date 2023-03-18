package com.example.service;

import java.util.List;

import com.example.entity.Student;

public interface StudentService {
   public List<Student> getAllStudents();
   
   public Student getStudentById(long sid);
   
   public Student addStudent(Student s);
   
   public Student updateStudent(Student s);
   
   public void deleteStudentById(long sid);
}
