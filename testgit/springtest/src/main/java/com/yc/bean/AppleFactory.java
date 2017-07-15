package com.yc.bean;

public class AppleFactory {
	
	private static Apple apple = new Apple();
	
	private AppleFactory() {}
	
	public  Apple createAppleInstance(){
		return apple;
	}
}
