package com.joole.api.service.impl;

import com.joole.api.entity.Product;
import com.joole.api.repository.ProductRepository;
import com.joole.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productDao;

    @Override
    public void addProduct(Product product) {
        productDao.save(product);
    }

    @Override
    public Set<Product> listAll() {
        return productDao.getAllBy();
    }

    @Override
    public Product getById(Integer id) {
        Optional<Product> product = productDao.findById(id);
        if(product.isPresent())
            return product.get();
        return null;
    }

    @Override
    public Set<Product> getByCategory(String category) {
        return productDao.getProductsByCategory(category);
    }

    @Override
    public Set<String> getCategories() {
        return productDao.getAllCategories();
    }

    @Override
    public Set<Product> getByCategorySearch(String category, String query) {


        return productDao.getProductsByCategoryAndManufacturerLike(category,query);
    }
}
