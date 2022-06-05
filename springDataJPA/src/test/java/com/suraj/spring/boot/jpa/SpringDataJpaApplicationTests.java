package com.suraj.spring.boot.jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.suraj.spring.boot.entity.Product;
import com.suraj.spring.boot.repos.ProductRepo;

@SpringBootTest
class SpringDataJpaApplicationTests {
	
//	@Autowired
//	ApplicationContext context;
	
	@Autowired
	ProductRepo repo;
	
	@Test
	public void saveProduct() {
		Product product = new Product();
		product.setId(3L); //L to indicate Long value
		product.setName("Abhus");
		product.setDescription("Not Mucsh");
		product.setPrice(599.3);
		
		repo.save(product);
	}

	@Test
	void contextLoads() {
	}

}
