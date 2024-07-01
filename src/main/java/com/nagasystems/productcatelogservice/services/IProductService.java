package com.nagasystems.productcatelogservice.services;

import com.nagasystems.productcatelogservice.models.Product;

import java.util.List;

public interface IProductService {
    Product getProductById(Long id);

    List<Product> getAllProducts();

    Product createProduct(Product product);
}
