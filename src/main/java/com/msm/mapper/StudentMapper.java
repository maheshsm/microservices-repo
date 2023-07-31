package com.msm.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

import org.springframework.jdbc.core.RowMapper;

import com.msm.model.Student;

public class StudentMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		
		student.setRollNo(rs.getInt("rollno"));
		student.setFirstName(rs.getString("firstname"));
		student.setMiddleName(rs.getString("middlename"));
		student.setLastName(rs.getString("lastname"));
		student.setObtainedMarks(rs.getInt("obtainedmarks"));
		student.setPercentage(rs.getDouble("percentage"));
		student.setContact(rs.getLong("contact"));
		student.setDateOfBirth(LocalDate.parse(rs.getString("dateofbirth")));
		student.setEmail(rs.getString("email"));
		
		return student;
	}
}
