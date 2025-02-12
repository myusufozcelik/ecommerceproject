package com.ozcelik.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.ozcelik.ecommerce.entity.Product;

@CrossOrigin("http://localhost:4200")
public interface ProductRepo extends JpaRepository<Product, Long> {
}
