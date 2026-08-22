package com.caio.amazon.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caio.amazon.catalog.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
  
}
