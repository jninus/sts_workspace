package com.reda.spring.data;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.reda.spring.data.entities.Product;
import com.reda.spring.data.repos.ProductRepository;

@SpringBootTest
class SpringdatajpaApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void getProduct() {
		Product p = new Product();
		p.setId(5L);
		p.setDescription("New Product arrival");
		p.setPrice(1200d);
		p.setName("MacR");

		ProductRepository productRepository = context.getBean(ProductRepository.class);

		List<Product> products = productRepository.findByName("Iphone");
		List<Product> products2 = productRepository.findByPrice(4000);
		List<Product> products3 = productRepository.findByNameAndPrice("Macbook", 123);

		System.out.println(products3);

	}

}
