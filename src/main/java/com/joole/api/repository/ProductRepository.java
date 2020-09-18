package com.joole.api.repository;

import com.joole.api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Set<Product> getAllBy();


    @Query("select distinct type from Product ")
    Set<String> getAllCategories();

    Set<Product> getProductsByType(String category);
}