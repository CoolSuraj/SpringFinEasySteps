package com.suraj.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.suraj.spring.dao.Dao;



@Component
public class Service {
	
	Dao dao;
	
	@Autowired
	public Service(Dao dao) {
		super();
		System.out.println("service Constructor Invoked");
		this.dao = dao;
	}



	public void save() {
		dao.print();
	}
}
