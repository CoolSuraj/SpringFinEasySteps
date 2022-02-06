package com.suraj.spring.course.pojo;

/* 3 steps to DI== Dependency Injection
 * 
 * 1. Create the POJO
 * 2. Create the configuration file
 * 3. Create test class 
 *  So far we have learnt how to inject primitive types
 *  Now will see how to inject collection types 
 * */

public class Employee {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
