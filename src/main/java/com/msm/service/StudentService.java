package com.msm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msm.dao.StudentDao;
import com.msm.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao studentDao;
	
	public List<Student> getAllStudents() {
		
		return studentDao.getAllStudents();		
	}
}
