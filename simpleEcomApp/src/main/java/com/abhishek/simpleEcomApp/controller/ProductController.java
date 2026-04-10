package com.abhishek.simpleEcomApp.controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.simpleEcomApp.model.Product;
import com.abhishek.simpleEcomApp.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String greet() {
        return "Welcome to Shadow";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable int id) {
        return service.getProductById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }
}
