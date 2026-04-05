package com.abhishek.simpleWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhishek.simpleWebApp.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
