
package com.yc.bean;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -7322483345047190139L;
	
	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}