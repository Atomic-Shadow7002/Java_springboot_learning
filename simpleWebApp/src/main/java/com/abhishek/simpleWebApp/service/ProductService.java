package com.abhishek.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhishek.simpleWebApp.model.Product;
import com.abhishek.simpleWebApp.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // List<Product> products = new ArrayList<>(Arrays.asList(
    // new Product(101, "Iphone", 100000),
    // new Product(102, "Samsung", 20000)));

    public List<Product> getProducts() {

        return repo.findAll();
    }

    public Optional<Product> getProductById(int prodID) {
        return repo.findById(prodID);
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
        repo.deleteById(prodId);
    }
}
