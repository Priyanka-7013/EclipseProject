package com.student.management.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NavigationController {
	@GetMapping("/openAddStudPage")
	public String openAddStudPage() {
		return "addStudent";
	}
	@GetMapping("/openUpdateStudPage")
	public String openUpdateStudPage() {
		return "updateStudent";
	}
	@GetMapping("/openDeleteStudPage")
	public String openDeleteStudPage() {
		return "deleteStudent";
	}
	@GetMapping("/openSearchStudPage")
	public String openSearchStudPage() {
		return "searchStudent";
	}
	

}
