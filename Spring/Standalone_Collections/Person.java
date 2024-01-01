package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	private List<String> friends;
	private Map<String,Integer> courseId;
	private Properties prop;
	

	public Map<String, Integer> getCourseId() {
		return courseId;
	}

	public void setCourseId(Map<String, Integer> courseId) {
		this.courseId = courseId;
	}

	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", courseId=" + courseId + "]";
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
}
