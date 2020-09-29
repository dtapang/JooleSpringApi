package com.joole.api.repository;

import com.joole.api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    Set<Product> getAllBy();

    @Query("select p from Product p where p.category=:categoryStr and p.manufacturer LIKE %:queryStr% ")
    Set<Product> getProductsByCategoryAndManufacturerLike(@Param("categoryStr") String category,@Param("queryStr") String query);

    //select * from joole.product where category='mechanical' and manufacturer like '%S%';

    @Query("select distinct category from Product ")
    Set<String> getAllCategories();

    Set<Product> getProductsByCategory(String category);
}