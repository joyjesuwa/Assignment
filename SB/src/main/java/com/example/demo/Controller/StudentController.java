package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Student;
import com.example.demo.ServiceImpl.StudentImpl;

@RestController
public class StudentController {
	@Autowired
	StudentImpl student_impl;
	@PostMapping("/add")
	public void  add(@RequestBody Student student) {
	student_impl.add(student);
	}
	@GetMapping("/display")
	public  List<Student> display(){
		return student_impl.show();
	}
	@DeleteMapping("/delete")
	public void delete() {
		student_impl.delete();
		
	}

}
