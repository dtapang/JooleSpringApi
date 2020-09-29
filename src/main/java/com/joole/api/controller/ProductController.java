package com.joole.api.controller;

import com.joole.api.entity.Product;
import com.joole.api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<?> addNew(@RequestBody Product productRequest){
        productService.addProduct(productRequest);
        return ResponseEntity.ok("New product successfully created!");
    }

    @GetMapping("/list")
    public ResponseEntity<?> listAll(){
        return ResponseEntity.ok(productService.listAll());
    }

    @GetMapping("/category")
    public ResponseEntity<?> listCategories(){
        return ResponseEntity.ok(productService.getCategories());
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<?> listCategories(@PathVariable(name = "category") String category){
        return ResponseEntity.ok(productService.getByCategory(category));
    }

    @GetMapping("/category/{category}/{query}")
    public ResponseEntity<?> searchCategories(@PathVariable(name = "category") String category, @PathVariable(name = "query") String query){
        return ResponseEntity.ok(productService.getByCategorySearch(category, query));
    }

    @GetMapping("/find/{productId}")
    public ResponseEntity<?> listByCategory(@PathVariable Integer productId){
        Product product = productService.getById(productId);
        return ResponseEntity.ok(product);
    }


}
