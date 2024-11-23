package com.dev2prod.product.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dev2prod.product.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Long> {
	
	Product findByProductName(String productName);
}
