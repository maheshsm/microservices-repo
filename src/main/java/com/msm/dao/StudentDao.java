package com.msm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.msm.mapper.StudentMapper;
import com.msm.model.Student;

@Repository
public class StudentDao {

	@Autowired
	JdbcTemplate namedParameterJdbcTemplate;
	
	public List<Student> getAllStudents() {

		String GET_ALL_STUDENTS = "select * from student";
		
		List<Student> students = namedParameterJdbcTemplate.query(GET_ALL_STUDENTS, new StudentMapper());
		
		return students;
	}
}
