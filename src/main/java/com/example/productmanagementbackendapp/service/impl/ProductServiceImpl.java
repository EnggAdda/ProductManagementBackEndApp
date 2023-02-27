package com.example.productmanagementbackendapp.service.impl;

import com.example.productmanagementbackendapp.entity.Product;
import com.example.productmanagementbackendapp.repository.ProductRepo;
import com.example.productmanagementbackendapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
   @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product insertProductIntoDatabase(Product product) {
        return productRepo.save(product);
    }
}
