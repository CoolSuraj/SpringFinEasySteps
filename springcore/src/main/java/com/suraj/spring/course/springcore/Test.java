package com.suraj.spring.course.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suraj.spring.course.pojo.Employee;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml"); // config.xml is in
		// source folder so we can directly write name else we need to give path with
		// '/'
		Employee emp = (Employee) ctx.getBean("emp"); // casting to employee
		System.out.println("Employee ID "+emp.getId());
		System.out.println("Employee Name "+emp.getName());
	}

}
