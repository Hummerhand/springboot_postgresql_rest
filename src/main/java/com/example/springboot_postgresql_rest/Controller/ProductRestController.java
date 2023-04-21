package com.example.springboot_postgresql_rest.Controller;

import com.example.springboot_postgresql_rest.Entity.Product;
import com.example.springboot_postgresql_rest.Service.ProductServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductRestController {

    @Autowired
    private ProductServiceDAO productServiceDAO;


    @GetMapping("/products")
    public List<Product> allProducts() {

        List<Product> productList = productServiceDAO.getAllProducts();

        return productList;
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id) {

        Product product = productServiceDAO.getProduct(id);

        return product;
    }


    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product) {

        productServiceDAO.saveProduct(product);

        return product;
    }

    @PutMapping("/products")
    public Product updateProduct(@RequestBody Product product) {

        productServiceDAO.saveProduct(product);

        return product;
    }

    public String deleteProductById(@PathVariable int id) {

        productServiceDAO.deleteProduct(id);

        return "Product with ID " + id + " was deleted";
    }




}
