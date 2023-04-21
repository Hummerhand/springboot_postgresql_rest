package com.example.springboot_postgresql_rest.Service;

import com.example.springboot_postgresql_rest.Entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();

    public void saveProduct(Product product);

    public Product getProduct(int id);

    public void deleteProduct(int id);

}
