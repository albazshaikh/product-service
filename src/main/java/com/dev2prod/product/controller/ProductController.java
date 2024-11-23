package com.dev2prod.product.controller;

import com.dev2prod.product.entity.Product;
import com.dev2prod.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
	
    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product){
        return productService.addProducts(product);
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productService.getProducts();
    }
    
    @GetMapping("/product/{productName}")
    public Product getProducts(@PathVariable String productName){
        return productService.getProduct(productName);
    }

    
}
