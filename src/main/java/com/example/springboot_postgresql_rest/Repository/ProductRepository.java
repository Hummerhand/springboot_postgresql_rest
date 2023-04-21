package com.example.springboot_postgresql_rest.Repository;

import com.example.springboot_postgresql_rest.Entity.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
