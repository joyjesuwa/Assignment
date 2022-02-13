package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Student;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.service.StudentService;
@Service
public class StudentImpl implements StudentService{
@Autowired(required = true)
StudentRepository student_repository;
	@Override
	public void add(Student student) {
		// TODO Auto-generated method stub
		 student_repository.save(student);
	}

	@Override
	public List<Student> show() {
		// TODO Auto-generated method stub
		return student_repository.findAll();
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		student_repository.deleteAll();
	}

}
