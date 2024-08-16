package com.soham.springboot_search_api.service;

import com.soham.springboot_search_api.entity.Product;

import java.net.URI;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    List<Product> searchProducts(String query);
    Product createProduct(Product product);
}
