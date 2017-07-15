package com.yc.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionBean {
	private List<String> list = new ArrayList<String>();
	
	private Map<String,String> map = new HashMap<String,String>();
	
	private Set<String> set = new HashSet<String>();
	
	private Properties properties = new Properties();

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "CollectionBean [list=" + list + ", map=" + map + ", set=" + set + ", properties=" + properties + "]";
	}
	
	
}
