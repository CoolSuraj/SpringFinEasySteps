package com.suraj.spring.course.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class setTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/suraj/spring/course/springcore/set/setConfig.xml");
		CarDealer bean = (CarDealer) context.getBean("CarDealer"); //setting the bean object
		System.out.println(bean.getName());
		System.out.println(bean.getModels());  //injected set Wohoooo!!!
		System.out.println(bean.getModels().getClass());
		
	}

}
