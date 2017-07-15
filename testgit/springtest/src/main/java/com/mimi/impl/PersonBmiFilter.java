package com.mimi.impl;

import com.huwei.inter.Filter;
import com.yc.bean.Person;

public class PersonBmiFilter implements Filter {

	@Override
	public boolean doCheck(Object obj) {
		if(  obj==null){
			return false;
		}
		if(   !(obj instanceof Person)){
			return false;
		}
		Person p=(Person)obj;
		
		if( p.getHeight()<0.5||p.getWeight()<3||p.getWeight()>400||p.getHeight()>2.5){
			return false;
		}
		
		return true;
	}

}
