package com.msm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msm.model.Student;
import com.msm.service.StudentService;

@RestController
@RequestMapping
public class StudentController {

	@Autowired
	StudentService studentService;

	@GetMapping("/get/all/students")
	public ResponseEntity<List<Student>> getAllStudents() {

		return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
	}
}
