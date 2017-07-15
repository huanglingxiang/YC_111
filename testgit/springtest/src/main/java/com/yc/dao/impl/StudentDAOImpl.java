package com.yc.dao.impl;

import java.util.Random;

import com.yc.bean.Student;
import com.yc.dao.StudentDAO;

public class StudentDAOImpl implements StudentDAO {

	
	public StudentDAOImpl() {
		System.out.println(" student类DAO对象构造方法...");
	}

	@Override
	public void addStudent(Student student) {
		System.out.println(" 带DAO中添加了  "+ student);
	}

	@Override
	public boolean isStudentExist(Student student) {
		Random ran = new Random();
		return ran.nextBoolean();
	}

}
