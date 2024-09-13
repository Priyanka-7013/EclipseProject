package com.student.management.services;

import java.util.List;

import com.student.management.entities.Student;

public interface StudentService {
	String addStudent(Student s1);
	Student searchStudent(int roll);
	String updateStudent(Student s1);
	String deleteStudent(int roll);
	
	List<Student> fetchAllStudents();
	String deleteAllStudents();
}
