package com.example.demo.service;

import java.util.List;

import com.example.demo.Entity.Student;

public interface StudentService {
	public void add(Student student);
	public List<Student> show();
	public void delete();
	

}
