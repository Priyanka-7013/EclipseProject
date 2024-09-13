package com.student.management.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.management.entities.Student;
import com.student.management.services.StudentService;

@Controller
public class StudentController {
//	@GetMapping("/hello")
//	public String sayHello() {
//		return "Hello from spring boot!";
//	}
//	@GetMapping("/bye")
//	public String sayBye() {
//		return "Bye from spring boot!";
//	}
//	@GetMapping("/hi")
//	public String hiPiku() {
//		return "Say hi to Piku!";
//	}
//	@GetMapping("/data/{data}")
//	public String acceptData(@PathVariable String data) {
//		return "Data Received:"+data;
//	}
//	@GetMapping("/data2")
//	public String acceptValues(@RequestParam String d1,@RequestParam String d2) {
//		return "Data Received:"+d1+","+d2;
//	}
//      @GetMapping("/accept")
//	public String acceptStudent(
//			@RequestParam int roll,
//			@RequestParam String name,
//			@RequestParam String branch,
//			@RequestParam int yop,
//	    	@RequestParam double cgpa
//			) {
//    	  Student s1= new Student(roll, name, branch, yop, cgpa);
//    	  System.out.println(s1);
//		return "student data received";
//	}
	
	  @Autowired
	  StudentService service;
	  
      @PostMapping("/addStudentObj")
  	public String addStudent(@ModelAttribute Student s1) {
    	  service.addStudent(s1);
  		return "index";
  	}
//      @GetMapping("/searchStudent")
//      public Student searchStudent(@RequestParam int roll) {
//    	  return service.searchStudent(roll);
//      }
      @GetMapping("/searchStudent")
      public String searchStudent(@RequestParam int roll,Model model) {
    	  Student s1= service.searchStudent(roll);
    	  model.addAttribute("student", s1);
    	  
    	  return "displayStudent";
      }
      @PostMapping("/updateStudentObj")
    	public String updateStudent(@ModelAttribute Student s1) {
      	  service.updateStudent(s1);
    		return "index";
    	}
      @GetMapping("/deleteStudentObj")
  	public String deleteStudent(@RequestParam int roll) {
    	  service.deleteStudent(roll);
  		return "index";
  	}
//      @GetMapping("/fetchAllStu")
//      public List<Student> fetchAllStudents(){
//    	  return service.fetchAllStudents();
//      }
      @GetMapping("/fetchAllStu")
      public String  fetchAllStudents(Model model){
      List<Student>sList =service.fetchAllStudents();
      model.addAttribute("studentList", sList);
  	  return "displayAllStudent";
    }
      
      @GetMapping("/deleteAllStu")
      public String deleteAllStudents(){
    	  service.deleteAllStudents();
    	  return "index";
      }

}
