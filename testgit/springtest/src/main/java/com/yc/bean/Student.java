package com.yc.bean;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = -1351827268623354614L;

	private int id;
	private String sname;

	public Student() {
		System.out.println(" Student 构造方法...");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + "]";
	}

}
