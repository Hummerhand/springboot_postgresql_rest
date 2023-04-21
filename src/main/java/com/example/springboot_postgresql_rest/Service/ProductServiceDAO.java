package com.example.springboot_postgresql_rest.Service;

import com.example.springboot_postgresql_rest.Entity.Product;
import com.example.springboot_postgresql_rest.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceDAO implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {

        return productRepository.findAll();
    }

    @Override
    public void saveProduct(Product product) {

        productRepository.save(product);
    }

    @Override
    public Product getProduct(int id) {

        Product product = null;

        Optional<Product> optional = productRepository.findById(id);
        if (optional.isPresent()) {
            product = optional.get();
        }

        return product;
    }

    @Override
    public void deleteProduct(int id) {

        productRepository.deleteById(id);

    }
}
