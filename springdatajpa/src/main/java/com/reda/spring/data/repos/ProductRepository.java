package com.reda.spring.data.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.reda.spring.data.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {

	List<Product> findByName(String name);

	List<Product> findByPrice(double price);

	List<Product> findByNameAndPrice(String name, double price);

}
