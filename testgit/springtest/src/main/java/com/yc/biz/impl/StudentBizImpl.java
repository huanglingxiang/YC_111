package com.yc.biz.impl;

import com.yc.bean.Student;
import com.yc.biz.StudentBiz;
import com.yc.dao.StudentDAO;

public class StudentBizImpl implements StudentBiz {
	
	private StudentDAO studentDAO;
	
	public StudentBizImpl() {
		System.out.println(" student类 业务对象构造方法...");
	}
	
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
		System.out.println(" spring还偷偷的把studnetDAO对象注入到studentBizImpl中.....");
	}

	@Override
	public void addStudent(Student student) {
		if( studentDAO.isStudentExist(student) ){
			throw new RuntimeException(" 小学生已经存在，不能添加...");
		}
		studentDAO.addStudent(student);
	}

	@Override
	public boolean isStudentExist(Student student) {

		return false;
	}

}
