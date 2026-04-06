package com.abhishek.simpleEcomApp.service;

import org.springframework.stereotype.Service;
import java.util.List;

import com.abhishek.simpleEcomApp.model.Product;
import com.abhishek.simpleEcomApp.repo.ProductRepo;

@Service
public class ProductService {

    private ProductRepo repo;

    public ProductService(ProductRepo repo) {
        this.repo = repo;
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }
}
