package com.example.spring_angular_medium.repository;

import com.example.spring_angular_medium.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
