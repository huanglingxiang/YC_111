package com.yc.bean;

public class Product {
	private Integer pid;
	private String name;

	public Product(Integer pid, String name) {
		super();
		this.pid = pid;
		this.name = name;
	}

	public Product() {
		super();
		System.out.println("product的无参构造方法.....");
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + "]";
	}

}
