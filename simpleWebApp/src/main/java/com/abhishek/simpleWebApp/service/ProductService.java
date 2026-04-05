package com.abhishek.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.abhishek.simpleWebApp.model.Product;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 100000),
            new Product(102, "Samsung", 20000)));

    public List<Product> getProducts() {

        return products;
    }

    public Product getprProductById(int prodID) {
        return products.stream().filter(p -> p.getProdID() == prodID).findFirst().get();
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }
}
