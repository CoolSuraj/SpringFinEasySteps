package com.suraj.spring.boot.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suraj.spring.boot.repos.ProductRepo;

@RestController
@RequestMapping("/products")
public class ProductRestController {  //this class will acts as Restful End point for our application
		
	@Autowired
	ProductRepo repo;
	
	
	
}
