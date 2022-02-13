package com.suraj.spring.course.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMap {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/suraj/spring/course/springcore/map/mapConfig.xml");
		Customer customer = (Customer) applicationContext.getBean("Customer");
		System.out.println("customer "+customer);
	}
}
