package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;

@RestController
public class HomeController {

	@Autowired
	StudentRepo repo;
	
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@PostMapping("/student")
	public Student addStudent(Student student) {
		repo.save(student);
		return student;
	}
	
	
	@GetMapping("/students")
	public Iterable<Student> getStudents() {
		return repo.findAll();
	}
	
	@GetMapping("/student/{sid}")
	public Optional<Student> getStudent(@PathVariable("sid") int sid) {
		return repo.findById(sid);
	}
	
	@DeleteMapping("/student/{sid}")
	public String deleteStudent(@PathVariable("sid") int sid) {
		Student s = repo.getOne(sid);
		repo.delete(s);
		return "deleted";
	}
	
	@PutMapping("/student")
	public Student updateStudent(Student student) {
		repo.save(student);
		return student;
	}
}
