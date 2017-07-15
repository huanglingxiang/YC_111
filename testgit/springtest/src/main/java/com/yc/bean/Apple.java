package com.yc.bean;

import java.util.Random;

public class Apple {
	private int id;

	public Apple() {
		super();
		System.out.println( "Apple 的构造方法...");
	}

	public int getId() {
		Random rd = new Random();
		return rd.nextInt(99999);
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + "]";
	}
	
	
}
