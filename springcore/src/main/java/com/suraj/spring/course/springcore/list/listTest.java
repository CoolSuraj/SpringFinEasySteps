package com.suraj.spring.course.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class listTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/suraj/spring/course/springcore/list/listconfig.xml");
		Hospital bean = (Hospital) context.getBean("Hospital"); //setting the bean object
		System.out.println(bean.getName());
		System.out.println(bean.getDepartments());  //injected List Wohoooo!!!
	}

}
