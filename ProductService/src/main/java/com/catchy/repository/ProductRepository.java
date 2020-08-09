package com.catchy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catchy.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
