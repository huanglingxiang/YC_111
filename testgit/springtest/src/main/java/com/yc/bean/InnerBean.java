package com.yc.bean;

public class InnerBean {

	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "InnerBean [student=" + student + "]";
	}

}
