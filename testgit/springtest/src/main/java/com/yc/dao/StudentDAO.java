package com.yc.dao;

import com.yc.bean.Student;

public interface StudentDAO {
	
	public void addStudent(Student student);
	
	public boolean isStudentExist(Student student);
}
