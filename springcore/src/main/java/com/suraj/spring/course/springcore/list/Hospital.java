package com.suraj.spring.course.springcore.list;

import java.util.List;

public class Hospital {

	String name;
	private List<String> departments;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getDepartments() {
		return departments;
	}

	public void setDepartments(List<String> departments) {
		this.departments = departments;
	}

}
