package com.example.productmanagementbackendapp.service;

import com.example.productmanagementbackendapp.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    List<Product> getAllProducts();

    Product insertProductIntoDatabase(Product product);
}