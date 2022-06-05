package com.suraj.spring.boot.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.suraj.spring.boot.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Long> { //CrudRepository is generic so we changed to entity and ID 

	List<Product> findByName(String name);  //we can write like this and use finderMethods one is implemented in tests file
//	https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#new-features    search for Supported Keywords
}
