package com.joole.api.service;

import com.joole.api.entity.Product;

import java.util.Set;

public interface ProductService {
    //Create
    void addProduct(Product product);
    //read
    Set<Product> listAll();

    Product getById(Integer id);

    Set<Product> getByCategory(String category);
    Set<String> getCategories();

    Set<Product> getByCategorySearch(String category, String query);
}
