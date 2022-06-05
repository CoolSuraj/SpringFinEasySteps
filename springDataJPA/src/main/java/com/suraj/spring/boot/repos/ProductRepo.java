package com.suraj.spring.boot.repos;

import org.springframework.data.repository.CrudRepository;

import com.suraj.spring.boot.entity.Product;

public interface ProductRepo extends CrudRepository<Product, Long> { //CrudRepository is generic so we changed to entity and ID 

}
