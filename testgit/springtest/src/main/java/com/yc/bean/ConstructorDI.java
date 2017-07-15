package com.yc.bean;

public class ConstructorDI {
	private int x;
	private String y;

	private Apple apple;

	public ConstructorDI(int x, String y, Apple apple) {
		super();
		this.x = x;
		this.y = y;
		this.apple = apple;
		
		System.out.println("ConstructorDI 的 构造方法...");
	}

	@Override
	public String toString() {
		return "ConstructorDI [x=" + x + ", y=" + y + ", apple=" + apple + "]";
	}

}
