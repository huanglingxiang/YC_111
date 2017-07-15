package com.yc.bean;

import java.util.Properties;

public class Myproperties extends Properties {
	
	private static Myproperties mp;
	
	private Myproperties(){}
	
	public static Myproperties getInstance(){
		if( mp == null){
			mp = new Myproperties();
		}
		return mp;
	}
}
