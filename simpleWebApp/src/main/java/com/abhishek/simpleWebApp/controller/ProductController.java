package com.abhishek.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.simpleWebApp.model.Product;
import com.abhishek.simpleWebApp.service.ProductService;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping("/products/{prodID}")
    public Product getProductByID(@PathVariable int prodID) {
        return service.getprProductById(prodID);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        System.out.println(prod);
        service.addProduct(prod);
    }
}
