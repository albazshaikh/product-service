package com.dev2prod.product.service;

import com.dev2prod.product.entity.Product;
import com.dev2prod.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    
    public Product addProducts(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }
    
    public Product getProduct(String productName) {
    	return productRepository.findByProductName(productName);
    }

}
